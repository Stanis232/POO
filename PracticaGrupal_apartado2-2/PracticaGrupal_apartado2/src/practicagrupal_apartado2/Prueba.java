package practicagrupal_apartado2;

import java.time.LocalDateTime;

public class Prueba {
    private LocalDateTime fecha;
    private String centro;
    private String rutaInforme;
    
    public Prueba(LocalDateTime fecha, String centro, String rutaInforme) {
        this.fecha = fecha;
        this.centro = centro;
        this.rutaInforme = rutaInforme;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getRutaInforme() {
        return rutaInforme;
    }

    public void setRutaInforme(String rutaInforme) {
        this.rutaInforme = rutaInforme;
    }

    
    
    @Override
    public String toString() {
        return "Prueba{" + "fecha=" + fecha + ", centro=" + centro + ", rutaInforme=" + rutaInforme + '}';
    }
    
    
    
}
