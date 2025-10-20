/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4.pkg1;

/**
 *
 * @author stanis
 */
public class Fecha {
    private String fecha;
    private int horaInicio, horaFinal;

    public Fecha(String fecha, int horaInicio, int horaFinal) {
        this.fecha = fecha;
        if(horaInicio>=8 && horaFinal<=18){
             this.horaInicio = horaInicio;
               this.horaFinal = horaFinal;
        }else {
         
            this.horaInicio=0;
              this.horaFinal = 0;
        }
        
       
    }
    
}
