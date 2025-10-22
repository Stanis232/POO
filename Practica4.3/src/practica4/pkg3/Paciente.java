/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4.pkg3;

/**
 *
 * @author stanis
 */
public class Paciente {
    private String nombre;
    private int edad, siguiente;
    private double peso, altura;
    private CondicionDeSalud[] condi = new CondicionDeSalud[5];
    

    public Paciente(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
   public boolean agregarCondicion(CondicionDeSalud con){
       if(siguiente==5){
           return false;
           
       }
       for (int i = 0; i <= this.siguiente; i++) {
            if(con.equals(this.condi[i])){
                return false;
        }
            
    }
       this.condi[this.siguiente]=con;
       this.siguiente++;
      return true; 
   }
    public boolean actualizarCondicion(CondicionDeSalud con1, CondicionDeSalud con2){
       if(siguiente==5){
           return false;
           
       }
       for (int i = 0; i <= this.siguiente; i++) {
            if(con1.equals(this.condi[i])){
                return false;
        }
            
    }
       this.condi[this.siguiente]=con2;
      return true; 
   }
   
}

    
    

