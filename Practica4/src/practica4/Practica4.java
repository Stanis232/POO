/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

/**
 *https://github.com/Stanis232/POO.git
 * @author stanis
 */

public class Practica4 {
public static void main(String[] args) {
Casa micasa = new Casa();
//preguntar a la profe por correo
micasa.anadirSensor(1);
micasa.anadirSensor(2, "150.150.150.150");
micasa.anadirSensor(3, "150.150.150.150");
if (!micasa.anadirSensor(3, "150.150.150.150")){
System.out.println("Detectado sensor duplicado");
}
micasa.anadirEvento(TipoEvento.ROBO, "Me robannnnnnn");
micasa.anadirEvento(TipoEvento.CONEXION, "Conecto 1");
micasa.anadirEvento(TipoEvento.DESCONEXION, "Desconecto 1");
micasa.anadirEvento(TipoEvento.ROBO, "Me robannnnnnn 2");
micasa.anadirEvento(TipoEvento.CONEXION, "Conecto 2");
micasa.anadirEvento(TipoEvento.DESCONEXION, "Desconecto 2");
micasa.anadirEvento(TipoEvento.CONEXION, "Conecto 3");
micasa.anadirEvento(TipoEvento.DESCONEXION, "Desconecto 3");
micasa.anadirEvento(TipoEvento.CONEXION, "Conecto 4");
micasa.anadirEvento(TipoEvento.DESCONEXION, "Desconecto 4");
micasa.anadirEvento(TipoEvento.ROBO, "Me robannnnnnn 3");
micasa.anadirEvento(null, null);
System.out.println(micasa.toString());
micasa.cambiarEstadoAlarma();
System.out.println(micasa.toString());
micasa.cambiarEstadoAlarma();
System.out.println(micasa.toString());

}
}