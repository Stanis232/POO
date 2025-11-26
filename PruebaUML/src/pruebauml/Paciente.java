/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebauml;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author stanis
 */
public class Paciente extends Usuario {
    private String direccion;
    private String telefono;
    
    // Composición: La tarjeta y el historial pertenecen al paciente
    private TarjetaSanitaria tarjetaSanitaria;
    private HistorialClinico historial;
    
    // Asociación: Lista de citas agendadas
    private List<Cita> citasAgendadas;

    public void modificarTelefono(String nuevoTelefono) {}
    public Cita solicitarNuevaCita(String especialidad) { return null; }
    public boolean modificarCita(Cita cita, LocalDateTime nuevaFecha) { return false; }
    public void cancelarCita(Cita cita, String motivo) {}
}