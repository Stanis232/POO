/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5;

/**
 *
 * @author stanis
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche c1 = new Coche("Ferrari");
Coche c2 = new Coche("McLaren",7);
c2.setVelCurva (5);
Coche c3 = new Coche("Mercedes",20, 5);
Coche c4 = new Coche("Otro Mercedes",c3);
System.out.println(c1.getNombre());
System.out.println(c1);
System.out.println(c2.getNombre());
System.out.println(c2);
System.out.println(c3.getNombre());
System.out.println(c3);
System.out.println(c4.getNombre());
System.out.println(c4);
c1.acelerarRecta();
System.out.println(c1.getNombre() + " Acelerado en recta");
System.out.println(c1);
c1.acelerarCurva();
System.out.println(c1.getNombre() + " Acelerado en curva");
System.out.println(c1);
c1.frenaRecta();
System.out.println(c1.getNombre() + " Frenado en recta");
System.out.println(c1);
c1.frenaCurva();
System.out.println(c1.getNombre() + " Frenado en curva");
System.out.println(c1);
c4.mejora();
System.out.println(c4.getNombre() + " Mejorado");
System.out.println(c4);
double[] rectas = {1, 3, 2, 4.5, 7};
double[] curvas = {0.5, 2, 1.5, 3};
Resultado resultado;
final int vueltas = 80;
Circuito suzuka = new Circuito (rectas,curvas);
resultado = c3.competir (c4,suzuka,vueltas);
String res = resultado.ganador();
System.out.println (res);
    }
    
}
