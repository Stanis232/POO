/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4.pkg1;

/**
 *
 * @author stanis
 */
public class Practica41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1 = new Persona("Estefanía Martín", "estefania.martin");
    Persona p2 = new Persona("Carlos Lázaro", "carlos.lazaro");
    Persona p3 = new Persona("Isidoro Hernán", "isidoro.hernan");
    Persona p4 = new Persona("Stanis", "s.yaruchyk.2023"); 
    Persona p5 = new Persona("Persona Extra", "extra");
    Persona p6 = new Persona("No Debería Entrar", "no.entra");
    
    Fecha fechaReunion = new Fecha("13/11/2020", 10, 12);
    
    
    Cita miCita = new Cita("Reunión del proyecto 1", fechaReunion);
    
    System.out.println("Añadiendo asistentes...");
    miCita.anadirAsistente(p1);
    miCita.anadirAsistente(p2);
    miCita.anadirAsistente(p3);
    miCita.anadirAsistente(p4);
    
    
    
    System.out.println("Intentando añadir...");
   
    if (!miCita.anadirAsistente(p3)) {
        System.out.println("¡Correcto! No se ha añadido el duplicado.");
    }else System.out.println("Este no estaba jeje");
           miCita.anadirAsistente(p5);

           System.out.println("Intentando añadir a alguien con la cita llena...");
    if (!miCita.anadirAsistente(p6)) {
        System.out.println("¡Correcto! La cita está llena, no se pueden añadir más asistentes.");
    }
    
    
    System.out.println("\n--- Resumen de la Cita ---");
    System.out.println(miCita);
           
    }
}
