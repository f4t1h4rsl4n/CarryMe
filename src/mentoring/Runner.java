package mentoring;

import javax.swing.*;

public class Runner {
    public static final int WIDTH=640,HEIGHT=480;
    public static final String TITLE="FATIH";

    public static void main(String[] args)  {
        JFrame frame=new JFrame(TITLE);
        frame.setSize(WIDTH,HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new Adana());
        frame.setVisible(true);


    }
}
