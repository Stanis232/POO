package practicagrupal_apartado2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class AgendaCita {
    
    private ArrayList<Cita> citas;
    
    public AgendaCita(){
        citas = new ArrayList<>();
    }
    
    public boolean agendarCita(Cita c, Medico m){
        if(c == null || m == null) return false;
        
        
      if(m.getMAXCITASDIARIAS() <= contarCitasActivas(m, c.getFechaHora().toLocalDate())){
        return false;
    }
      
      
        for(Cita existente : citas){
        if(existente.getFechaHora().equals(c.getFechaHora()) && 
           !existente.getAnulada() && 
           existente.getMedico().equals(m)) { 
            return false; 
        }
    }

    
    citas.add(c);
    return true;
        
        
        
    }
    
    public LocalDateTime buscarDisponibilidad(LocalDateTime fechaPropuesta){
    LocalDateTime fecha = fechaPropuesta;
    boolean ocupado;

   
    do {
        ocupado = false;
        for(Cita c : citas){
            
            if(c.getFechaHora().equals(fecha) && !c.getAnulada()){
                ocupado = true;
                break; 
            }
        }
        
        if(ocupado){
            fecha = fecha.plusMinutes(15); 
        }
    } while(ocupado);
    
    return fecha;
}
    
    public boolean cancelarCitaAgenda(Cita c, String causa){
        if(c == null || causa == null) return false;
        
        for(Cita cita: citas){
            if(cita.equals(c)){
                cita.setAnulada(true);
                cita.setCausaAnulacion(causa);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Cita> verCitasPorDia(LocalDateTime fecha){
        ArrayList<Cita> c = new ArrayList<> ();
        LocalDate diaBuscado = fecha.toLocalDate();
        
        for(Cita cita: citas){
            if(diaBuscado.equals(cita.getFechaHora().toLocalDate())){
                c.add(cita);
            }
        }
        return c;
    }
    
    
    public ArrayList<Cita> reagendarDia(LocalDate fechaActual, Medico m) {
        
        LocalDate nuevaFecha = buscarProximaFechaDisponible(m, fechaActual.plusDays(1));
        
        if (nuevaFecha == null) {
            return new ArrayList<>(); 
        }
        
        ArrayList<Cita> citasModificadas = new ArrayList<>();
        
        for (Cita cita : this.citas) {
            
            if (cita.getMedico() != null && cita.getMedico().equals(m) && 
                cita.getFechaHora().toLocalDate().equals(fechaActual) && 
                !cita.getAnulada()) {
                
                LocalDateTime nuevaFechaHora = nuevaFecha.atTime(cita.getFechaHora().toLocalTime());
                cita.setFechaHora(nuevaFechaHora); 
                citasModificadas.add(cita);
            }
        }
        return citasModificadas;
    }

    
   private long contarCitasActivas(Medico medico, LocalDate fecha) {
        long contador = 0;
        for (Cita c : this.citas) {
            if (c.getMedico() != null && c.getMedico().equals(medico) && 
                c.getFechaHora().toLocalDate().equals(fecha) && 
                !c.getAnulada()) {
                contador++;
            }
        }
        return contador;
    }
   
   private LocalDate buscarProximaFechaDisponible(Medico medico, LocalDate inicioBusqueda) {
        LocalDate fecha = inicioBusqueda;
        for (int i = 0; i < 365; i++) {
            if (this.contarCitasActivas(medico, fecha) < medico.getMAXCITASDIARIAS()) { 
                return fecha; 
            }
            fecha = fecha.plusDays(1);
        }
        return null;
   }
}