/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaappls;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class praWCh extends Canvas {
    
    
    
    public void drawXY(Graphics g){
       
       Dimension d=getSize();
       int maxX=d.width-1;
       int maxY=d.height-1;
       Graphics2D g2d=(Graphics2D) g.create();
       
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
       BasicStroke bsThick=new BasicStroke(3.0f);
       g2d.setStroke(bsThick);
       g2d.drawRect(0,0, maxX, maxY);
       
       
       //graph value on y are
       for(int i=0;i<=maxY;i=i+50)
           g.drawString(Integer.toString(i), 0, i);
       
       
        
       //graph value on x
       for(int i=0;i<=maxX;i=i+50)
           g.drawString(Integer.toString(i), i, 10);
   }
    
     
   public void paint(Graphics g){
       
       drawXY(g);
       
       Graphics2D g2d=(Graphics2D) g;
       
       g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
      
       BasicStroke bs=new BasicStroke(3.0f);
       g2d.setStroke(bs);

       
       int Xc1=50;
       int Yc1=50;
       
        int Xc2=50;
       int Yc2=200;
       
        int Xc3=125;
       int Yc3=250;
       
       int Xc4=200;
       int Yc4=200;
       
       int Xc5=200;
       int Yc5=75;
       
       int Xc6=275;
       int Yc6=250;
       
       int Xc7=350;
       int Yc7=200;
       
       int Xc8=350;
       int Yc8=50;

        Line2D.Double d1=new Line2D.Double(Xc1,Yc1,Xc2,Yc2);
        g2d.draw(d1);
       
       QuadCurve2D.Double d2=new QuadCurve2D.Double(Xc2,Yc2,Xc3,Yc3,Xc4,Yc4);
       g2d.draw(d2);
       
       Line2D.Double d3=new Line2D.Double(Xc4,Yc4,Xc5,Yc5);
        g2d.draw(d3);
        
        QuadCurve2D.Double d4=new QuadCurve2D.Double(Xc4,Yc4,Xc6,Yc6,Xc7,Yc7);
       g2d.draw(d4);
       
       Line2D.Double d5=new Line2D.Double(Xc7,Yc7,Xc8,Yc8);
        g2d.draw(d5);
       
       g2d.setFont(new Font("serif",Font.BOLD,20));
        g2d.drawString("p1'",Xc1+10,Yc1+10);
         g2d.drawString("p2'",Xc2+10,Yc2+10);
          g2d.drawString("p3'",Xc3+10,Yc3+10);
           g2d.drawString("p4'",Xc4+10,Yc4+10);
            g2d.drawString("p5'",Xc5+10,Yc5+10);
            g2d.drawString("p6'",Xc6+10,Yc6+10);
            g2d.drawString("p7'",Xc7+10,Yc7+10);
            g2d.drawString("p8'",Xc8+10,Yc8+10);
               
              
       
    }
    
}

