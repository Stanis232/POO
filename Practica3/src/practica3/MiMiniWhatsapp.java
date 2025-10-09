/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author stanis
 */
public class MiMiniWhatsapp {
   private int siguiente;

private Mensaje[] mensajes = new Mensaje[100];
    private Contacto dueño ;

    public MiMiniWhatsapp(Contacto dueño) {
        this.dueño = dueño;
        this.siguiente=0;
        
    }
    public boolean enviarMensajes(Mensaje mensaje){
        if(this.siguiente==100){
            return false;
        }
        //me voy jejeje
        return false;
    }
}
