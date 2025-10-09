/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author stanis
 */
public class Contacto {
    private String nombre;
    private String email;
    private int telefono;

    

    public Contacto(String nombre, String email, int telefono) {
        this.nombre = nombre;
        
        this.email = email;
        if (telefono>0) {
            this.telefono = telefono;
        }
        
    }

    public Contacto(String nombre, int telefono) {
        //esto se supone que es para optimizar y que llame al constructor de arriba para asi ahorrarnos hacer el if 2 veces
        this(nombre,null,telefono);
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        if (this.email !=null) {
                    return "Contacto{" + "nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + '}';

        }                    return "Contacto{" + "nombre=" + nombre + ", telefono=" + telefono + '}';

    }
    
    
    
    
    
}
