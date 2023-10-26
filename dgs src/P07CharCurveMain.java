import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class P07CharCurveMain extends Frame{

    P07CharCurveCanvas can = new P07CharCurveCanvas();
    
    public P07CharCurveMain(){
        
        super("Practical:07 Simple Character Using Curve...");
        
        setSize(500,500);
        setLayout(new BorderLayout());
        add(can,"Center");
        
        addWindowListener(
                new WindowAdapter(){
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });
        show();       
    }
    
    public static void main(String[] args) {

        new P07CharCurveMain();
    }
}
