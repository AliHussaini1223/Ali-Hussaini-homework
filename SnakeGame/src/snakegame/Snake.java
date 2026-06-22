package snakegame;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class Snake extends JPanel{
    
    int boardWidht;
    int boardHeight;
    
    Snake(int boardWidth, int boardHeight){
        this.boardWidht = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.black);
    }
}
