package screen_recorder;

import javax.swing.*;

public class Screen_Recorder {

    public static void main(String args[]){
        JFrame frame = new JFrame("Screen Recorder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        JButton button1 = new JButton("Press");
        frame.getContentPane().add(button1);
        frame.setVisible(true);
    }
    
}
