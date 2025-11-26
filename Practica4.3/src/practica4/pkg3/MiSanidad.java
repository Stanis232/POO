package practica4.pkg3;

// --- IMPORTACIONES NECESARIAS ---
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;

// --- ENUMS ---

 enum TipoConsulta {
    PRESENCIAL,
    TELEFONICA
}

 enum TipoInforme {
    SEGUIMIENTO,
    ALTA
}

// --- CLASE PRINCIPAL ---

/**
 * Clase principal que gestiona toda la aplicación, 
 * contiene los datos y maneja la sesión.
 */
public class MiSanidad {

    private List<Paciente> pacientes;
    private List<PersonalSanitario> personalSanitario;
    private List<PersonalAdministracion> personalAdministracion;
    private List<Administrador> administradores;
    
    private Usuario usuarioActual;

    public void cargarDatos(String fichero) {
        // Lógica para cargar MiSanidad.dat
    }

    public void guardarDatos(String fichero) {
        // Lógica para guardar en MiSanidad.dat
    }

    public boolean login(String id) {
        // Lógica para buscar por DNI o CIPA en todas las listas
        // y asignar a 'usuarioActual'
        return false;
    }

    public void logout() {
        this.usuarioActual = null;
    }

    // Punto de entrada de la aplicación
    public static void main(String[] args) {
        MiSanidad app = new MiSanidad();
        app.cargarDatos("MiSanidad.dat");
        // Aquí iría el código para iniciar la interfaz de usuario
    }
}

// --- JERARQUÍA DE USUARIOS ---

/**
 * Clase abstracta base para todos los usuarios del sistema.
 */
 abstract class Usuario {
    protected String nombreCompleto;
    protected String dni;
    protected String cipa;
}


 abstract class PersonalSanitario extends Usuario {
    
    // Composición: La agenda pertenece al sanitario
    private Agenda agendaDigital;
    
    // Asociación: Pacientes que tiene asignados
    private List<Paciente> pacientesAsignados;

    public void visualizarAgenda(LocalDate dia) {}
    public void reagendarDiaCompleto(LocalDate dia) {}
    public void prescribirMedicacion(Paciente p, Medicamento m) {}
    public HistorialClinico accederHistorial(Paciente p) { return null; }
}

 class Medico extends PersonalSanitario {
    private String especialidad;
}

 class Enfermero extends PersonalSanitario {
    // No requiere atributos específicos según el documento
}

 class PersonalAdministracion extends Usuario {
    
    public void modificarDatosPaciente(Paciente p, String nombre, String dni, String direccion) {}
    public void gestionarCitasPaciente(Paciente p) {}
}

 class Administrador extends Usuario {
    
    public void altaUsuario(Usuario u) {}
    public void bajaUsuario(Usuario u) {}
    public String generarListadoCitasPendientesCSV(Medico m) { return ""; }
    public String generarListadoMedicosCitasPendientesCSV() { return ""; }
}


// --- CLASES DE GESTIÓN DE CITAS ---

 class Cita {
    private LocalDateTime fechaHora;
    private String especialidad;
    private boolean cancelada;
    private String causaCancelacion;
    private LocalDate fechaCancelacion;
    private LocalDateTime fechaSolicitud;
    
    // Asociación
    private Paciente paciente;
    private PersonalSanitario profesional;
}

 class Agenda {
    // Agregación de Citas
    private List<Cita> citas;

    public List<LocalDateTime> buscarDisponibilidad(LocalDateTime desde) { return null; }
    public boolean agendarCita(Cita c) { return false; }
}


// --- CLASES DE CONTROL DE MEDICACIÓN ---

 class TarjetaSanitaria {
    private String cipa;
    
    // Agregación de Medicamentos
    private List<Medicamento> medicamentosRecetados;

    public List<Medicamento> getTratamientosActivos() { return null; }
    public List<Medicamento> getTratamientosPasados() { return null; }
}

 class Medicamento {
    private String nombreFarmaco;
    private String dosis;
    private String frecuencia;
    private boolean esCronico;
    private LocalDate fechaInicio; // Fecha de retirada
    private LocalDate fechaFin;
}


// --- CLASES DEL HISTORIAL CLÍNICO ---

 class HistorialClinico {
    // Agregación
    private List<Consulta> consultas;
    private List<PruebaDiagnostica> pruebasDiagnosticas;
    private List<Vacuna> vacunas;
}

 class Consulta {
    private LocalDate fecha;
    private String motivo;
    private TipoConsulta tipoConsulta;
    private String centro;
    private String especialidad;
    private TipoInforme tipoInforme;
    
    // Asociación
    private PersonalSanitario profesional;
}

 class Vacuna {
    private String nombreFarmaco;
    private String dosis;
    private String frecuencia;
    private LocalDate diaAdministrado;
    private boolean necesitaOtraDosis;
    private LocalDate fechaProximaDosis;
}

// --- JERARQUÍA DE PRUEBAS DIAGNÓSTICAS ---

 abstract class PruebaDiagnostica {
    protected LocalDate fecha;
    protected String centro;
}

 class PruebaLaboratorio extends PruebaDiagnostica {
    private String informeLaboratorio;
}

 class PruebaImagen extends PruebaDiagnostica {
    private String informeMedico;
    private String rutaImagen;

    public void visualizarImagen() {}
}