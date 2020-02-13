package mentoring.input;

import mentoring.objects.Enemy;

import java.awt.*;
import java.util.LinkedList;

public class Controller {
    private static LinkedList<Enemy> e=new LinkedList<>();
    private Enemy tempE;
    public Controller(){
        e.add(new Enemy(300,200));
        e.add(new Enemy(200,300));
        e.add(new Enemy(240,400));
        e.add(new Enemy(153,100));
        e.add(new Enemy(123,50));
    }
    public void draw(Graphics2D g2d){
        for (int i = 0; i <e.size() ; i++) {
            tempE=e.get(i);
            tempE.draw(g2d);
        }
    }
    public void update(){
        for (int i = 0; i <e.size(); i++) {
            tempE=e.get(i);
            tempE.update();
        }
    }
    public void addEnemy(Enemy enemy){
        e.add(enemy);
    }
    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }

    public static LinkedList<Enemy> getEnemyBounds(){
        return e;
    }
}
