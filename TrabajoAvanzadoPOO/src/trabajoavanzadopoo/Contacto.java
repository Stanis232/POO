package trabajoavanzadopoo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contacto {

    private String nombre;
    private long telefono;
    private final LocalDate fechaNacimiento;
    private final static LocalDate FECHAMINIMA = LocalDate.of(1920, 1, 1);

    public Contacto(String n, long t, int d, int m, int a) {
        if (t >= 0) {
            telefono = t;
        }
        if (n != null) {
            nombre = n;
        } else {
            nombre = "";
        }
        fechaNacimiento = fechaN(d, m, a);
    }

    private LocalDate fechaN(int d, int m, int a) {
        LocalDate aux = LocalDate.of(a, m, d);
        /*if ((aux.isAfter(FECHAMINIMA)) && (aux.isBefore(LocalDate.now()))) {
            return aux;
        }
        return null;*/
        return aux;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public boolean setNombre(String n) {
        if (n != null) {
            nombre = n;
            return true;
        }
        nombre = "";
        return false;
    }

    public boolean setTelefono(long t) {
        if (t >= 0) {
            telefono = t;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String aux = "Nombre: " + nombre + "\tTelefono: " + telefono + "\t";
        if (fechaNacimiento != null) {
            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return aux + fechaNacimiento.format(f);
        }
        return aux;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Contacto aux = (Contacto) o;
        return aux.getNombre().equals(this.nombre);
    }
}
