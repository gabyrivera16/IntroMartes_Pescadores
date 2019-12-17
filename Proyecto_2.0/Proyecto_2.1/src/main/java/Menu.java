
/**
 *
 * @author Daniel, Alex, Jessica, Steven
 */
import javax.swing.JOptionPane;
public class Menu {
    
    public void menu(){
        
     String pregunta="¿Que acción desea realizar?"+" Digite 1 para comprar o 2 para alquilar.";   
     String accion=JOptionPane.showInputDialog(pregunta);//Posible error por aquí
     int valor=accion.charAt(0);
     System.out.println("Tramite: ");
     //Comprar
     if (valor=='1'){
         System.out.println("Compra");
         String pregunta1="¿En que esta interesado comprar?"+" n1-Automoviles o n2-Motos";
         String interes=JOptionPane.showInputDialog(pregunta1);
         int interes1=interes.charAt(0);
         
         //Automovil
         System.out.println("Tipo de Vehiculo: ");
         if (interes1=='1'){
             String pregunta2="¿Que tipo de automovil le interesa?"+" n1-Sedan-SUV o n2-4x4.";
             String tipo=JOptionPane.showInputDialog(pregunta2);
             int interes2=tipo.charAt(0);
              
              //Sedan-SUV
              if (interes2=='1'){
                 System.out.println("Sedan-SUV");
                 String pregunta3="¿Que marca le interesa?"+" n1-Toyota, n2-Ford, n3-Nissan,"
                         +"n4-Mercedes-Benz, n5-BMW, n6-Hyundai, n7-Mitsubishi, n8-Subaru";
                 String marca=JOptionPane.showInputDialog(pregunta3);
                 int modelo=marca.charAt(0);
                  switch (modelo){
                      case '1':
                               Automoviles Toyota=new Automoviles();
                               Toyota.vehiculo7();
                               break;
                      case '2':
                               Automoviles Ford=new Automoviles();
                               Ford.vehiculo10();        
                               break;
                      case '3':
                               Automoviles Nissan=new Automoviles();
                               Nissan.vehiculo9();
                               break;
                      case '4':
                               Automoviles Mercedes=new Automoviles();
                               Mercedes.vehiculo14();
                               break;
                      case '5': 
                               Automoviles BMW=new Automoviles();
                               BMW.vehiculo13();
                               break;
                      case '6':
                               Automoviles Hyundai=new Automoviles();
                               Hyundai.vehiculo12();
                               break;
                      case '7':
                               Automoviles Mitsubishi=new Automoviles();
                               Mitsubishi.vehiculo11();
                               break;
                      case '8':
                               Automoviles Subaru=new Automoviles();
                               Subaru.vehiculo8();
                               break;
                    }//Fin modelo sedan-suv
                }//Fin Sedan
                 
              //4x4
              else if (interes2=='2'){
                  System.out.println("4x4");
                  String pregunta3="¿Que marca le interesa?"+" n1-Toyota, n2-Ford, n3-Isuzu";
                  String marca=JOptionPane.showInputDialog(pregunta3);
                  int modelo=marca.charAt(0);
                  switch (modelo){
                      case '1':
                               Automoviles Toyota=new Automoviles();
                               Toyota.vehiculo19();
                               break;
                      case '2':
                               Automoviles Ford=new Automoviles();
                               Ford.vehiculo18();
                               break;
                      case '3':
                               Automoviles Isuzu=new Automoviles();
                               Isuzu.vehiculo20();
                               break;
                  }//Fin modelo 4x4
                }//Fin 4x4
            }//Fin interes
         
         //Motos
         else if (interes1=='2'){
             System.out.println("Motocicleta");
             String pregunta2="¿Que marca le interesa?"+" n1-KTM, n2-Ducatti, n3-BMW, n4-Yamaha.";
             String interes2=JOptionPane.showInputDialog(pregunta2);
             int modelomoto=interes2.charAt(0);
             switch (modelomoto){
                 case '1':
                          Motos KTM=new Motos();
                          KTM.Moto2();
                          break;
                 case '2':
                          Motos Ducatti=new Motos();
                          Ducatti.Moto4();
                          break;
                 case '3':
                          Motos BMW=new Motos();
                          BMW.Moto1();
                          break;
                 case '4':
                          Motos Yamaha=new Motos();
                          Yamaha.Moto6();
                          break;
                }//Fin modelomoto    
            }//Fin if else
        }//Fin if
     
     //Alquilar
     if (valor=='2'){
         System.out.println("Alquiler");
         String pregunta1="¿En que esta interesado alquilar?"+" n1-Automoviles o n2-Motos";
         String interes=JOptionPane.showInputDialog(pregunta1);
         int interes1=interes.charAt(0);
         
         //Automovil
         System.out.println("Tipo de Vehiculo: ");
         if (interes1=='1'){
             String pregunta2="¿Que tipo de automovil le interesa?"+" n1-Sedan-SUV o n2-4x4.";
             String tipo=JOptionPane.showInputDialog(pregunta2);
             int interes2=tipo.charAt(0);
              
              //Sedan-SUV
              if (interes2=='1'){
                 System.out.println("Sedan-SUV");
                 String pregunta3="¿Que marca le interesa?"+" n1-Toyota, n2-Ford, n3-Nissan,"
                         +" n4-Hyundai, n5-Mitsubishi, n6-Subaru";
                 String marca=JOptionPane.showInputDialog(pregunta3);
                 int modelo=marca.charAt(0);
                 switch (modelo){
                     case '1':
                              Automoviles Toyota=new Automoviles();
                              Toyota.vehiculo1();
                              break;
                     case '2':
                              Automoviles Ford=new Automoviles();
                              Ford.vehiculo4();
                              break;
                     case '3':
                              Automoviles Nissan=new Automoviles();
                              Nissan.vehiculo3();
                              break;
                     case '4':
                              Automoviles Hyundai=new Automoviles();
                              Hyundai.vehiculo6();
                              break;
                     case '5':
                              Automoviles Mitsubishi=new Automoviles();
                              Mitsubishi.vehiculo5();
                              break;
                     case '6':
                              Automoviles Subaru=new Automoviles();
                              Subaru.vehiculo2();
                              break;
                    }//Fin modelo suv-sedan
                }//Fin Sedan
                 
              //4x4
              else if (interes2=='2'){
                  System.out.println("4x4");
                  String pregunta3="¿Que marca le interesa?"+" n1-Toyota, n2-Ford, n3-Isuzu";
                  String marca=JOptionPane.showInputDialog(pregunta3);
                  int modelo=marca.charAt(0);
                  switch (modelo){
                      case '1':
                               Automoviles Toyota=new Automoviles();
                               Toyota.vehiculo16();
                               break;
                      case '2':
                               Automoviles Ford=new Automoviles();
                               Ford.vehiculo15();
                               break;
                      case '3':
                               Automoviles Isuzu=new Automoviles();
                               Isuzu.vehiculo17();
                               break;
                    }//Fin modelo 4x4
                }//Fin 4x4
            }//Fin interes
         
         //Motos
         else if (interes1=='2'){
             System.out.println("Motocicleta");
             String pregunta2="¿Que marca le interesa?"+" n1-KTM, n2-BMW, n3-Yamaha, n4-Honda.";
             String interes2=JOptionPane.showInputDialog(pregunta2);
             int modelomoto=interes2.charAt(0);
             switch (modelomoto){
                 case '1':
                          Motos KTM=new Motos();
                          KTM.Moto7();
                          break;
                 case '2':
                          Motos BMW=new Motos();
                          BMW.Moto8();
                          break;
                 case '3':
                          Motos Yahama=new Motos();
                          Yahama.Moto5();
                          break;
                 case '4':
                          Motos Honda=new Motos();
                          Honda.Moto3();
                          break;
                }//Fin modelomoto
            }//Motos
         //Calculo del alquiler
         Alquiler alquiler=new Alquiler();
         alquiler.AlquilerTransporte();
        }//Alquiler     
    }//Fin menu  
}//Fin class

