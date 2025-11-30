package practicagrupal_apartado2;

import java.util.ArrayList;

/**
 *
 * @author stanis
 */
public class ListaPaciente {
    private ArrayList<Paciente> pacientes;

    public ListaPaciente() {
        this.pacientes = new ArrayList<>();
    }
    public boolean agregar(Paciente paciente){
        if(!this.pacientes.contains(paciente)){
            return pacientes.add(paciente);
        }
        else{
            return false;        
        }
    }
     public boolean eliminar(Paciente paciente){
        
         return pacientes.remove(paciente);
    }
    
    
}
