
/**
 *
 * @author Daniel, Alex, Jessica, Steven
 */
import javax.swing.JOptionPane;
public class Menu {
    
    public void menu(){
        
     String pregunta="¿Que acción desea realizar?"+" Digite 1 para comprar o 2 para alquilar.";   
     String accion=JOptionPane.showInputDialog(pregunta);
     int valor=accion.charAt(0);
     //Comprar
     if (valor==1){
         String pregunta1="¿En que esta interesado?"+" n1-Automoviles o n2-Motos";
         String interes=JOptionPane.showInputDialog(pregunta1);
         
         //Automovil
         if (interes==1){
             String pregunta2="¿Que tipo de automovil le interesa?"+" n1-Sedan-SUV o n2-4x4.";
             String interes2=JOptionPane.showInputDialog(pregunta2);
              
              //Marcas
              if (interes2==1){
                 String pregunta3="¿Que marca le interesa?"+" n1-Toyota, n2-Ford, n3-Isuzu,"
                         +"n4-Mercedes-Benz, n5-BMW, n6-Hyundai, n7-Mitsubishi, n8-Subaru";
                 String pregunta
              }//Fin interes2
            }//Fin interes
         
         //Motos
         else if (interes==2){
             String pregunta2="¿Que marca le interesa?"+" n1-KTM, n2-Ducatti, n3-BMW, n4-Yamaha o n5-Honda.";
             String interes2=JOptionPane.showInputDialog(pregunta2);  
            }//Fin if else
        }//Fin if 
     
     //Alquilar
     else if (accion==2){
         String pregunta1="¿En que esta interesado?"+" n1-Automoviles o n2-Motos";
         String interes=JOptionPane.showInputDialog(pregunta1); 
         
         //Automovil
         if (interes==1){
             String pregunta2="¿Que tipo de automovil le interesa?"+" n1-Sedan-SUV o n2-4x4.";
             String interes2=JOptionPane.showInputDialog(pregunta2);
            }//Fin interes
         
         //Motos
         else if (interes==2){
             String pregunta2="¿Que marca le interesa?"+" KTM, Ducatti, BMW, Yamaha o Honda.";
             String interes2=JOptionPane.showInputDialog(pregunta2);  
            }//Fin if else
         
         
         
        }//Fin else
     
     
     
     
     
    }//Fin menu  
}//Fin class
