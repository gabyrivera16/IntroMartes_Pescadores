
/**
 *
 * @author Daniel, Alex, Jessica, Steven
 */
public class Automoviles {
    
   //Vehiculos Sedanes-SUV: Vehiculo1 Toyota       //Vehiculo7 Toyota
                          //Vehiculo2 Subaru       //Vehiculo8 Subaru
                          //Vehiculo3 Nissan       //Vehiculo9 Nissan
                          //Vehiculo4 Ford         //Vehiculo10 Ford
                          //Vehiculo5 Mitsubishi   //Vehiculo11 Mitsubishi
                          //Vehiculo6 Hyundai      //Vehiculo12 Hyundai
                          //Vehiculo13 BMW         //Vehiculo14 Mercedes-Benz
        //Venta:
              //Vehiculos del 1 al 6; 13 y 14
        //Alquiler:
              //Vehiculos del 7 al 12
    
   //Vehiculos 4x4: Vehiculo15 Ford     //Vehiculo18 Ford
                  //Vehiculo16 Toyota   //Vehiculo19 Toyota
                  //Vehiculo17 Isuzu    //Vehiculo20 Isuzu
        //Venta:
              //Vehiculos 15 al 17
        //Alquiler:
              //Vehiculos 18 al 20     
   //Alquiler Toyota
   public void vehiculo1(){
     String marca = "Toyota";
     String modelo = "Corolla S";
     String color = "Negro";
     int año = 2019;
     String motor = "1800cc Gasolina";
     String traccion = "Delantera";
     String kilometraje = "10,000km";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
     
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo1 
    
    //Alquiler Subaru
     public void vehiculo2 (){  
     String marca = "Subaru";
     String modelo = "Forester";
     String color = "Azul";
     int año = 2017;
     String motor = "2500cc Diesel";
     String traccion = "4x2";
     String kilometraje = "23,000km";    

     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);   
         
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo2
    
    //Alquiler Nissan     
    public void vehiculo3 (){   
     String marca = "Nissan";
     String modelo = "Qashqai";
     String color = "Blanco";
     int año = 2018;
     String motor = "1600cc Gasolina";
     String traccion = "4WD";
     String kilometraje = "18,000km";          
        
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
     
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo3
    
    //Alquiler Ford
    public void vehiculo4(){
     String marca = "Ford";
     String modelo = "Escape";
     String color = "Vino";
     int año = 2018;
     String motor = "1600cc Gasolina";
     String traccion = "Delantera";
     String kilometraje = "10,000km";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
        
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo4
    
    //Alquiler Mitsubishi
    public void vehiculo5(){
     String marca = "Mitsubishi";
     String modelo = "Mirage";
     String color = "Blanco";
     int año = 2019;
     String motor = "1400cc Gasolina";
     String traccion = "Delantera";
     String kilometraje = "15,000km";       
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
  
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo5 
    
    //Alquiler Hyundai
    public void vehiculo6(){
     String marca = "Hyundai";
     String modelo = "Elantra";
     String color = "Azul";
     int año = 2017;
     String motor = "2000cc Gasolina";
     String traccion = "Delantera";
     String kilometraje = "13,000km";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
 
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo6
    
    //Venta Toyota
   public void vehiculo7(){
     String marca = "Toyota";
     String modelo = "Corolla S";
     String color = "Negro";
     int año = 2019;
     String motor = "1800cc Gasolina";
     String traccion = "Delantera";
     String kilometraje = "0 km";
     String precio = "$20,000";
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
     System.out.println("Precio: "+precio);
     
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo7
    
    //Venta Subaru
     public void vehiculo8 (){  
     String marca = "Subaru";
     String modelo = "Forester";
     String color = "Blanco";
     int año = 2019;
     String motor = "2500cc Diesel";
     String traccion = "4x2";
     String kilometraje = "0 km";    
     String precio = "$24,000";
     
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);   
     System.out.println("Precio: "+precio);
     
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo2
    
    //Venta Nissan     
    public void vehiculo9(){   
     String marca = "Nissan";
     String modelo = "Qashqai";
     String color = "Blanco";
     int año = 2019;
     String motor = "1600cc Gasolina";
     String traccion = "4x2";
     String kilometraje = "0 km";          
     String precio = "$28,000";
     
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
     System.out.println("Precio: "+precio);
     
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo9
    
    //Venta Ford
    public void vehiculo10(){
     String marca = "Ford";
     String modelo = "Escape";
     String color = "Negro";
     int año = 2019;
     String motor = "1600cc Gasolina";
     String traccion = "Delantera";
     String kilometraje = "0 km";
     String precio = "$26,000";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
     System.out.println("Precio: "+precio);
        
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo10
    
    //Venta Mitsubishi
    public void vehiculo11(){
     String marca = "Mitsubishi";
     String modelo = "Mirage";
     String color = "Blanco";
     int año = 2019;
     String motor = "1400cc Gasolina";
     String traccion = "Delantera";
     String kilometraje = "0 km";
     String precio = "$9,000";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
     System.out.println("Precio: "+precio);
  
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo11 
    
    //Venta Hyundai
    public void vehiculo12(){
     String marca = "Hyundai";
     String modelo = "Elantra";
     String color = "Azul";
     int año = 2019;
     String motor = "2000cc Gasolina";
     String traccion = "Delantera";
     String kilometraje = "0 km";
     String precio = "$14,000";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
     System.out.println("Precio: "+precio);
 
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo12
    
    //Venta BMW
    public void vehiculo13(){
     String marca = "BMW";
     String modelo = "M4 Coupé";
     String color = "Naranja";
     int año = 2019;
     String motor = "3000cc 6Cilindros Gasolina";
     String traccion = "";
     String kilometraje = "0 km";
     String precio = "$75,000";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
     System.out.println("Precio: "+precio);
 
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo13
    
    //Venta Mercedes-Benz
    public void vehiculo14(){
     String marca = "Mercedes-Benz";
     String modelo = "Clase S Coupé";
     String color = "Plateado";
     int año = 2019;
     String motor = "3000cc V6 Gasolina";
     String traccion = "Delantera";
     String kilometraje = "0 km";
     String precio = "$84,000";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
     System.out.println("Precio: "+precio);
 
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo14
    
    //Alquiler Ford
    public void vehiculo15(){
     String marca = "Ford";
     String modelo = "Ranger";
     String color = "Azul";
     int año = 2016;
     String motor = "3200cc Diesel";
     String traccion = "4x4";
     String kilometraje = "1,500 km";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
 
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo15
    
    //Alquiler Toyota
    public void vehiculo16(){
     String marca = "Toyota";
     String modelo = "Hilux";
     String color = "Gris";
     int año = 2018;
     String motor = "2800cc Diesel";
     String traccion = "4x4";
     String kilometraje = "5,000 km";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
 
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo16
    
    //Venta Isuzu
    public void vehiculo17(){
     String marca = "Isuzu";
     String modelo = "D-Max ";
     String color = "Rojo";
     int año = 2017;
     String motor = "2500cc Diesel";
     String traccion = "4x4";
     String kilometraje = "7,800 km";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
 
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo17
    
    //Venta Ford
    public void vehiculo18(){
     String marca = "Ford";
     String modelo = "Ranger";
     String color = "Blanco";
     int año = 2019;
     String motor = "3200cc Diesel";
     String traccion = "4x4";
     String kilometraje = "0 km";
     String precio = "$46,000";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
     System.out.println("Precio: "+precio);
 
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo18
    
    //Venta Toyota
    public void vehiculo19(){
     String marca = "Toyota";
     String modelo = "Hilux";
     String color = "Negra";
     int año = 2019;
     String motor = "2800cc Diesel";
     String traccion = "4x4";
     String kilometraje = "0 km";
     String precio = "$48,500";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
     System.out.println("Precio: "+precio);
 
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo19
    
    //Venta Isuzu
    public void vehiculo20(){
     String marca = "Isuzu";
     String modelo = "D-Max";
     String color = "Gris";
     int año = 2019;
     String motor = "2500cc Diesel";
     String traccion = "4x4";
     String kilometraje = "0 km";
     String precio = "$49,900";        
    
     System.out.println("Marca: "+marca);
     System.out.println("Modelo: "+modelo);
     System.out.println("Color: "+color);
     System.out.println("Año: "+año);
     System.out.println("Motor: "+motor);
     System.out.println("Tracción: "+traccion);
     System.out.println("Kilometraje: "+kilometraje);
     System.out.println("Precio: "+precio);
 
     System.out.println("----------------------------------------------------");
    }//Fin vehiculo20
    
}//Fin class
