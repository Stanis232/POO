package practicagrupal_apartado2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Medico extends Usuario{
    private String centro;
    private final Especialidad especialidad;
    private static final int MAXCITASDIARIAS = 20;
    private AgendaCita agenda;
    
    public Medico(String DNI, long CIPA, String c, Especialidad e){
        super(DNI, CIPA);
        centro = c;
        especialidad = e;
    }

    public String getCentro() {
        return centro;
    }
    
    public int getMAXCITASDIARIAS(){
        return MAXCITASDIARIAS;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
    
    public ArrayList<Cita> visualizarAgenda(LocalDateTime fecha){
        return agenda.verCitasPorDia(fecha);
    }

   
    
}
