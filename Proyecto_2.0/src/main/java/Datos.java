
/**
 *
 * @author Daniel, Alex, Jessica, Steven
 */
import javax.swing.JOptionPane;
public class Datos {
    
    public void TomaDatos(){
       JOptionPane.showMessageDialog(null, "Bienvenido a la Agencia de Vehiculos Los Pescadores");
       JOptionPane.showMessageDialog(null, "A continuación se le va a solicitar sus datos", 
             "Datos", JOptionPane.INFORMATION_MESSAGE);
       //Nombre
       String mensaje="Favor escriba su nombre completo";
       String respuesta=JOptionPane.showInputDialog(mensaje);
       //Cedula
       String mensaje2="Favor escriba su numero de cedula";
       String respuesta2=JOptionPane.showInputDialog(mensaje2);
       //Edad
       String mensaje3="Favor indique su edad";
       String respuesta3=JOptionPane.showInputDialog(mensaje3);
       //Telefono
       String mensaje4="Favor escriba su numero de teléfono";
       String respuesta4=JOptionPane.showInputDialog(mensaje4);
       //Licencia
       String mensaje5="Favor indique su numero licencia";
       String respuesta5=JOptionPane.showInputDialog(mensaje5);
       //Residencia
       String mensaje6="Favor indique su domicilio";
       String respuesta6=JOptionPane.showInputDialog(mensaje6);
       //Confirmación de datos
       JOptionPane.showMessageDialog(null, "Sus datos se han almacenado de forma exitosa", 
             "Confirmación", 1);
      
       //Metodo
       System.out.println(respuesta);
       System.out.println(respuesta2);
       System.out.println(respuesta3);
       System.out.println(respuesta4);
       System.out.println(respuesta5);
       System.out.println(respuesta6);
       
    }//Fin Tomadatos
    
}//Fin clase
