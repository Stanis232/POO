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
public class Agenda {
    // Agregación de Citas
    private List<Cita> citas;

    public List<LocalDateTime> buscarDisponibilidad(LocalDateTime desde) { return null; }
    public boolean agendarCita(Cita c) { return false; }
}