/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebauml;

import java.time.LocalDate;

/**
 *
 * @author stanis
 */
public class Consulta {
    private LocalDate fecha;
    private String motivo;
    private TipoConsulta tipoConsulta;
    private String centro;
    private String especialidad;
    private TipoInforme tipoInforme;
    
    // Asociación
    private PersonalSanitario profesional;
}