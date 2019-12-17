
/**
 *
 * @author Daniel, Alex, Steven, Jessica
 */
import javax.swing.JOptionPane;
public class Alquiler {
    
    public void AlquilerTransporte(){
     
     String pregunta="¿Por cuantos dias desea alquiler el vehiculo?";
     String tiempo=JOptionPane.showInputDialog(pregunta);
     int precio=tiempo.charAt(0);
     int precioFinal=precio*2500;
     JOptionPane.showMessageDialog(null, "Debera pagar una garantía de ₡500,000 para el seguro del vehiculo.", 
             "¡Poliza!", JOptionPane.INFORMATION_MESSAGE);
     JOptionPane.showMessageDialog(null, "El monto se le devolvera una vez retorne el vehiculo"+
             " en las mismas condiciones en que le fue entregado. De caso"+
             " contrario del monto de la poliza se tomara para reparación del mismo."
             , "¡Grantía!", JOptionPane.INFORMATION_MESSAGE);
     String pregunta2="¿Digite el numero de una tarjeta de crédito, para realizar el boucher de garantia";
     String t=JOptionPane.showInputDialog(pregunta2);
     int poliza=500000;
     int preciofinal=precioFinal+poliza;
     System.out.println("Precio de alquiler en colones: "+precioFinal);
     System.out.println("Precio de poliza en colones: "+poliza);
     System.out.println("Precio total en colones: "+preciofinal);
    }//FinAlquiler   
}//Fin clase
