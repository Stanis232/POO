/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebauml;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author stanis
 */

public class Cita {
    private LocalDateTime fechaHora;
    private String especialidad;
    private boolean cancelada;
    private String causaCancelacion;
    private LocalDate fechaCancelacion;
    private LocalDateTime fechaSolicitud;
    
    // Asociación
    private Paciente paciente;
    private PersonalSanitario profesional;
}
