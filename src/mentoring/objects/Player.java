package mentoring.objects;

import mentoring.GlobalPosition;
import mentoring.input.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class Player extends GlobalPosition {
    private String playerImage="Images/redHead.png";
    private int velX;
    private int velY;
    private static LinkedList<Enemy> e= Controller.getEnemyBounds();
    private Princess pr;
    private Home h;
    private boolean gotThePrincess=false;
    public Player(int x, int y,Princess pr,Home h) {
        super(x, y);
        this.pr=pr;
        this.h=h;
    }
    public void update(){
        x+=velX;
        y+=velY;
        if (x<0){
            x=0;
        }
        if (y<0){
            y=0;
        }
        if (x>610){
            x=610;
        }
        if (x>610){
            x=610;
        }
        if (y>413){
            y=413;
        }
        collisionWithPrincess();
        collisionWithEnemy();
        collisionWithHome();
    }
    private void collisionWithEnemy(){
        for (int i = 0; i <e.size() ; i++) {
            if (getRectange().intersects(e.get(i).getRectange())){
                JOptionPane.showMessageDialog(null,"Boom!, Restart the game XD");
                System.exit(0);
            }
        }
    }
    private void collisionWithPrincess(){
        if (getRectange().intersects(pr.getRectangle())){
            pr.update(x,y);
            gotThePrincess=true;
        }
    }
    private void collisionWithHome(){
        if (getRectange().intersects(h.getRectangle())&&gotThePrincess){
            JOptionPane.showMessageDialog(null,"got the girl yo! :)");
            System.exit(0);
        }
    }
    public Rectangle getRectange(){
        return new Rectangle(x,y,32,32);
    }
    public void draw(Graphics2D g2d){
        g2d.drawImage(getPlayerImage(),x,y,null);
    }
    private Image getPlayerImage(){
        ImageIcon i=new ImageIcon(getClass().getResource(playerImage));
        return i.getImage();
    }
    public void keyPressed(KeyEvent e){
        int key=e.getKeyCode();
        if (key==KeyEvent.VK_RIGHT){
            velX=5;
        } else if(key==KeyEvent.VK_LEFT){
            velX=-5;
        } else if(key==KeyEvent.VK_DOWN){
            velY=5;
        } else if (key==KeyEvent.VK_UP){
            velY=-5;
        }
    }
    public void keyReleased(KeyEvent e){
        int key=e.getKeyCode();
        if (key==KeyEvent.VK_RIGHT){
            velX=0;
        } else if(key==KeyEvent.VK_LEFT){
            velX=0;
        } else if(key==KeyEvent.VK_DOWN){
            velY=0;
        } else if (key==KeyEvent.VK_UP){
            velY=0;
        }
    }


}
