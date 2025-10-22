/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto4.pkg2;

/**
 *
 * @author stanis
 */
public class Convocatoria {
    private String mes;
    private int nota;

    public Convocatoria(String mes, int nota) {
        this.mes = mes;
        this.nota = nota;
    }

    public Convocatoria() {
           this.mes = null;
        this.nota = -1;
        
    }

    public String getMes() {
        return mes;
    }

    public int getNota() {
        return nota;
    }
    
    public Convocatoria copia(){
        return new Convocatoria(mes, nota);
    }

    @Override
    public String toString() {
        return "Convocatoria{" + "mes=" + mes + ", nota=" + nota + '}';
    }
    
}
