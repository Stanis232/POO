
package practica5;



public class Circuito {
    // 1. Nombres en plural 
    private double[] rectas;
    private double[] curvas;

    public Circuito(double[] rectas, double[] curvas) {
        this.rectas = new double[rectas.length];
        this.curvas = new double[curvas.length];
        System.arraycopy(rectas, 0, this.rectas, 0, rectas.length);
        System.arraycopy(curvas, 0, this.curvas, 0, curvas.length);
    }

    public double[] getRectas() { // Nombre en plural
        double[] copia = new double[rectas.length];
        System.arraycopy(rectas, 0, copia, 0, rectas.length);
        return copia;
    }

    public double[] getCurvas() { // Nombre en plural
        double[] copia = new double[curvas.length];
        System.arraycopy(curvas, 0, copia, 0, curvas.length);
        return copia;
    }

    public void setRectas(double[] rectas) { // Nombre en plural
        // 2. Corrección: Usamos el tamaño del array QUE ENTRA (parametro), no el viejo
        this.rectas = new double[rectas.length]; 
        System.arraycopy(rectas, 0, this.rectas, 0, rectas.length);
    }

    public void setCurvas(double[] curvas) { // Nombre en plural
        // 2. Corrección: Usamos el tamaño del array QUE ENTRA
        this.curvas = new double[curvas.length];
        System.arraycopy(curvas, 0, this.curvas, 0, curvas.length);
    }
    
    // 3. Métodos nuevos que faltaban 
    public int getTotalRectas() {
        int kmRectas = 0;
        for (int i = 0; i < rectas.length; i++) {
            kmRectas += this.rectas[i];
        }
        return kmRectas;
    }

    public int getTotalCurvas() {
        int kmCurvas = 0;
        for (int i = 0; i < curvas.length; i++) {
            kmCurvas += this.curvas[i];
        }
        return kmCurvas;
    }
}