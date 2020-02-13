package mentoring;

import mentoring.input.Controller;
import mentoring.input.KeyInput;
import mentoring.objects.Enemy;
import mentoring.objects.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adana extends JPanel implements ActionListener {
        private Timer gameLoop;
        //objects
        private Player p;
        private Controller c;
        private String backgroundAdress="objects/Images/background.png";
        public Adana(){
            setFocusable(true);
            gameLoop=new Timer(9,this);
            gameLoop.start();
            //objects
            p=new Player(250,200);
            c=new Controller();
            addKeyListener(new KeyInput(p));

        }
        public void paint(Graphics g){
            super.paint(g);
            Graphics2D g2d=(Graphics2D) g;
            g2d.drawImage(getBackgroundImage(),0,0,null);
            p.draw(g2d);
            c.draw(g2d);
        }
        public Image getBackgroundImage(){
            ImageIcon bg=new ImageIcon(getClass().getResource(backgroundAdress));
            return bg.getImage();
        }




    @Override
    public void actionPerformed(ActionEvent e) {
            repaint();
            p.update();
            c.update();
    }
}
