/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicagrupal_apartado2;

import java.time.LocalDate;

/**
 *
 * @author stanis
 */
public class Medicamento {
    
    private String nombre;       
    private int dosis;           
    private int frecuencia;    
    private boolean cronico;     
    private LocalDate fechaInicio; 
    private LocalDate fechaFin;
    
    
    public Medicamento(String nombre, int dosis, int frecuencia, boolean cronico, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.cronico = cronico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
        public String getNombre() {
        return nombre;
    }

    public int getDosis() {
        return dosis;
    }

    public int getFrecuencia() {
        return frecuencia;
    }
    
    public boolean esCronico() {
        return cronico;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicamento c = (Medicamento) o;
        return nombre.equals(c.nombre);
    }

    @Override
    public String toString() {
        return "Medicamento{" + "nombre=" + nombre + ", dosis=" + dosis + ", frecuencia=" + frecuencia + ", cronico=" + cronico + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

}
