/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4.pkg3;

/**
 *
 * @author stanis
 */
public class CondicionDeSalud {
    private String nombre;
    private boolean cronica;

    public CondicionDeSalud(String nombre, boolean cronica) {
        this.nombre = nombre;
        this.cronica = cronica;
    }

    public CondicionDeSalud(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isCronica() {
        return cronica;
    }
    
   public boolean equals(Object p){
       if (this==p) return true;
       if (p==null) return false;
       if(getClass()!=p.getClass()) return false;
       CondicionDeSalud a = (CondicionDeSalud) p;
       return(getNombre().equals(a.getNombre()) && isCronica() == a.isCronica());
           
       
   }
}
