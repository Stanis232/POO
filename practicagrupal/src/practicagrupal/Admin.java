/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicagrupal;

import java.util.ArrayList;

/**
 *
 * @author stanis
 */
public class Admin extends Usuario {
    
    public Admin(String DNI, long CIPA) {
        super(DNI, CIPA);
    }
    public void darAltaPacientes(Paciente paciente,  ListaPaciente lista ){
        lista.agregar(paciente);
        //falta ver a qn ha añadido con el getDNI
    }
     public void darBajaPacientes(Paciente paciente,  ListaPaciente lista ){
        lista.eliminar(paciente);
        //falta ver a qn ha añadido con el getDNI
    }
     
     public void darDeAltaPersonal(Plantilla nuevoPersonal, ArrayList<Plantilla> listaDePersonal) {
   //no hay lista de plantilla en el UML y no se si era mejor crear la clase o hacerla aqui
    if (!listaDePersonal.contains(nuevoPersonal)) {
        listaDePersonal.add(nuevoPersonal);
        System.out.println("Personal añadido al ArrayList.");
    } else {
        System.out.println("Error, el personal ya estaba.");
    }
    }
     public void darDeBajaPersonal(Plantilla personalABorrar, ArrayList<Plantilla> listaDePersonal) {
  
        boolean eliminado = listaDePersonal.remove(personalABorrar);
    if (eliminado==true) {
   
        System.out.println("Personal eliminado del ArrayList.");
    } else System.out.println("error, el personal no se encontró en la lista.");
        
     /*public void generarCSVCitasPendientesMedico(Medico medico) {
       ArrayList<Cita> citasPendientes = new ArrayList<>();
        AgendaCita agenda = medico.getAgendaCita();
        
        for (Cita c : agenda.getTodasLasCitas()) {
        // Una cita está pendiente si NO está anulada y es en el futuro
        if (!c.isAnulada() && c.getFechaHora().isAfter(LocalDateTime.now())) {
            citasPendientes.add(c);
        }
    }*/
        
    }
    
    
    public void generarCSVMedicosMasCitas(ArrayList<Plantilla> listaPersonal) {
        
    }
}

