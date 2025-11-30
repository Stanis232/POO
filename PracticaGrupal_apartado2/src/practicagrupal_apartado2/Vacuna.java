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
public class Vacuna extends Medicamento{
    
    private LocalDate fechaSiguienteDosis;

    public Vacuna(String nombre, int dosis, LocalDate fechaAdministracion, LocalDate fechaSiguienteDosis) {
        super(nombre, dosis, 0, false, fechaAdministracion, null);
        
        this.fechaSiguienteDosis = fechaSiguienteDosis;
    }
    public LocalDate getFechaSiguienteDosis() {
        return fechaSiguienteDosis;
    }

    public void setFechaSiguienteDosis(LocalDate fechaSiguienteDosis) {
        this.fechaSiguienteDosis = fechaSiguienteDosis;
    }
    
    //para saber si es necesaria otra dosis
    public boolean requiereSegundaDosis() {
        return fechaSiguienteDosis != null;
    }

   @Override
    public String toString() {
        String info = "Vacuna: " + getNombre() + " (numero de dosis:  " + getDosis() + ")";
        info += ", Fecha Admin: " + getFechaInicio();
        //esto es para ver si se necesita segunda dosis 
        if (requiereSegundaDosis()==true) {
            info += " Siguiente Dosis: " + fechaSiguienteDosis;
        } else {
            info += " Pauta completa";
        }
        return info;
    }
    
}
