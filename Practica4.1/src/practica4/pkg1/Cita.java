/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4.pkg1;

/**
 *
 * @author stanis
 */
public class Cita {
    private String titulo;
    private Fecha fecha;
    //lo he hecho asi pero no se si esta bien?
    private int siguiente;
    private Persona[] asistentes = new Persona[5];

    public Cita(String titulo, Fecha fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.siguiente=0;
    }
    
    public boolean anadirAsistente(Persona per){
        if(this.siguiente==5){
            return false;
        }
        
         for(int i=0; i<this.siguiente; i++){
           //habia hecho esto sen.equals(this.sensores) sin la i y era como comparar un manzana con una caja de manzana
             if (per.equals(this.asistentes[i])) {
                 
                 return false;
             
             
             }
        }
         this.asistentes[this.siguiente]= per;
        this.siguiente++;
        return true;
        
    }

   /* @Override
    public String toString() {
        return "Cita{" + "titulo=" + titulo + ", fecha=" + fecha + ", siguiente=" + siguiente + ", asistentes=" + asistentes + '}';
    }*/

    @Override
    public String toString() {
        
        
        
            String    aux = "**********************************\ntitulo: " + titulo + "**********************************\nfecha: " + fecha;

         aux += "**********************************\nasistentes: ";
        for (int i = 0; i < siguiente; i++) {
            aux += asistentes[i].toString() + "\n";
        }
        
           return aux;
    }
    
    
    
    
    
    
}
