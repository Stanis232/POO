package practicagrupal_apartado2;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Consulta {
    private String motivo;
    private boolean telefonica;
    private boolean informeSeguimiento;
    private Medico medico;
    private LocalDateTime fecha;
    private TipoConsulta tipo;
    private String centro;
    private String especialidad;
    private TipoInforme tipoInforme;

    public Consulta(String motivo, boolean informeSeguimiento, Medico medico, LocalDateTime fecha, TipoConsulta tipo, String centro, TipoInforme tipoInforme) {
        this.motivo = motivo;
        
        if(medico.getEspecialidad() == Especialidad.MEDICINA_GENERAL || medico.getEspecialidad() == Especialidad.ENFERMERO){
            this.telefonica = true;
        } else this.telefonica = false; 
        
        this.informeSeguimiento = informeSeguimiento;
        this.medico = medico;
        this.fecha = fecha;
        this.tipo = tipo;
        this.centro = centro;
        this.especialidad = medico.getEspecialidad().toString();
        this.tipoInforme = tipoInforme;
    }

    public String getMotivo() {
        return motivo;
    }

    public boolean isTelefonica() {
        return telefonica;
    }

    public boolean isInformeSeguimiento() {
        return informeSeguimiento;
    }

    public Medico getMedico() {
        return medico;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public TipoConsulta getTipo() {
        return tipo;
    }

    public String getCentro() {
        return centro;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public TipoInforme getTipoInforme() {
        return tipoInforme;
    }
    
    

    public void setTelefonica(boolean telefonica) {
        if(esCitaTelefonica()){
            this.telefonica = true;
        } else this.telefonica = false;
    }


    public boolean esCitaTelefonica(){
         if(medico.getEspecialidad() == Especialidad.MEDICINA_GENERAL || medico.getEspecialidad() == Especialidad.ENFERMERO){
            return true;
        } else return false;
    }
    
    
    
    public void prescribirMedicacion(Medicamento m, Paciente paciente) {
        if (m != null) {
            this.medico.prescribirMedicacion(paciente, m, LocalDate.EPOCH);
        } else{
            System.out.println("No se pudo prescribir el medicamento");
        }
    }

    @Override
    public String toString() {
        return "Consulta{" + "motivo=" + motivo + ", telefonica=" + telefonica + ", informeSeguimiento=" + informeSeguimiento + ", medico=" + medico + ", fecha=" + fecha + ", tipo=" + tipo + ", centro=" + centro + ", especialidad=" + especialidad + ", tipoInforme=" + tipoInforme + '}';
    }
    
}
