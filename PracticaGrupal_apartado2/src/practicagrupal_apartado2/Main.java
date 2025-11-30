package practicagrupal_apartado2;

import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {

        Plantilla plantilla = new Plantilla();
        ListaPaciente listaPacientes = new ListaPaciente();

        Admin admin = new Admin("00000000A", 1, plantilla, listaPacientes);

        Paciente p1 = new Paciente("Juan Pérez", "Calle A, 12", 600123123, 1111, "12345678A");
        Paciente p2 = new Paciente("María Ruiz", "Avenida B, 34", 600987987, 2222, "87654321B");

        System.out.println("Añadiendo paciente 1: " + admin.darAltaPacientes(p1));
        System.out.println("Añadiendo paciente 2: " + admin.darAltaPacientes(p2));

        Medico m1 = new Medico("13579135C", 3333, "Centro Norte", Especialidad.MEDICINA_GENERAL);


        AgendaCita agendaMedico = new AgendaCita();

        System.out.println("Añadiendo médico a la plantilla: " + admin.darDeAltaPersonal(m1));

        LocalDateTime fechaDeseada = LocalDateTime.now().plusDays(1).withHour(10).withMinute(0);
        Cita cita1 = p1.solicitarNuevaCita(agendaMedico, fechaDeseada, m1);

        System.out.println("\nCITA 1 CREADA:");
        System.out.println("Fecha: " + cita1.getFechaHora());
        System.out.println("Paciente: " + cita1.getPaciente().getNombre());
        System.out.println("Médico: " + cita1.getMedico().getDNI());

        LocalDateTime nuevaFecha = fechaDeseada.plusHours(1);

        if (p1.modificarCita(agendaMedico, cita1, nuevaFecha)) {
            System.out.println("\nCita modificada correctamente. Nueva fecha: " + cita1.getFechaHora());
        } else {
            System.out.println("\nERROR modificando cita.");
        }

        if (p1.cancelarCita(cita1, "No puedo asistir", agendaMedico)) {
            System.out.println("\nCita cancelada.");
        } else {
            System.out.println("\nERROR cancelando cita.");
        }

        AdminCentroSalud adminCentro = new AdminCentroSalud("55555555X", 9999, "Centro Norte");

        adminCentro.modificarDatosPaciente(p1, "Juan Pedro Pérez", "Calle Nueva, 55");

        System.out.println("\nDatos actualizados del paciente:");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Dirección: " + p1.getDireccion());

        System.out.println("\nAgenda del médico para mañana:");
        for (Cita c : agendaMedico.verCitasPorDia(fechaDeseada)) {
            System.out.println("Cita: " + c.getFechaHora() + " | Paciente: " + c.getPaciente().getNombre());
        }
        
    }
}
