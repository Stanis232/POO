package practicagrupal_apartado2;

public class AdminCentroSalud extends  Usuario{

    private String centro;
    
    public AdminCentroSalud(String DNI, long CIPA, String centro) { 
        super(DNI, CIPA);
        this.centro = centro;
    }
    
    public void modificarDatosPaciente(Paciente paciente, String nuevoNom, String nuevaDir) {
        
       if (nuevoNom != null && !nuevoNom.isEmpty()) {
           paciente.setNombreCompleto(nuevoNom);
        }
        
        if (nuevaDir != null && !nuevaDir.isEmpty()) {
            paciente.setDireccion(nuevaDir);
        }
        
        System.out.println("Datos del paciente " + paciente.getDNI() + " actualizados.");
    }
    }
 

