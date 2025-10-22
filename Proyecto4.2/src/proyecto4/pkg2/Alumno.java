/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto4.pkg2;

/**
 *
 * @author stanis
 */
public class Alumno {
    private String nombre; 
    private int telefono;
    
   private Convocatoria[] conv= new Convocatoria[2];

    public Alumno(String nombre, int telefono) {
        this.nombre = nombre;
        
        if (telefono>0) {
             this.telefono = telefono;
        }else this.telefono=0;
       
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
   
  
          
          
}
