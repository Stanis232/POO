package practicagrupal_apartado2;

import java.util.ArrayList;

public class AgendaConsultas {
    private ArrayList<Consulta> consultas;

    public AgendaConsultas() {
        consultas = new ArrayList<>();
    }

    public boolean registrarConsulta(Consulta c) {
        if (c == null || c.getMedico() == null) {
            return false;
        }


        Medico medico = c.getMedico();
        boolean esEspecialista = (medico.getEspecialidad() != Especialidad.MEDICINA_GENERAL
                && medico.getEspecialidad() != Especialidad.ENFERMERO);

        if (esEspecialista && c.esCitaTelefonica()) {
            System.out.println("ERROR: Especialistas no admiten consultas telefónicas.");
            return false;
        }

        return this.consultas.add(c);
    }


    public ArrayList<Consulta> getHistorialCompleto() {
        return this.consultas;
    }


}