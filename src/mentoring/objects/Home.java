package mentoring.objects;

import mentoring.GlobalPosition;

import javax.swing.*;
import java.awt.*;

public class Home extends GlobalPosition {
    private String homeAdress="Images/home.png";
    public Home(int x, int y) {
        super(x, y);
    }
    private Image getHomeImage(){
        ImageIcon i=new ImageIcon(getClass().getResource(homeAdress));
        return i.getImage();
    }
    public void draw(Graphics2D g2d){
        g2d.drawImage(getHomeImage(),x,y,null);
    }
    public Rectangle getRectangle(){
        return new Rectangle(x,y,32,32);
    }

}
