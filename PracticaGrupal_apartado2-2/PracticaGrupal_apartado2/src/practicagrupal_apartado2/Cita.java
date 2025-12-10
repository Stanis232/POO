package practicagrupal_apartado2;

import java.time.LocalDateTime;


public class Cita {
    private LocalDateTime fechaHora;
    private boolean anulada;
    private String causaAnulacion;
    
    private Paciente paciente;
    private Medico medico;
    
    public Cita(LocalDateTime fh, Paciente p, Medico m){
        if(fh.isAfter(LocalDateTime.now()) && p != null && m != null){
            fechaHora = fh;
            anulada = false;
            causaAnulacion = null;
            paciente = p;
            medico = m;
        }
    }
    
    //Getters
    public LocalDateTime getFechaHora(){
        return fechaHora;
    }
    
    public boolean getAnulada(){
        return anulada;
    }
    
    public String getCausaAnulacion(){
        return causaAnulacion;
    }
    
    public Paciente getPaciente(){
        return paciente;
    }
    
    public Medico getMedico(){
        return medico;
    }
    
    //Setters
    public boolean setFechaHora(LocalDateTime fh){
        if(fh.isAfter(LocalDateTime.now())){
            fechaHora = fh;
            return true;
        }
        return false;
    }
    
    public void setAnulada(boolean anular){
        anulada = anular;
    }
    
    public void setCausaAnulacion(String causa){
        if(anulada == true){
            causaAnulacion = causa;
        }
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Cita c = (Cita)o;
        return fechaHora.equals(c.fechaHora) && paciente.equals(c.paciente);
    }
}
