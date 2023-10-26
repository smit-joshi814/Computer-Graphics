package javaAppls;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class P10Fillpolygon extends Frame{

    private double x, y, Xmin, Xmax, Ymin, Ymax;
    
    public P10Fillpolygon(){
        
        super("Practical:10 Flood Fill Polygon...");
        
        setSize(500,500);
        setLayout(new BorderLayout());
                
        addWindowListener(
                new WindowAdapter(){
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });
        show();
       
        
    }
   
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
            g.drawString(Integer.toString(i), 10, i);
        
        //Graph Value on X-Axe
        for(int i=0; i<=maxX; i=i+50)
            g.drawString(Integer.toString(i), i, 40);
        
        //Draw Polygon for Example of Flood Fill
        
        
        
        //for(int i=100; i)
        
    }
       
    public void update(Graphics g){paint(g);}
    
    public void paint(Graphics g){
        
        drawXY(g);
        Graphics2D g2d = (Graphics2D) g.create();
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke bsThick = new BasicStroke(3.0f);
        g2d.setStroke(bsThick);
        
        Rectangle2D.Double rect = new Rectangle2D.Double(100,100,200,200);
        g2d.draw(rect);
        
        Xmin=rect.getMinX();
        Xmax=rect.getMaxX();
        Ymin=rect.getMinY();
        Ymax=rect.getMaxY();
        
        for(int i=(int)Ymin+3;i<=Ymax+3;i++)
        {
            for(int j=(int)Xmin+3;j<=Xmax-3;j++)
            {
                x=(double)j;
                y=(double)i;
                
            Point2D.Double ma=new Point2D.Double();
            ma.setLocation(x,y);
            g2d.setColor(Color.BLUE);
            try
            {
                Thread.sleep(0);
            }
            catch(Exception e){System.out.println(e);}
            g2d.draw(new Line2D.Double());
            }
        }
        
        
    }
    
    public static void main(String[] args) {

        new P10Fillpolygon();
    }
}
