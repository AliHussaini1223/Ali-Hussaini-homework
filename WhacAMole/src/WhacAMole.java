import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class WhacAMole {
    
    int boardWidth = 600;
    int boardHeigth = 650;
    
    JFrame frame = new JFrame("Mario : Whac A Mole");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();
    
    JButton[] buttons = new JButton[9];
    ImageIcon moleIcon;
    ImageIcon plantIcon;
    
    JButton currMoleTile;
    JButton currPlantTile;
    
    Random random = new Random();
    
    Timer setMoleTimer;
    Timer setPlantTimer;
    
    int score = 0;
    
    WhacAMole(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(boardWidth, boardHeigth);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        
        textLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Score: 0");
        textLabel.setOpaque(true);
        
        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);
        
        buttonsPanel.setLayout(new GridLayout(3, 3));
        frame.add(buttonsPanel);
        
        Image plantImg = new ImageIcon(getClass().getResource("./piranha.png")).getImage();
        plantIcon = new ImageIcon(plantImg.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
        
        Image moleImg = new ImageIcon(getClass().getResource("./monty.png")).getImage();
        moleIcon = new ImageIcon(moleImg.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
        
        score = 0;
        for(int i = 0; i < 9; i++)
        {
            JButton button = new JButton();
            buttons[i] = button;
            button.setFocusable(false);
            buttonsPanel.add(button);
            
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton buttonClicked = (JButton) e.getSource();
                    if(buttonClicked == currMoleTile)
                    {
                        score += 10;
                        textLabel.setText("Score: "+String.valueOf(score));
                    }
                    else if(buttonClicked == currPlantTile)
                    {
                        textLabel.setText("Game Over: "+String.valueOf(score));
                        setMoleTimer.stop();
                        setPlantTimer.stop();
                        for(int i = 0; i < 9; i++)
                        {
                            buttons[i].setEnabled(false);
                        }
                    }
                }
            });
        }
        
        setMoleTimer = new Timer(900, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currMoleTile != null)
                {
                    currMoleTile.setIcon(null);
                    currMoleTile = null;
                }
                
                int num = random.nextInt(9);
                JButton button = buttons[num];
                
                if(currPlantTile == button) return;
                
                currMoleTile = button;
                currMoleTile.setIcon(moleIcon);
            }
        });
        
        setPlantTimer = new Timer(1350, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currPlantTile != null)
                {
                    currPlantTile.setIcon(null);
                    currPlantTile = null;
                }
                
                int num = random.nextInt(9);
                JButton button = buttons[num];
                
                if(currMoleTile == button)  return;
                
                currPlantTile = button;
                currPlantTile.setIcon(plantIcon);
            }
        });
        
        setMoleTimer.start();
        setPlantTimer.start();
        frame.setVisible(true);
    }
}
