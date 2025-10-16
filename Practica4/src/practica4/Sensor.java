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

    public Sensor(int id, boolean activado, Camara camara) {
        this.id = id;
        this.activado = activado;
        this.camara = camara;
    }

    public Sensor(int id, boolean activado) {
       this(id,activado,null);
    }
    
    
}
