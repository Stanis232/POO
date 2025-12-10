package practicagrupal_apartado2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Medico extends Usuario{
    private String centro;
    private final Especialidad especialidad;
    private static final int MAXCITASDIARIAS = 20;
    private AgendaCita agenda;
    
    public Medico(String DNI, long CIPA, String c, Especialidad e){
        super(DNI, CIPA);
        centro = c;
        especialidad = e;
    }
    
    public void prescribirMedicacion(Paciente paciente, Medicamento m, LocalDate fechaConsulta) {
        if (paciente == null || m == null) return;

        m.setFechaInicio(fechaConsulta);

        if (m.esCronico()) {
            m.setFechaFin(fechaConsulta.plusYears(10));
        }

        paciente.addMedicamento(m);
    }

    public String getCentro() {
        return centro;
    }
    
    public int getMAXCITASDIARIAS(){
        return MAXCITASDIARIAS;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
    
    public ArrayList<Cita> visualizarAgenda(LocalDateTime fecha){
        return agenda.verCitasPorDia(fecha);
    }
    
    public void consultarHistorialPaciente(Paciente p) {
        if (tienePacienteAsignado(p)) {
            System.out.println("Acceso autorizado. Mostrando historial clínico de: " + p.getDNI());
            p.getHistorial().historialConsultas(p);
            p.getHistorial().historialPruebas(p);
            
            System.out.println("--- Medicación Activa ---");
            
            p.getHistorial().historialPrescripciones(p);
        } else {
            System.out.println("ACCESO DENEGADO: El paciente " + p.getDNI() + " no está en su agenda hoy.");
        }
    }

    private boolean tienePacienteAsignado(Paciente p) {
        if (this.agenda == null) return false;
        
        ArrayList<Cita> citasHoy = this.agenda.verCitasPorDia(java.time.LocalDateTime.now());
        
        for (Cita c : citasHoy) {
            if (c.getPaciente().equals(p)) {
                return true;
            }
        }
        return false;
    }

  
}
