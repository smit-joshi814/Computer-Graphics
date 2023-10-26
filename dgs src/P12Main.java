/* Computer Graphics P12 : Write a graphic program to draw different shapes like
 * Line, Rectangle, Circle, Ellipse, arc, and Polygon
 */

import java.awt.*;
import java.awt.event.*;

public class P12Main extends Frame implements ActionListener {
    
    Button btnLine, btnRect, btnCircle, btnEllip, btnArc, btnPoly;
    Panel p2;
    P12Canvas can = new P12Canvas();
    public P12Main(){
        
        super("Practical:12");
      
        btnLine = new Button("Line");
        btnRect = new Button("Rectangle");
        btnCircle = new Button("Circle");
        btnEllip = new Button("Ellipse");
        btnArc = new Button("Arc");
        btnPoly = new Button("Polygon");
        
        p2 = new Panel(new GridLayout(1,6));
        p2.add(btnLine);
        p2.add(btnRect);
        p2.add(btnCircle);
        p2.add(btnEllip);
        p2.add(btnArc);
        p2.add(btnPoly);
        
        setSize(500,500);
        setLayout(new BorderLayout());
        add(can,"Center");
        add(p2,"South");
        
        addWindowListener(
                new WindowAdapter(){
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });
        
        btnLine.addActionListener(this);
        btnRect.addActionListener(this);
        btnCircle.addActionListener(this);
        btnEllip.addActionListener(this);
        btnArc.addActionListener(this);
        btnPoly.addActionListener(this);
        
        show();
        
    }

    public void actionPerformed(ActionEvent ae){
        
        String bname = ae.getActionCommand();
        if(bname.equals("Line")) can.drawMyShape(1);
        if(bname.equals("Rectangle")) can.drawMyShape(2);
        if(bname.equals("Circle")) can.drawMyShape(3);
        if(bname.equals("Ellipse")) can.drawMyShape(4);
        if(bname.equals("Arc")) can.drawMyShape(5);
        if(bname.equals("Polygon")) can.drawMyShape(6);
    }
    
    public static void main(String[] args) {
  
        new P12Main();
    }
}
