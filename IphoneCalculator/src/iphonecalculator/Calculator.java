package iphonecalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Calculator {
 
        Color customLightGray = new Color(212, 212, 210);
        Color customDarkGray = new Color(80, 80, 80);
        Color customBlack = new Color(28, 28, 28);
        Color customOrange = new Color(255, 149, 0);
        
        String[] buttonValues = {
          "AC", "+/-", "%", "/",
          "7", "8" , "9", "*",
          "4", "5", "6", "-",
          "1", "2", "3", "+",
          "0", ".", "sqrt", "="
        };
        String[] topButtons = {
            "AC", "+/-", "%"
        };
        String[] rightButtons = {
            "+", "-", "*", "/", "="
        };
        
        JFrame frame = new JFrame("Calculator");
        JLabel displayLabel = new JLabel();
        JPanel displayPanel = new JPanel();
        JPanel buttonsPanel = new JPanel();
        
        String A = "0";
        String operator = null;
        String B = null;
        
        Calculator(){
            frame.setSize(360, 540);
            
            frame.setResizable(false);
            frame.setLayout(new BorderLayout());
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            displayLabel.setBackground(customBlack);
            displayLabel.setForeground(Color.white);
            displayLabel.setFont(new Font("Arial", Font.PLAIN, 50));
            displayLabel.setHorizontalAlignment(JLabel.RIGHT);
            displayLabel.setText("0");
            displayLabel.setOpaque(true);
            displayPanel.setLayout(new BorderLayout());
            displayPanel.add(displayLabel);
            frame.add(displayPanel, BorderLayout.NORTH);
            
            buttonsPanel.setBackground(customBlack);
            buttonsPanel.setLayout(new GridLayout(5, 4));
            
            for(int i = 0; i < buttonValues.length; i++){
                JButton button = new JButton();
                String buttonValue = buttonValues[i];
                button.setFont(new Font("Arial", Font.PLAIN, 30));
                button.setText(buttonValue);
                button.setFocusable(false);
                buttonsPanel.add(button);
                button.setBorder(new LineBorder(customBlack));
                
                if(Arrays.asList(topButtons).contains(buttonValue)){
                    button.setBackground(customLightGray);
                    button.setForeground(customBlack);
                }
                else if(Arrays.asList(rightButtons).contains(buttonValue)){
                    button.setBackground(customOrange);
                    button.setForeground(Color.white);
                }
                else{
                    button.setBackground(customDarkGray);
                    button.setForeground(Color.white);
                }
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton button = (JButton)e.getSource();
                        String buttonValue = button.getText();
                        if(Arrays.asList(rightButtons).contains(buttonValue)){
                            if(buttonValue == "="){
                                if(A != null){
                                    B = displayLabel.getText();
                                    double numA = Double.parseDouble(A);
                                    double numB = Double.parseDouble(B);
                                    if(operator == "+"){
                                        displayLabel.setText(removeZeroDecimal(numA + numB));
                                    }
                                    if(operator == "-"){
                                        displayLabel.setText(removeZeroDecimal(numA - numB));
                                    }
                                    if(operator == "*"){
                                        displayLabel.setText(removeZeroDecimal(numA * numB));
                                    }
                                    if(operator == "/"){
                                        displayLabel.setText(removeZeroDecimal(numA / numB));
                                    }
                                    clearAll();
                                }
                            }
                            else if("+-*/".contains(buttonValue)){
                                if(operator == null){
                                    A = displayLabel.getText();
                                    displayLabel.setText("0");
                                    B = "0";
                                }
                                operator = buttonValue;
                            }
                        }
                        else if(Arrays.asList(topButtons).contains(buttonValue)){
                            if(buttonValue == "AC"){
                                clearAll();
                                displayLabel.setText("0");
                            }
                            else if(buttonValue == "+/-"){
                                double numDisplay = Double.parseDouble(displayLabel.getText());
                                numDisplay *= -1;
                                displayLabel.setText(removeZeroDecimal(numDisplay));
                            }
                            else if(buttonValue == "%"){
                                double numDisplay = Double.parseDouble(displayLabel.getText());
                                numDisplay /= 100;
                                displayLabel.setText(removeZeroDecimal(numDisplay));
                            }
                        }
                        else{
                            if(buttonValue == "."){
                                if(!displayLabel.getText().contains(buttonValue));
                                    displayLabel.setText(displayLabel.getText() + buttonValue);
                                
                            }
                            else if("0123456789".contains(buttonValue)){
                                if(displayLabel.getText() == "0"){
                                    displayLabel.setText(buttonValue);
                                }
                                else{
                                    displayLabel.setText(displayLabel.getText() + buttonValue);
                                }
                            }
                            else if(buttonValue == "sqrt"){
                                displayLabel.setText(removeZeroDecimal(Math.sqrt(Double.parseDouble(displayLabel.getText()))));
                            }
                        }
                    }
                });
                frame.add(buttonsPanel);
                frame.setVisible(true);
            }
            
        }
        void clearAll(){
            A = "0";
            operator = null;
            B = null;
        }
        String removeZeroDecimal(double numDisplay){
            if(numDisplay % 1 == 0){
                return String.valueOf((int)numDisplay);
            }
            return String.valueOf(numDisplay);
        }
   }
