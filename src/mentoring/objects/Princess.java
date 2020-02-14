package mentoring.objects;

import mentoring.GlobalPosition;

import javax.swing.*;
import java.awt.*;

public class Princess extends GlobalPosition {
    private String pricessAdress="Images/princess.png";
    public Princess(int x, int y) {
        super(x, y);
    }
    public void update(int x,int y){
    this.x=x-5;
    this.y=y-20;
    }
    public void draw(Graphics2D g2d){
        g2d.drawImage(getPricessImage(),x,y,null);
    }
    private Image getPricessImage(){
        ImageIcon i=new ImageIcon(getClass().getResource(pricessAdress));
        return i.getImage();
    }
    public Rectangle getRectangle(){
        return new Rectangle(x,y,32,32);
    }
}
