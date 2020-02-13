package mentoring.objects;

import mentoring.Adana;
import mentoring.GlobalPosition;
import mentoring.Runner;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class Enemy extends GlobalPosition {
    private String enemyAdress="Images/enemyPurple.png";
    private int speed=5;
    public Enemy(int x, int y) {
        super(x, y);
    }
    public void update(){
        x+=speed;
        if (x> 610){
            speed-=5;
        }
        if (x<0){
            speed=5;
        }
    }
    public Rectangle getRectange(){
        return new Rectangle(x,y,32,32);
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(getEnemyImage(),x,y,null);
    }

    public Image getEnemyImage(){
        ImageIcon i=new ImageIcon(getClass().getResource(enemyAdress));
        return i.getImage();
    }

}
