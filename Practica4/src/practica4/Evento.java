
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author stanis
 */
public class Evento {
     private TipoEvento tipoevento;
  private String mensaje;

    public Evento(TipoEvento tipoevento, String mensaje) {
       if (tipoevento == null) {
        this.tipoevento = TipoEvento.DESCONOCIDO;
    } else {
        this.tipoevento = tipoevento;
    }
       //yo lo hice con  if(tipoevento==null || mensaje==null) pero gemini me dice que es ineficiente ya que con q uno de los dos sea nulo cambia el de los dos 
    // Segundo, decidimos el MENSAJE del evento
    if (mensaje == null) {
        this.mensaje = ""; // O "Sin mensaje"
    } else {
        this.mensaje = mensaje;
    }
}

    public TipoEvento getTipoevento() {
        return tipoevento;
    }

    public String getMensaje() {
        return mensaje;
    }
       
    }

    
 

  

    
  
  

