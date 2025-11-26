/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebauml;

import java.util.List;

/**
 *
 * @author stanis
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
