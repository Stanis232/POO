/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4.pkg3;

/**
 *
 * @author stanis
 */
public class Practica43 {
public static void main(String[] args) {
Paciente p1 = new Paciente("Pepe Perez", 45, 85.5, 1.75);
Paciente p2 = new Paciente("Maria Martin", 20, 50.1, 1.63);
CondicionDeSalud cs1 = new CondicionDeSalud("Diabetes", true);
CondicionDeSalud cs2 = new CondicionDeSalud("HIPERTENSION", true);
CondicionDeSalud cs3 = new CondicionDeSalud("Esguince");
CondicionDeSalud cs4 = new CondicionDeSalud("Lumbago");
p1.agregarCondicion(cs1);
p1.agregarCondicion(cs2);
p1.agregarCondicion(cs3);
p1.actualizarCondicion(cs3, cs4);
p1.eliminarCondicion(cs1);
p2.agregarCondicion(cs3);

    /**
     * @param args the command line arguments
     */
   Recomendacion[] recomendaciones = {
new Recomendacion("Evitar alimentos con alto contenido de azucar.",
new CondicionDeSalud[]{cs1}),
new Recomendacion("Hacer ejercicio cardiovascular moderado.",
new CondicionDeSalud[]{cs2}),
new Recomendacion("Incluir mas verduras y frutas frescas en la dieta.",
new CondicionDeSalud[]{cs2}),
new Recomendacion("Reducir la ingesta de sal.",
new CondicionDeSalud[]{cs2}),
new Recomendacion("Reposo.",
new CondicionDeSalud[]{cs3, cs4}),
};
System.out.println(p1.darRecomendaciones(recomendaciones));
System.out.println(p2.darRecomendaciones(recomendaciones));
}
}
