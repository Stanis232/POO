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
    
    public boolean anadirSensor(int id, String ip){
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
     public boolean anadirSensor(int id){
       return anadirSensor(id,null);
    }
    //repasar esto pq tengo lio de cuando o no tiene que ser void o boolean, pq lo he hecho con boolean pero no tiene pq devolver falso, preguntar a falax
      public void anadirEvento(TipoEvento tipo, String msj){
        if(this.contadorEventos<10){
            Evento eve = new Evento(tipo, msj);
             
         
         
         this.evento[this.contadorEventos]= eve;
        this.contadorEventos++;
        }
        
        
        
     
    }
      public void cambiarEstadoAlarma(){
          //asi le da la vuelta a loos booleanos, curioso pq no lo sabia
           this.sensoresActivados = !this.sensoresActivados;

    
    for (int i = 0; i < this.contadorSensores; i++) {
      //asi los va actualizando uno a uno en el for
        this.sensores[i].setActivado(this.sensoresActivados);
    }
                 
      }

   //repasar esto pq lo he metido conla ia y me da pereza hahaha, mañana lo reviso
      public String toString() {
    // Usamos un StringBuilder porque es más eficiente para construir Strings largos
    StringBuilder sb = new StringBuilder();
    sb.append("CASA: ");
    sb.append(this.sensoresActivados ? "Alarma activada" : "Alarma desactivada");
    sb.append("\n");

    // Recorremos los sensores y añadimos la info de cada uno
    sb.append("SENSORES: \n");
    for (int i = 0; i < this.contadorSensores; i++) {
        Sensor s = this.sensores[i];
        sb.append("\t- Sensor ").append(s.getId());
        if (s.getCamara() != null) {
            sb.append(" (Cámara IP: ").append(s.getCamara().getIp()).append(")");
        }
        // Para que el toString funcione, necesitamos un getter para 'activado' en Sensor.java
        // Añade public boolean isActivado() { return this.activado; } a tu clase Sensor
        sb.append(s.isActivado() ? " [Activado]\n" : " [Desactivado]\n");
    }

    // Recorremos los eventos y añadimos la info de cada uno
    sb.append("EVENTOS: \n");
    for (int i = 0; i < this.contadorEventos; i++) {
        Evento e = this.evento[i];
        sb.append("\t- ").append(e.getTipoevento()).append(": ").append(e.getMensaje()).append("\n");
    }

    return sb.toString();
}


}
    
    

