/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema1;

/**
 *
 * @author stanis
 */
public class Contador {
    private int numPersonas;

    public Contador() {
    }

   public Contador(int n){
       if (n>=0) {
           numPersonas=0;
           
       }
   }
   public void incrementar(){
       numPersonas++;
   }
   public boolean decrementar(){
       if (numPersonas>0) {
           numPersonas--;
           return true;
       }
       numPersonas--;
       return false;
   }

    public int getNumPersonas() {
        return numPersonas;
    }

    public boolean setNumPersonas(int a) {
       
        if(a>=0){
            numPersonas=a;
            return true;
        }
        return false;
    }
   
}
