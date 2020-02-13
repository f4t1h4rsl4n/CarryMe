package mentoring;

import mentoring.input.Controller;
import mentoring.input.KeyInput;
import mentoring.objects.Enemy;
import mentoring.objects.Home;
import mentoring.objects.Player;
import mentoring.objects.Princess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adana extends JPanel implements ActionListener {
        private Timer gameLoop;
        //objects
        private Player p;
        private Controller c;
        private Princess pr;
        private Home h;
        private String backgroundAdress="objects/Images/background.png";
        public Adana(){
            setFocusable(true);
            gameLoop=new Timer(9,this);
            gameLoop.start();
            //objects
            pr=new Princess(200,0);
            h=new Home(200,413);
            p=new Player(400,410,pr,h);
            c=new Controller();
            addKeyListener(new KeyInput(p));

        }
        public void paint(Graphics g){
            super.paint(g);
            Graphics2D g2d=(Graphics2D) g;
            g2d.drawImage(getBackgroundImage(),0,0,null);
            pr.draw(g2d);
            p.draw(g2d);
            c.draw(g2d);
            h.draw(g2d);
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
