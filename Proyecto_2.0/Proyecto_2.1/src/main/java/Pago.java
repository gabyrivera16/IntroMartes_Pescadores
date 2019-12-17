
/**
 *
 * @author Daniel, Alex, Jessica, Steven
 */
import javax.swing.JOptionPane;
public class Pago {

    public void MetodoPago(){
        
     String pregunta="¿Como desea realizar el pago?"+" n1-Efectivo, n2-Tarjeta, n3-Deposito";
     String metodo=JOptionPane.showInputDialog(pregunta);
     int pago=metodo.charAt(0);
     System.out.println("Tramite Pago:");
     switch(pago){
         case '1':  
                 JOptionPane.showMessageDialog(null, "Para el pago en efectivo,"+
                 " presentar la suma del total en recepción.", 
                 "¡Atención!",JOptionPane.INFORMATION_MESSAGE);
                 System.out.println("Efectivo");
                 break; 
         case '2':
                 JOptionPane.showMessageDialog(null, 
                 "A continuación se le solicitara los datos de su tarjeta.", 
                 "¡Atención!", JOptionPane.INFORMATION_MESSAGE);
                 String pregunta1="Titular de la tarjeta";
                 String tarjeta1=JOptionPane.showInputDialog(pregunta1);
                 String pregunta2="Digite su numero de tarjeta";   
                 String tarjeta=JOptionPane.showInputDialog(pregunta2);
                 String pregunta3="Codigo de seguridad";
                 String tarjeta2=JOptionPane.showInputDialog(pregunta3);
                 String pregunta4="Fecha de vencimiento";
                 String tarjeta3=JOptionPane.showInputDialog(pregunta4);
                 System.out.println("Tarjeta");
                 break; 
         case '3':
                 JOptionPane.showMessageDialog(null, "BCR: 458-58-143-100837-1"+
                 " BN: 777-12-670-000473-2"+" BAC: 349-11-250-395550-1", 
                 "¡Atención!", JOptionPane.INFORMATION_MESSAGE);
                 System.out.println("Deposito Bancario");
                 break;
         default:
                 JOptionPane.showMessageDialog(null, "Opción invalida, intentelo "
                 + "de nuevo","¡Atención!", JOptionPane.INFORMATION_MESSAGE);
                 Pago pago2=new Pago();
                 pago2.MetodoPago();
                 break;
        }//Fin switch
    }//Fin MetodoPago
}//Fin clase
