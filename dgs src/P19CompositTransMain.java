
//package p19compositTransMain;


import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class P19CompositTransMain extends Frame implements ActionListener {

    Label lblXYCoord, lblFixpoint, lblRotate, lblScale;
    TextField tfx, tfy, tftx, tfty, tfsx, tfsy, tftheta;
    Button btnDraw, btnTransform;
    Panel p1;
    
 //   P19CompositTransCanvas can = new P19CompositTransCanvas();
    
    public P19CompositTransMain(){
        
        super("Practical:19 Polygon Transformation...");
        
        lblXYCoord = new Label("Co-Ordinate X[0..n] and Y[0..n] : ");
        lblFixpoint = new Label("Translation Points (tx, ty) : ");
        lblRotate = new Label("Rotation Angle :");
        lblScale = new Label("Scaling Points (sx, xy) : ");
       
        tfx = new TextField(3);
        tfy = new TextField(3);
        tftx = new TextField(3);
        tfty = new TextField(3);
        tfsx = new TextField(3);
        tfsy = new TextField(3);
        tftheta = new TextField(3);
        
        
        btnDraw = new Button("Draw Polygon");
        btnTransform = new Button("Transform Polygon");
        
        p1 = new Panel(new GridLayout(5,3));
        p1.add(lblXYCoord);
        p1.add(tfx);
        p1.add(tfy);        
        p1.add(lblFixpoint);
        p1.add(tftx);
        p1.add(tfty);      
        p1.add(lblScale);
        p1.add(tfsx);
        p1.add(tfsy);
        p1.add(lblRotate);
        p1.add(tftheta);
        p1.add(new Label());        
        p1.add(btnDraw);
        p1.add(btnTransform);
        
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
                btnTransform.addActionListener(this);
        show();       
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String X = tfx.getText();
        String Y = tfy.getText();
        
        if(ae.getSource() == btnDraw) can.drawPoly(X, Y);      
        
        if(ae.getSource() == btnTransform){
            
            double tx = Double.parseDouble(tftx.getText());
            double ty = Double.parseDouble(tfty.getText());
            double sx = Double.parseDouble(tfsx.getText());
            double sy = Double.parseDouble(tfsy.getText());
            int theta = Integer.parseInt(tftheta.getText());
            
            can.transformPoly(X, Y, tx, ty, sx, sy, theta);
        }
    }
    
    public static void main(String[] args) {
        
        new P19CompositTransMain();
    }
}
