package practicagrupal_apartado2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
/*
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
        
*/


        System.out.println("=================================================");
        System.out.println("   INICIO DE PRUEBAS - SISTEMA DE SALUD (APARTADO B)");
        System.out.println("=================================================\n");

        // ----------------------------------------------------------------
        // 1. INICIALIZACIÓN DEL SISTEMA (ADMINISTRACIÓN)
        // ----------------------------------------------------------------
        System.out.println("--- 1. Creación de Estructuras Básicas ---");
        Plantilla plantillaPersonal = new Plantilla();
        ListaPaciente listaPacientes = new ListaPaciente();
        
        // Creamos al Administrador
        Admin admin = new Admin("00000000A", 1, plantillaPersonal, listaPacientes);

        // Damos de alta a Médicos (General y Especialista)
        Medico medicoGeneral = new Medico("11111111A", 101, "Centro Salud Norte", Especialidad.MEDICINA_GENERAL);
        Medico medicoEspecialista = new Medico("22222222B", 102, "Hospital Central", Especialidad.ESPECIALISTA);
        
        admin.darDeAltaPersonal(medicoGeneral);
        admin.darDeAltaPersonal(medicoEspecialista);

        // Damos de alta a Pacientes
        Paciente paciente1 = new Paciente("Juan Pérez", "C/ Falsa 123", 600111222, 2001, "33333333C");
        Paciente paciente2 = new Paciente("María López", "Av. Libertad 45", 600333444, 2002, "44444444D");
        Paciente paciente3 = new Paciente("Luis García", "Plaza Mayor 1", 600555666, 2003, "55555555E");
        
        admin.darAltaPacientes(paciente1);
        admin.darAltaPacientes(paciente2);
        admin.darAltaPacientes(paciente3);

        System.out.println("-> Médicos y Pacientes cargados correctamente.\n");

        // ----------------------------------------------------------------
        // 2. GESTIÓN DE CITAS (AGENDA)
        // ----------------------------------------------------------------
        System.out.println("--- 2. Pruebas de Agenda y Citas ---");
        AgendaCita agendaGeneral = new AgendaCita(); // Agenda del médico general
        AgendaCita agendaEspecialista = new AgendaCita(); // Agenda del especialista

        // Definimos fechas futuras para la prueba
        LocalDateTime manana9am = LocalDateTime.now().plusDays(1).withHour(9).withMinute(0).withSecond(0).withNano(0);
        
        // A. Solicitar cita normal
        System.out.println("Solicitando cita para Juan con Médico General...");
        Cita cita1 = paciente1.solicitarNuevaCita(agendaGeneral, manana9am, medicoGeneral);
        if(cita1 != null) System.out.println("   ✅ Cita agendada: " + cita1.getFechaHora());
        else System.out.println("   ❌ Error agendando cita.");

        // B. Intentar solapar cita (María quiere la misma hora)
        System.out.println("Solicitando cita para María a la MISMA hora (debe fallar)...");
        Cita cita2 = paciente2.solicitarNuevaCita(agendaGeneral, manana9am, medicoGeneral);
        
        // Si tu lógica está bien, cita2 será una hora diferente o null, dependiendo de cómo implementaste 'solicitarNuevaCita'
        // Si usaste 'buscarDisponibilidad' antes de crear la cita, le habrá dado la siguiente hora libre (09:15)
        if(cita2 != null && !cita2.getFechaHora().equals(manana9am)) {
            System.out.println("   ✅ Conflicto resuelto. Nueva hora asignada: " + cita2.getFechaHora());
        } else {
             System.out.println("   ⚠️ Revisar lógica de solapamiento.");
        }

        System.out.println();

        // ----------------------------------------------------------------
        // 3. REAGENDACIÓN AUTOMÁTICA (El médico enferma)
        // ----------------------------------------------------------------
        System.out.println("--- 3. Prueba de Reagendación Masiva ---");
        
        // Llenamos un día concreto para el especialista para probar
        LocalDateTime fechaColapso = LocalDateTime.now().plusDays(5).withHour(9).withMinute(0).withSecond(0).withNano(0);
        
        Cita c1 = new Cita(fechaColapso, paciente1, medicoEspecialista);
        Cita c2 = new Cita(fechaColapso.plusHours(1), paciente2, medicoEspecialista);
        Cita c3 = new Cita(fechaColapso.plusHours(2), paciente3, medicoEspecialista);
        
        agendaEspecialista.agendarCita(c1, medicoEspecialista);
        agendaEspecialista.agendarCita(c2, medicoEspecialista);
        agendaEspecialista.agendarCita(c3, medicoEspecialista);
        
        System.out.println("Citas originales el día " + fechaColapso.toLocalDate() + ":");
        System.out.println("   - 09:00 " + c1.getPaciente().getNombre());
        System.out.println("   - 10:00 " + c2.getPaciente().getNombre());
        System.out.println("   - 11:00 " + c3.getPaciente().getNombre());

        System.out.println("\n... El médico avisa que falta. Reagendando citas ...");
        
        ArrayList<Cita> reagendadas = agendaEspecialista.reagendarDia(fechaColapso.toLocalDate(), medicoEspecialista);
        
        // --- BLOQUE DE VISUALIZACIÓN MEJORADO ---
        
        // 1. Si hay citas, mostramos un resumen claro del cambio de fecha
        if (!reagendadas.isEmpty()) {
            LocalDate nuevaFecha = reagendadas.get(0).getFechaHora().toLocalDate();
            System.out.println("\n📅 NUEVA FECHA ASIGNADA: " + nuevaFecha + " (Se han movido " + reagendadas.size() + " citas)");
        }

        // 2. Mostramos el detalle línea a línea formateado
        java.time.format.DateTimeFormatter formatoBonito = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy 'a las' HH:mm");

        for(Cita c : reagendadas){
            String fechaTexto = c.getFechaHora().format(formatoBonito);
            System.out.println("   🔄 Cita de " + c.getPaciente().getNombre() + " -> Mover a: " + fechaTexto);
        }
        
        
        System.out.println("\n=================================================");
        System.out.println("   FIN DE LAS PRUEBAS");
        System.out.println("=================================================");
    
    }
    
    
}
