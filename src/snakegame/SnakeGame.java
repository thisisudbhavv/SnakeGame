package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {
    
    //frame code | constructor showed when class object is called
    SnakeGame() {
        super("Snake Game"); //frame heading || this should be the first statement in constructor
        add(new Board()); //make a panel || components is divided in panels
        pack(); //refresh the frame to make the visible frame refresh
        
        
        setSize(300, 300); //set size of the window
        setLocationRelativeTo(null); //to open window in middle of the screen
        setResizable(false);
        
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true); //to make the frame visible
    }
    
}
