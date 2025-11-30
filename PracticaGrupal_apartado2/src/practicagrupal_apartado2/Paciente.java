
package practicagrupal_apartado2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Paciente extends Usuario{
    private String nombre, direccion;
    private long telefono;
    
    public Paciente(String nom, String dir, long tel, long cipa, String dni){
        super(dni,cipa);
        nombre = nom;
        direccion = dir;
        if(tel > 0){
            telefono = tel;
        }
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public long getTelefono(){
        return telefono;
    }
    
    public void setNombreCompleto(String nuevoNombre){
        nombre = nuevoNombre;
    }
    
    public void setDireccion(String nuevaDireccion){
        direccion = nuevaDireccion;
    }
    
    
    public boolean modificarTelefono(long tel){
        if(tel > 0){
            telefono = tel;
            return true;
        }
        return false;
    }
    
    public Cita solicitarNuevaCita(AgendaCita agenda, LocalDateTime fechaDeseada, Medico m){
        if(agenda == null || fechaDeseada == null) return null;
        
        LocalDateTime fechaFinal = agenda.buscarDisponibilidad(fechaDeseada);
        
        Cita nueva = new Cita(fechaFinal, this, m);
        
        if(agenda.agendarCita(nueva,m)){
            
            return nueva;
        }
        
        return null;
    }
    
    public boolean modificarCita(AgendaCita agenda, Cita cita, LocalDateTime nuevaFecha){
        if(agenda == null || cita == null || nuevaFecha == null) return false;
        
        if(!this.equals(cita.getPaciente())) return false;
        
        LocalDateTime fechaLibre = agenda.buscarDisponibilidad(nuevaFecha);
        
        return cita.setFechaHora(fechaLibre);
    }
   
    
    public boolean cancelarCita(Cita c, String causa, AgendaCita agenda){
        if(c == null || causa == null || agenda == null) return false;
        return agenda.cancelarCitaAgenda(c, causa);
    }
    
}
