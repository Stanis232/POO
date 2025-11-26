/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebauml;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author stanis
 */
public abstract class PersonalSanitario extends Usuario {
    
    // Composición: La agenda pertenece al sanitario
    private Agenda agendaDigital;
    
    // Asociación: Pacientes que tiene asignados
    private List<Paciente> pacientesAsignados;

    public void visualizarAgenda(LocalDate dia) {}
    public void reagendarDiaCompleto(LocalDate dia) {}
    public void prescribirMedicacion(Paciente p, Medicamento m) {}
    public HistorialClinico accederHistorial(Paciente p) { return null; }
}
