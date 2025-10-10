/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author stanis
 */
public class Mensaje {
    private String mensaje;
    private Contacto origen;
    private Contacto destino;

    public Mensaje(String mensaje, Contacto origen, Contacto destino) {
        
       
        if(mensaje!=null && !origen.equals(destino)){
            this.origen = origen;
            this.destino = destino;
            this.mensaje = mensaje;
        }
        
    }
     

    public String getMensaje() {
        return mensaje;
    }
    
}
