
import javax.swing.JOptionPane;
/**
 *
 * @author Daniel, Alex, Jessica, Steven
 */
public class Confirmacion {
    
    public void confirmacionP(){
     int conf=JOptionPane.showConfirmDialog(null, "¿Desea realizar el pedido?", 
             "¡Confirmación de orden!", JOptionPane.YES_NO_OPTION);
     switch (conf){
         case 0:
                 Pago pago=new Pago();
                 pago.MetodoPago();
                 System.out.println("-------------------------");
                 Factura factura=new Factura();
                 factura.FacturaCliente();
                 break;
         case 1: 
                 int conf2=JOptionPane.showConfirmDialog(null, "¿Desea seleccionar"+ 
                 " otro tramite de vehiculo?","¡Alerta!"
                 , JOptionPane.YES_NO_OPTION);
                 switch (conf2){
                     case 0:
                             System.out.println("-----Tramite vehicular invalido-----");
                             System.out.println("-------------------------");
                             Menu opciones = new Menu();
                             opciones.menu();
                             Confirmacion confirmacion=new Confirmacion();
                             confirmacion.confirmacionP();
                             break;
                     case 1:
                             JOptionPane.showMessageDialog(null, "Cancelando orden", 
                             "¡Cancelación!", 0);
                             JOptionPane.showMessageDialog(null, "Toda la información"+
                             " suministrada"+" por su persona se ha eliminado."
                             ,"Información eliminada", JOptionPane.INFORMATION_MESSAGE);
                             System.out.println("-----------Factura invalida---------");
                 }//Fin conf2
                 break;
     }//Fin switch
         
    }//Fin confirmacionP
}//Fin class
