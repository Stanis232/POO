/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicagrupal;

/**
 *
 * @author stanis
 */
public class Usuario {
    private String DNI;
    private long CIPA;
    
    
    public Usuario(String DNI, long CIPA){
        this.DNI = DNI;
        this.CIPA = CIPA;
    }

    public String getDNI() {
        return DNI;
    }

    public long getCIPA() {
        return CIPA;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        
        Usuario u = (Usuario) obj;
        
        return (DNI.equals(u.getDNI()) && CIPA == u.getCIPA());
    }
    
    
}
