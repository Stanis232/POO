/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicagrupal;

/**
 *
 * @author stanis
 */

// Esta clase la haría tu compañero
public class Paciente extends Usuario {

    // Atributos del UML
    private String nombreCompleto;
    private String direccion;
    private long telefono;

    public Paciente(String DNI, long CIPA, String nombreCompleto, String direccion, long telefono) {
        super(DNI, CIPA);
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // --- MÉTODOS "SETTER" QUE TU CLASE NECESITA ---

    /**
     * Setter para el nombre, usado por AdminCentroSalud.
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Setter para la dirección, usado por AdminCentroSalud.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * El paciente SÍ puede modificar su propio teléfono
     */
    public void modificarTelefono(long nuevoTelefono) {
        this.telefono = nuevoTelefono;
    }
    
    // ... (otros getters y métodos del Paciente) ...
}