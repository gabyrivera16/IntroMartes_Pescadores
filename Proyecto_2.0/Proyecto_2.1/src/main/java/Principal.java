
/**
 *
 * @author Daniel, Alex, Jessica, Steven
 */
public class Principal {

    public static void main(String[] args) {
        
         System.out.println("-----------------------------------------------");
         //Toma de Datos Cliente
         Datos datos = new Datos();
         datos.TomaDatos();
          
         System.out.println("-------------------------");
         
         //Menu de opciones
         Menu opciones = new Menu();
         opciones.menu();
         
         System.out.println("-------------------------");

         //Confirmacion
         Confirmacion confiracion = new Confirmacion();
         confiracion.confirmacionP();
         
         
         System.out.println("-----------------------------------------------");
    }//Fin main
}//Fin class
