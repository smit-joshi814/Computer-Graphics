package javaappls;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


public class cguCharCurveMain extends Frame{
    
    cguCharCurveCanvas can=new cguCharCurveCanvas();
    
    public cguCharCurveMain(){
        
        super("practical:=8 simple character using curve...");
        
        setSize(500,500);
        setLayout(new BorderLayout());
        add(can,"Center");
        
        addWindowListener(
          new WindowAdapter() {
               public void windowClosing(WindowEvent e){
                   System.exit(0);
                   
               }
          });
        show();
    }
    
    

    public static void main(String[] args) {
       new cguCharCurveMain();
    }
    
}
