/*Computer Graphics P14: Write a Graphic program to rotate a  
 * Polygon in which values of polygon edges and rotation angle
 * will be given by user.
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class P14RotatePolygonMain extends Frame implements ActionListener{
    
    Label lblXYCoord, lblRotate;
    TextField tfx, tfy, tftheta;
    Button btnDraw, btnRotate;
    Panel p1;
    P14RotatePolygonCanvas can = new P14RotatePolygonCanvas();
    
    public P14RotatePolygonMain(){
        
        super("Practical:14 Polygon Rotation...");
        
        lblXYCoord = new Label("Co-Ordinate X[0..n] and Y[0..n] : ");
        lblRotate = new Label("Rotation Theta Angle : ");
        
        tfx = new TextField(3);
        tfy = new TextField(3);
        tftheta = new TextField(3);
        
        btnDraw = new Button("Draw Polygon");
        btnRotate = new Button("Rotate Polygon");
        
        p1 = new Panel(new GridLayout(3,3));
        p1.add(lblXYCoord);
        p1.add(tfx);
        p1.add(tfy);
        p1.add(lblRotate);
        p1.add(tftheta);
        p1.add(new Label());
        p1.add(btnDraw);
        p1.add(btnRotate);
        
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
                btnRotate.addActionListener(this);
        show();       
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String X = tfx.getText();
        String Y = tfy.getText();
        
        if(ae.getSource() == btnDraw) can.drawPoly(X, Y);      
        
        if(ae.getSource() == btnRotate){
            int theta = Integer.parseInt(tftheta.getText());
            can.rotatePoly(X, Y, theta);
        }
    }
   
    public static void main(String[] args) {
        
        new P14RotatePolygonMain();
    }
}
