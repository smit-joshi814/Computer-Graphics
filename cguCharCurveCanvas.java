package javaappls;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class cguCharCurveCanvas extends Canvas {
    public void drawXY(Graphics g)
    {
        Dimension d = getSize();
        int maxX = d.width - 1;
        int maxY = d.height - 1;
        Graphics2D g2d = (Graphics2D) g.create();
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke bsThick = new BasicStroke(3.0f);
        g2d.setStroke(bsThick);
        g2d.drawRect(0,0,maxX, maxY);
        for(int i=0; i<=maxY;i=i+50)
        //graph value on y are
       
           g.drawString(Integer.toString(i), 0, i);
       
       
        
       //graph value on x
       for(int i=0;i<=maxX;i=i+50)
           g.drawString(Integer.toString(i), i, 10);
   }
    
     
   public void paint(Graphics g){
       
       drawXY(g);
       
       Graphics2D g2d=(Graphics2D) g;
        //use of antilising to have nicer lines
       g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
      //The Lines Should have a Thickness of 3.0 insted of 1.0
     
       BasicStroke bs=new BasicStroke(3.0f);
       g2d.setStroke(bs);
 //The control points for defining the letter
       int xc1=100;
       int yc1=100;
       
       int xc2=100;
       int yc2=300;
       
       int xc3=200;
       int yc3=450;
       
       int xc4=300;
       int yc4=300;
       
       int xc5=300;
       int yc5=100;
         // definition and drawing of the two curves that defining the letter    
  
       QuadCurve2D.Double d1=new QuadCurve2D.Double(xc1,yc1,xc2,yc2,xc3,yc3);
       g2d.draw(d1);
       QuadCurve2D.Double d2=new QuadCurve2D.Double(xc3,yc3,xc4,yc4,xc5,yc5);
       g2d.draw(d2);
       
       //Label the control points.
       g2d.setFont(new Font("serif",Font.BOLD,20));
       g2d.drawString("p1'",xc1+10,yc1+5);
       g2d.drawString("p2'",xc2+10,yc2+10);
       g2d.drawString("p3'",xc3-35,yc3+4);
       g2d.drawString("p4'",xc4+10,yc4+10);
       g2d.drawString("p5'",xc5+10,yc5+10);
               
              
       
    }
    
}

    
