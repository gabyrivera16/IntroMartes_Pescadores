
/**
 *
 * @author Alex, Jessica, Steven, Daniel
 */
import javax.swing.JOptionPane;
public class Factura {
 
    public void FacturaCliente(){
     
     //No Factura
     double factura=Math.random()*15+20; 
     long n1=(long)factura;
     int N0=(int)n1;
     int NT=N0*200000000;
     System.out.println("No Factura: "+NT);
     
     //Mensaje Final
     JOptionPane.showMessageDialog(null, "Gracias por preferirnos, puede pasar"
     +" a recoger su vehiculo en nuestra sucursal de La Uruca.", 
     "¡Gracias!", JOptionPane.INFORMATION_MESSAGE);
     JOptionPane.showMessageDialog(null, "En nuestra factura electronica se"
     +" brinda mayor información.", "¡Infornmación adicional!", 
     JOptionPane.INFORMATION_MESSAGE);
     
     //Comercio
     String[]Com;
     Com=new String[7];
     Com[0]="2514-5500";
     Com[1]="2514-5400";
     Com[2]="ag@lospescadorescr.com";
     Com[3]="2514-5300";
     Com[4]="San José, La Uruca";
     Com[5]="8am-5pm";
     Com[6]="8am-12pm";
     System.out.println("Agencia de Vehiculos Los Pescadores S.A");
     System.out.println("Numeros del local: "+Com[0]+", "+Com[1]);
     System.out.println("Fax: "+Com[3]);
     System.out.println("Correo: "+Com[2]);
     System.out.println("Horario: Lunes a Viernes "+Com[5]+" Sabados "+Com[6]);
     System.out.println("Ubicación: "+Com[4]);
     System.out.println("Guardar esta factura, para hacer efectiva la garantia");
     System.out.println("Gracias por depositar su confianza en nosotros");
    }//Fin facturacliente
}//Fin clase
