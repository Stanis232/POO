/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author stanis
 */
public class Sensor {
      private int id;
    private boolean activado;
    private Camara camara;

    public Sensor(int id, String ip) {
        this.id = id;
        this.activado=false;
        this.camara = new Camara(ip);
    }

    public int getId() {
        return id;
    }
    public Sensor(int id) {
    this.id = id;
    this.activado = false;
    this.camara = null;
}

   public boolean equals(Object p){
        if (this==p) return true;
        if (p==null) return false;
        if(getClass()!=p.getClass()) return false;
        Sensor otroSensor = (Sensor) p;
        
        if (this.id != otroSensor.getId()) {
        return false;
    }
        
        //se debe hacer dos equalls yo pensaba con solo la clase Sensor valia, pero no en la clase 
        if(this.camara != null){
            return this.camara.equals(otroSensor.getCamara());
        }
        return otroSensor.getCamara() == null;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }

    public boolean isActivado() {
        return activado;
    }

    
  
    
    
}
