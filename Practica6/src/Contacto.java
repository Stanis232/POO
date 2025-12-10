import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;


public class Contacto {

    private String nombre;
    private long telefono; // Antes era numTfn
    private final LocalDate fechaNacimiento; // Antes era fecha
    private final static LocalDate FECHAMINIMA = LocalDate.of(1920, 1, 1);

    public Contacto(String nombre, long numTfn, int d, int m, int a) {


        if(nombre==null){
            this.nombre = "";
        }else this.nombre = nombre;

        if(numTfn>=0){
            this.telefono = numTfn;
        }
       fechaNacimiento= fechaN(d,m,a);

    }

    private LocalDate fechaN(int d, int m, int a) {
        LocalDate aux = LocalDate.of(a,m,d);
        if ((aux.isAfter(FECHAMINIMA)) && (aux.isBefore(LocalDate.now()))){
            return aux;
        }else return null;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String nombre) {

        if(nombre==null){
            return false;
        }else{
            this.nombre = nombre;
            return true;
        }

    }

    public long getTelefono() {
        return telefono;
    }

    public boolean setTelefono(long telefono) {


        if(telefono>=0){
            this.telefono = telefono;
            return true;
        }return false;
    }
    @Override
    public boolean equals(Object p){
        if (this==p) return true;
        if (p==null) return false;
        if(getClass()!=p.getClass()) return false;
        Contacto a = (Contacto) p;
        return(getNombre().equals(a.getNombre()));


    }

    @Override
    public String toString() {
      String aux = "Nombre: " + nombre + "\tTelefono: " + telefono + "\t";
      if(fechaNacimiento!=null){
          //para el formato
          DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          return aux + fechaNacimiento.format(f);
      }
      return aux;
    }
}
