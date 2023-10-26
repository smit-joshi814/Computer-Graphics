/*Computer Graphics P08: Write a Graphic program to draw 
 * Polygon using method.
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class P08DrawPolygonMain extends Frame implements ActionListener{
    
    Label lblXCoord, lblYCoord;
    TextField tfx, tfy;
    Button btnDraw, btnReset;
    Panel p1;
    P08DrawPolygonCanvas can = new P08DrawPolygonCanvas();
    
    public P08DrawPolygonMain(){
        
        super("Practical:08 Polygon Drawing...");
        
        lblXCoord = new Label("Co-Ordinate X[0..n] : ");
        lblYCoord = new Label("Co-Ordinate Y[0..n] : ");
        
        tfx = new TextField(3);
        tfy = new TextField(3);
        
        btnDraw = new Button("Draw Polygon");
        
        p1 = new Panel(new GridLayout(3,2));
        p1.add(lblXCoord);
        p1.add(tfx);
        p1.add(lblYCoord);
        p1.add(tfy);
        p1.add(btnDraw);
        
        setSize(500,500);
        setLayout(new BorderLayout());
        add(can,"Center");
        add(p1,"South");
        
        addWindowListener(
                new WindowAdapter(){
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });
                btnDraw.addActionListener(this);
        show();       
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String X = tfx.getText();
        String Y = tfy.getText();
        can.drawPoly(X, Y);
    }

    
    public static void main(String[] args) {
        
        new P08DrawPolygonMain();
    }
}