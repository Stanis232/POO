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

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

   
   public boolean equals(Object p){
       if(this==p) return true;
       if(p==null) return false;
       if(getClass()!=p.getClass()) return false;
       Alumno a= (Alumno) p;
       return ((getTelefono()==a.getTelefono() && (getNombre().equals(a.getNombre()))));
   }

    @Override
    public String toString() {
        
         String aux = "nombre=" + nombre + ", telefono=" + telefono;
        
        for(int i=0; i<2; i++){
            
            if (conv[i] != null) {
    // Si no es nulo, entonces sí podemos usarlo.
    aux += conv[i].toString() + "\n";
}
            
            }
          return aux;
        }
        
    }
  
          
          

