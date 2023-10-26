//Canvas for Practical-07
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


public class P07CharCurveCanvas extends Canvas{
    
   
    public void drawXY(Graphics g){
    
        Dimension d = getSize();
        int maxX = d.width - 1;
        int maxY = d.height - 1;
        Graphics2D g2d = (Graphics2D) g.create();
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke bsThick = new BasicStroke(3.0f);
        g2d.setStroke(bsThick);
        g2d.drawRect(0, 0, maxX, maxY);//Canvas Border-Size Rectangle
        
        //Graph Value on Y-Axe
        for(int i=0; i<=maxY; i=i+50)
            g.drawString(Integer.toString(i), 0, i);
        
        //Graph Value on X-Axe
        for(int i=0; i<=maxX; i=i+50)
            g.drawString(Integer.toString(i), i, 10);
        
    }

    public void paint(Graphics g){
 
        drawXY(g);
        
        Graphics2D g2d = (Graphics2D) g;

        //Use of antialiasing to have nicer lines.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        //The lines should have a thickness of 3.0 instead of 1.0.
        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setStroke(bs);


        //The control points for defining the letter.
        int xc1 =  50;
        int yc1 = 250;

        int xc2 = 250;
        int yc2 =  50;

        int xc3 =  50;
        int yc3 =  50;

        int xc4 =  250;
        int yc4 =  450;

        int xc5 =  50;
        int yc5 = 450;
        
        //Definition and drawing of the two curves that define the letter.
        QuadCurve2D.Double d1 = new QuadCurve2D.Double(xc1,yc1,xc3,yc3,xc2,yc2);
        g2d.draw(d1);

        QuadCurve2D.Double d2 = new QuadCurve2D.Double(xc1,yc1,xc5,yc5,xc4,yc4);
        g2d.draw(d2);
        
         //Label the control points.
        g2d.setFont(new Font("serif",Font.BOLD,20));
        g2d.drawString("P1'",xc1+10,yc1+5);
        g2d.drawString("P2'",xc2+10,yc2+10);
        g2d.drawString("P3'",xc3-35,yc3+4);
        g2d.drawString("P4'",xc4+10,yc4+10);
        g2d.drawString("P5'",xc5+10,yc5+10);
  }
}