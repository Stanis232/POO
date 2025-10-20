/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4.pkg1;

/**
 *
 * @author stanis
 */
public class Persona {
    private String nombre, idUsuario;

    public Persona(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }
    public boolean equals(Object p){
        if(this==p)return true;
        if(p==null)return false;
        if(getClass()!=p.getClass()) return false;
        Persona per = (Persona) p;
        //depende del tipo contenido se tiene que comparar con == o equals en el case de String es con equals
        return (this.getIdUsuario().equals(per.getIdUsuario()));
    }
}
