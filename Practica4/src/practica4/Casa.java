/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author stanis
 */
public class Casa {
    private boolean sensoresActivados;
    
    private Sensor[] sensores = new Sensor[10];
    
    private Evento[] evento = new Evento[10];
    private int contadorSensores,contadorEventos;

    public Casa() {
        this.sensoresActivados = false;
        this.contadorSensores = 0;
        this.contadorEventos = 0;
    }
    
    public boolean añadirSensor(int id, String ip){
        if(this.contadorSensores==10){
            return false;
        }
        Sensor sen = new Sensor(id, ip);
         for(int i=0; i<this.contadorSensores; i++){
           //habia hecho esto sen.equals(this.sensores) sin la i y era como comparar un manzana con una caja de manzana
             if (sen.equals(this.sensores[i])) {
                 
                 return false;
             
             
             }
        }
         
         this.sensores[this.contadorSensores]= sen;
        this.contadorSensores++;
        return true;
    }
     public boolean añadirSensor(int id){
        if(this.contadorSensores==10){
            return false;
        }
        Sensor sen = new Sensor(id);
         for(int i=0; i<this.contadorSensores; i++){
           //habia hecho esto sen.equals(this.sensores) sin la i y era como comparar un manzana con una caja de manzana
             if (sen.equals(this.sensores[i])) {
                 
                 return false;
             
             
             }
        }
         
         this.sensores[this.contadorSensores]= sen;
        this.contadorSensores++;
        return true;
    }
    


}
    
    

