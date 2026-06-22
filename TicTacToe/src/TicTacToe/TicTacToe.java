package TicTacToe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TicTacToe {
    
    int boardWidth = 600;
    int boardHeight = 650;
    
    JFrame frame = new JFrame("Tic-Tac-Toe");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();
    
    JButton[][] buttons = new JButton[3][3];
    String playerX = "X";
    String playerO = "O";
    String currentPlayer = playerX;
    
    boolean gameOver = false;
    int turns = 0;
    
    TicTacToe(){
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        textLabel.setBackground(Color.darkGray);
        textLabel.setForeground(Color.white);
        textLabel.setFont(new Font("Arial", Font.BOLD, 50));
        textLabel.setText("Tic-Tac-Toe");
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        
        textPanel.setLayout(new BorderLayout());
        textPanel.setBackground(Color.darkGray);
        textPanel.add(textLabel);
        frame.add(textPanel, BorderLayout.NORTH);
        
        boardPanel.setLayout(new GridLayout(3, 3));
        frame.add(boardPanel);
        
        
        for(int r = 0; r < 3; r++)
        {
            for(int c = 0; c < 3; c++)
            {
                JButton button = new JButton();
                buttons[r][c] = button;
                button.setFocusable(false);
                boardPanel.add(button);
                
                button.setBackground(Color.darkGray);
                button.setForeground(Color.white);
                button.setFont(new Font("Arial", Font.BOLD, 120));
                
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(gameOver)
                        {
                            return;
                        }
                        JButton button = (JButton) e.getSource();
                        if(button.getText() == "")
                        {
                            button.setText(currentPlayer);
                            turns++;
                            checkGameOver();
                            if(!gameOver)
                            {
                                currentPlayer = currentPlayer == playerX ? playerO : playerX;
                                textLabel.setText(currentPlayer + " 's turn: ");
                            }
                        }
                    }
                });
            }
        }
    }
    void checkGameOver(){
        // Horizontally
        for(int r = 0; r < 3; r++)
        {
            if(buttons[r][0].getText() == "")              // 1 2 3
            {                                              // 4 5 6
                continue;                                  // 7 8 9
            }
            if(buttons[r][0].getText() == buttons[r][1].getText() 
                 && buttons[r][1].getText() == buttons[r][2].getText())
            {
                for(int c = 0; c < 3; c++)
                {
                    setWinner(buttons[r][c]);
                }
                gameOver = true;
                return;
            }
            
        }
        // Vertically
        for(int c = 0; c < 3; c++)
        {
            if(buttons[0][c].getText() == "")
            {
                continue;
            }
            if(buttons[0][c].getText() == buttons[1][c].getText() &&
                    buttons[1][c].getText() == buttons[2][c].getText())
            {
                for(int r = 0; r < 3; r++)
                {
                    setWinner(buttons[r][c]);
                }
                gameOver = true;
                return;
            }
        }
        
        // diagnolly
        
        if(buttons[0][0].getText() == buttons[1][1].getText() &&
              buttons[1][1].getText() == buttons[2][2].getText() && buttons[0][0].getText() != "")
        {
            for(int i = 0; i < 3; i++)
            {
                setWinner(buttons[i][i]);
            }
            gameOver = true;
            return;
        }
        
        // anti diagnolly
        
        if(buttons[0][2].getText() == buttons[1][1].getText() &&
                buttons[1][1].getText() == buttons[2][0].getText() && buttons[0][2].getText() != "")
        {
            setWinner(buttons[0][2]);
            setWinner(buttons[1][1]);
            setWinner(buttons[2][0]);
            gameOver = true;
            return;
        }
        
        if(turns == 9)
        {
            for(int r = 0; r < 3; r++)
            {
                for(int c = 0; c < 3; c++)
                {
                    setTie(buttons[r][c]);
                }
            }
            gameOver = true;
        }
    }
    void setWinner(JButton button){
        button.setForeground(Color.green);
        button.setBackground(Color.gray);
        textLabel.setText(currentPlayer + " is the winner!");
    }
    
    void setTie(JButton button){
        button.setForeground(Color.orange);
        button.setBackground(Color.gray);
        textLabel.setText("Tie!");
    }
}
