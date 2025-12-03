
package practicagrupal_apartado2;

import java.util.ArrayList;

public class Historial {
    private ArrayList<Consulta> consultas;
    private ArrayList<Prueba> pruebas;
    
    private Paciente paciente;

    public Historial(){}
    
    public Historial(Paciente paciente) {
        this.paciente = paciente;
        consultas = new ArrayList<>();
        pruebas = new ArrayList<>();
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public boolean historialConsultas(Paciente p){
        if(p.equals(paciente)){
            for(Consulta c: consultas){
                System.out.println(c.toString());
            }
            return true;
        }
        return false;
    }
    
    public boolean historialPruebas(Paciente p){
        if(p.equals(paciente)){
            for(Prueba pr: pruebas){
                if(pr instanceof Imagen){
                    Imagen img = (Imagen) pr;
                    System.out.println(pr.toString());
                    System.out.println("Ruta de la imagen: "+img.getRutaImagen());
                }
                else if(pr instanceof Laboratorio){
                    System.out.println(pr.toString());
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean historialPrescripciones(Paciente p){
        if(p.equals(paciente)){
            p.mostrarMedicamentos(p);
            return true;
        }
        return false;
    }
    
}
