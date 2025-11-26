/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicagrupal;

/**
 *
 * @author stanis
 */
public class AdminCentroSalud extends  Plantilla{

public AdminCentroSalud(String DNI, String nombreCompleto, String centro) {
       
        super(DNI, nombreCompleto, centro);
    }
    public void modificarDatosPaciente(Paciente paciente, String nuevoNombre, String nuevaDireccion) {
        
       if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
           paciente.setNombreCompleto(nuevoNombre);
        }
        
        if (nuevaDireccion != null && !nuevaDireccion.isEmpty()) {
            // 3. Llama al otro "setter" de la clase Paciente
            paciente.setDireccion(nuevaDireccion);
        }
        
        System.out.println("Datos del paciente " + paciente.getDNI() + " actualizados.");
    }
    }
 

