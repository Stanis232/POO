/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicagrupal_apartado2;

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

    public void setTelefonica(boolean telefonica) {
        if(medico.getEspecialidad() == Especialidad.MEDICINA_GENERAL || medico.getEspecialidad() == Especialidad.ENFERMERO){
            this.telefonica = true;
        } else this.telefonica = false;
    }

    public void prescribirMedicacion(Medicamento m) {
        if (m == null) return;

        System.out.println("Prescribiendo " + m.getNombre() + "...");

        // "En caso de ser tratamiento crónico, se pondrá una fecha de finalización de al menos 10 años"
        if (m.esCronico()) {
            // Calculamos la fecha: hoy + 10 años
            // Usamos la fecha de la consulta como referencia de inicio
            m.setFechaFin(this.fecha.toLocalDate().plusYears(10));
            System.out.println(" -> Tratamiento crónico detectado. Fecha fin establecida a: " + m.getFechaFin());
        } else {
             System.out.println(" -> Tratamiento puntual.");
        }
    }
    
    
    
}
