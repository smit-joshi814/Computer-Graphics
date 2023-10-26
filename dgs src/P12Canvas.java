//Canvas for Practical-12

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class P12Canvas extends Canvas{
    
    int choice;
    
    public void drawMyShape(int a){
        choice = a;
        repaint();
    }
    public void paint(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g.create();
        //Use of antialiasing to have nicer lines
        //g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        
        //Draw the shapes a little bit thicker or thinner.
        //BasicStroke bsThin = new BasicStroke(2.0f);
        //BasicStroke bsThick = new BasicStroke(3.0f);
    
        switch(choice){
            
            case 1: 
                g2d.drawLine(10, 10, 400, 400);
                break;
            case 2:
                
                //Rectangle2D.Double rect1 = new Rectangle2D.Double(50,50,200,100);
                //g2d.setStroke(bsThin);
                //g2d.draw(rect1);
                
                g2d.drawRect(50, 50, 200, 200);
                break;
            case 3:
                g2d.drawOval(50, 50, 100, 100);
                break;
            case 4:
                g2d.drawOval(50, 50, 100, 200);
                break;
            case 5:
                g2d.drawArc(10, 10, 300, 300, 0, 30);
                break;
            case 6:
                int []x = new int[3];
                int []y = new int[3];
                x[0] = 100;
                x[1] = 100;
                x[2] = 200;
                
                y[0] = 100;
                y[1] = 200;
                y[2] = 200;
                
                g2d.drawPolygon(x, y, 3);
        }
    }
}
