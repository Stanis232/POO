/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto4.pkg2;

/**
 *
 * @author stanis
 */
public class Asignatura {
    private int siguiente;
    private Alumno[] alumni= new Alumno[100];

    public Asignatura() {
        this.siguiente = 0;
    }
    public boolean anadirAlumno(Alumno alum){
        
        if(this.siguiente==100){
            return false;
        }
        for(int i=0; i<this.siguiente; i++){
            if(alum.equals(this.alumni[i])){
                return false;
            }
          
        }
        
        this.alumni[this.siguiente]= alum;
        this.siguiente++;
        return true;
    }

    @Override
    public String toString() {
        
        String aux = "Alumnos: ";
        
        for(int i=0; i<this.siguiente; i++){
            aux+= alumni[i].toString()+ "\n";
            
            }
          return aux;
        }
        
    }
    

