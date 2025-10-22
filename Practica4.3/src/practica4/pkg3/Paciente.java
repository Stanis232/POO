/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4.pkg3;

/**
 *
 * @author stanis
 */
public class Paciente {
    private String nombre;
    private int edad, siguiente;
    private double peso, altura;
    private CondicionDeSalud[] condi = new CondicionDeSalud[5];
    

    public Paciente(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
   public boolean agregarCondicion(CondicionDeSalud con){
       if(siguiente==5){
           return false;
           
       }
       for (int i = 0; i < this.siguiente; i++) {
            if(con.equals(this.condi[i])){
                return false;
        }
            
    }
       this.condi[this.siguiente]=con;
       this.siguiente++;
      return true; 
   }
    public boolean actualizarCondicion(CondicionDeSalud con1, CondicionDeSalud con2){
      
       for (int i = 0; i < this.siguiente; i++) {
            if(con1.equals(this.condi[i])){
                
                
                this.condi[i]=con2;    
             return true; }
            
    }
       
       return false;
     
   }
    public boolean eliminarCondicion(CondicionDeSalud con){
       
       for (int i = 0; i < this.siguiente; i++) {
            if(con.equals(this.condi[i])){
                
                
              for (int j = i; j < this.siguiente - 1; j++) {
                // Mueve el elemento de la derecha (j+1) a la posición actual (j)
                this.condi[j] = this.condi[j+1];
            }
            // --- Fin del desplazamiento ---

            // Decrementa el contador (ahora 'siguiente' apunta a la posición que antes era la última)
            this.siguiente--;
            // Indica que se eliminó con éxito
            return true;
        }
            
    }
      
   
      return false; 
   }

  
    
    public String getNombre() {
        return nombre;
    }

    public CondicionDeSalud[] getCondi() {
        return condi;
    }
    
    
    public String darRecomendaciones(Recomendacion[] recomendaciones) { // Nombre corregido
    String aux = "Paciente: " + nombre + "\n";
    aux += "Condiciones de salud:\n";
    // Bucle para añadir las condiciones del paciente (índice 'i')
    for (int i = 0; i < this.siguiente; i++) {
        aux += "\t- " + this.condi[i].toString() + "\n"; // Usamos toString()
    }

    aux += "Recomendaciones:\n";

    // Bucle Exterior (para cada recomendación en 'recomendaciones', índice 'k')
    for (int k = 0; k < recomendaciones.length; k++) {
        Recomendacion unaRecomendacion = recomendaciones[k];
        // Obtener las condiciones relevantes de 'unaRecomendacion'
        CondicionDeSalud[] condsParaEstaRecomendacion = unaRecomendacion.getCondi(); // Usamos tu getter getCondi()
        boolean recomendacionAnadida = false; // Para evitar añadirla múltiples veces

        // Bucle Intermedio (para cada condición relevante, índice 'l')
        // El tamaño de este array es condsParaEstaRecomendacion.length
        for (int l = 0; l < condsParaEstaRecomendacion.length; l++) {
            CondicionDeSalud condRelevante = condsParaEstaRecomendacion[l];

            // Bucle Interior (para cada condición que TIENE el paciente, índice 'i')
            // Reutilizamos 'i' porque el bucle anterior ya terminó.
            // Recorre desde 0 hasta this.siguiente
            for (int i = 0; i < this.siguiente; i++) {
                CondicionDeSalud miCondicion = this.condi[i];

                // Comparación
                if (condRelevante.equals(miCondicion)) {
                    // ¡Coincidencia! Añadir descripción y "(temporal)" o "(para siempre)"
                    aux += "\t- " + unaRecomendacion.getDescripcion();
                    if (miCondicion.isCronica()) {
                        aux += " (para siempre)\n";
                    } else {
                        aux += " (temporal)\n";
                    }
                    recomendacionAnadida = true; // Marcamos que ya la añadimos
                    break; // Salimos del bucle INTERIOR (índice 'i')
                }
            } // Fin bucle interior (índice 'i')

            if (recomendacionAnadida) {
                break; // Salimos del bucle INTERMEDIO (índice 'l')
            }
        } // Fin bucle intermedio (índice 'l')
    } // Fin bucle exterior (índice 'k')

    return aux;
}
}

    
    

