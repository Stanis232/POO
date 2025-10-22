/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4.pkg3;

/**
 *
 * @author stanis
 */
public class Recomendacion {
    private String descripcion;
    private CondicionDeSalud[] condi;

    public Recomendacion(String descripcion, CondicionDeSalud[] condi) {
        this.descripcion = descripcion;
        this.condi = condi;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public CondicionDeSalud[] getCondi() {
        return condi;
    }
    
}
