
package practicagrupal_apartado2;

import java.util.ArrayList;


public class Admin extends Usuario {
    private Plantilla gestorPersonal;
    private ListaPaciente gestorPacientes;
    
    
    public Admin(String DNI, long CIPA, Plantilla p, ListaPaciente lp) {
        super(DNI, CIPA);
        gestorPersonal = p;
        gestorPacientes = lp;
    }
    public boolean darAltaPacientes(Paciente paciente){
        return this.gestorPacientes.agregar(paciente);
        //falta ver a qn ha añadido con el getDNI
    }
     public boolean darBajaPacientes(Paciente paciente){
        return this.gestorPacientes.eliminar(paciente);
        //falta ver a qn ha añadido con el getDNI
    }
     
     public boolean darDeAltaPersonal(Usuario nuevoPersonal) {
       return this.gestorPersonal.agregar(nuevoPersonal);
    }
     
     public boolean darDeBajaPersonal(Usuario usuario) {
         return this.gestorPersonal.eliminar(usuario);
    }
    
}

