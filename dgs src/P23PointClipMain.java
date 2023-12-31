/*Computer Graphics P23: Write a Graphic program for Point Clipping Algorithm.
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class P23PointClipMain extends Frame implements ActionListener{
    
    Label lblXYCoord, lblWinMin, lblWinMax;
    TextField tfx, tfy, tfxwmn, tfywmn, tfxwmx, tfywmx; 
    Button btnDraw, btnClip;
    Panel p1;
    P23PointClipCanvas can = new P23PointClipCanvas();
    
    public P23PointClipMain(){
        
        super("Practical:23 Point Clipping...");
        
        lblXYCoord = new Label("Co-Ordinate X[0..n] and Y[0..n] : ");
        lblWinMin = new Label("Window Min-points (X,Y) : ");
        lblWinMax = new Label("Window Max-points (X,Y) : ");
        
        tfx = new TextField(3);
        tfy = new TextField(3);
        
        tfxwmn = new TextField(3);
        tfywmn = new TextField(3);
        tfxwmx = new TextField(3);
        tfywmx = new TextField(3);
        
        btnDraw = new Button("Draw Window");
        btnClip = new Button("Clip Points");
        
        p1 = new Panel(new GridLayout(4,3));
        
        p1.add(lblWinMin);
        p1.add(tfxwmn);
        p1.add(tfywmn);
        
        p1.add(lblWinMax);
        p1.add(tfxwmx);
        p1.add(tfywmx);
        
        p1.add(lblXYCoord);
        p1.add(tfx);
        p1.add(tfy);
        
        p1.add(btnDraw);
        p1.add(btnClip);
        
        setSize(600,600);
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
                btnClip.addActionListener(this);
        show();       
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String X = tfx.getText();
        String Y = tfy.getText();
        
        if(ae.getSource() == btnDraw){
            double xwmn = Double.parseDouble(tfxwmn.getText());
            double ywmn = Double.parseDouble(tfywmn.getText());
            double xwmx = Double.parseDouble(tfxwmx.getText());
            double ywmx = Double.parseDouble(tfywmx.getText());
            
            can.drawWindow(xwmn, ywmn, xwmx, ywmx);
        }      
        
        if(ae.getSource() == btnClip){
            
            can.clipPoints(X, Y);
        }
    }
   
    public static void main(String[] args) {
        
        new P23PointClipMain();
    }
}
