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
public class ListaPaciente {
    private ArrayList<Paciente> pacientes;

    public ListaPaciente() {
        this.pacientes = new ArrayList<>();
    }
    public void agregar(Paciente paciente){
        if(!this.pacientes.contains(paciente)){
            pacientes.add(paciente);
            System.out.println("Paciente añdido");
        }
        else{
            System.out.println("Error: El paciente ya esta en la lista");
        }
    }
     public void eliminar(Paciente paciente){
        
         
         boolean eliminado =this.pacientes.remove(paciente);
         
         if(eliminado==true){
             System.out.println("Paciente elimiinado");
         }else System.out.println("error: paciente no encontrado");
    }
    
    
}
