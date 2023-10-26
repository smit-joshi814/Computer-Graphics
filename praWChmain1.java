package javaappls;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javaAppls.prau;

public class praWChmain1 extends Frame{
    
  praWCh can=new praWCh();
    
    public praWChmain1(){
        
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
       new praWChmain1();
    }
    
}
