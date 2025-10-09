/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author s.yaruchyk.2023
 */
public class Principal {
    public static void main(String[] args){
         Fraccion f1 = new Fraccion(2,4);
         Fraccion f2 = new Fraccion(5,4);
         
        Fraccion f3 = f1.suma(f1, f2);  
        Fraccion f4 = f1.resta(f1, f2);  
          Fraccion f5 = f1.multi(f1, f2);  
          Fraccion f6 = f1.copia();
           boolean f7 = f1.equals(f2);

         //Fraccion f3.suma(f1, f2);
         //System.out.println(f3.getNumerador()+ ", " + f3.getDenominador());
         /*System.out.println(f3.getNumerador() + "/" + f3.getDenominador());
         System.out.println(f4.getNumerador() + "/" + f3.getDenominador());
             System.out.println(f5.getNumerador() + "/" + f5.getDenominador());
                             System.out.println(f6.getNumerador() + "/" + f6.getDenominador());*/
                              System.out.println(f6.numEntero());
                  System.out.println(f3);
                  System.out.println(f3.numEntero());
                  System.out.println(f3.numReal());
                  System.out.println(f7);
                  f1.simplificar();
                  System.out.println(f1);  
    }
}

