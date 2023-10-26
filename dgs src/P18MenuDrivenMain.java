/*Computer Graphics P18: Write a menu driven Graphic program  
 * which combine translation, pivot-point rotation, and fixed-point rotation.
 */

import java.io.*;

public class P18MenuDrivenMain{

    public static void main(String[] args) throws IOException {
 
        int choice = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        new P18MenuDrivenMain();
        
        do{
            System.out.println("-----Menu-----");
            System.out.println("1. Tanslate Polygon");
            System.out.println("2. Rotate Polygon");
            System.out.println("3. Scale Polygon");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            choice = Integer.parseInt(br.readLine());
           
            switch(choice){
            
            case 1: //Translation
                new P13TransPolygonMain();
                break;

            case 2: //Rotation
                new P16PivotRotatePolygonMain();
                break;
            
            case 3: //Scale
                  
                new P17FixedScalePolyMain();
                break;
            
            case 4: //Exit
                break;
            
            default:
                System.out.println("Wrong Choice");                
        }
        }while(choice != 4);
    }
}
