
package practicagrupal_apartado2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Paciente extends Usuario{
    private String nombre, direccion;
    private long telefono;
    private ArrayList<Medicamento> medicamentos;
    private Historial historial;
    
    public Paciente(String nom, String dir, long tel, long cipa, String dni, Historial h){
        super(dni,cipa);
        nombre = nom;
        direccion = dir;
        if(tel > 0){
            telefono = tel;
        }
        medicamentos = new ArrayList<>();
        historial = h;
    }
    
    public Paciente(String nom, String dir, long tel, long cipa, String dni){
        super(dni,cipa);
        nombre = nom;
        direccion = dir;
        if(tel > 0){
            telefono = tel;
        }
        medicamentos = new ArrayList<>();
    }
    

    public void addMedicamento(Medicamento m) {
        if (m != null) {
            this.medicamentos.add(m);
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
    
    public void mostrarMedicamentos(Paciente p){
        LocalDate fActual = LocalDate.now();
        for(Medicamento m: medicamentos){
            if(m instanceof Medicamento){
                if(m.getFechaFin().isAfter(fActual)){
                    System.out.println("-- Tratamiento Pasado --");
                    System.out.println(m.toString());
            }
                else if(m.getFechaFin().isBefore(fActual) || m.getFechaFin() == null){
                    System.out.println("-- Tratamiento Activo --");
                    System.out.println(m.toString());
                }
            }
            
            else if(m instanceof Vacuna){
                Vacuna v = (Vacuna) m;
                System.out.println(v.toString());
            }
            
        }
    }
    
}
