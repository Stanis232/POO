/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5;

/**
 *
 * @author stanis
 */
public class Resultado {
    private double[] tiempos;
    private Coche[] coches;
//El constructor usa .clone() para hacer una copia rápida de los arrays. Es una alternativa a System.arraycopy que la profesora usa aquí
    public Resultado(double[] tiempo, Coche[] coches) {
        this.tiempos = tiempo.clone();
        this.coches = coches.clone();
    }

    public double getRes1() {
        return tiempos[0];
    }
     public double getRes2() {
        return tiempos[1];
    }

    public void setRes1(double tiempos) {
        this.tiempos[0] = tiempos;
    }
     public void setRes2(double tiempos) {
        this.tiempos[1] = tiempos;
    }
     
     /* Getter del array completo (con copia de seguridad System.arraycopy) */
   public double[] getTiempos(){
       double[] tie = new double[tiempos.length];
       System.arraycopy(tiempos, 0, tie, 0, tiempos.length);
       return tie;
   }
   // Getter del ÚLTIMO elemento es el -1 pq sino explota
public double getResUlt() {
    // Si hay 2 elementos, devuelve el de la posición 1 (2-1)
    return tiempos[tiempos.length - 1]; 
}
     
}
