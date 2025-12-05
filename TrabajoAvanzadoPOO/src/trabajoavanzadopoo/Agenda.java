/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoavanzadopoo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> lista;

    public Agenda() {
        lista = new ArrayList<>();
    }

    public ArrayList<Contacto> getMiscontactos() {
        return lista;
    }

    public boolean anadeAgenda(Contacto c) {
        if (!(c.getNombre().isEmpty()) && !lista.contains(c)) {
            lista.add(c);
            return true;
        }
        return false;
    }

    public boolean anadeAgenda(String nombre, int telefono, int d, int m, int a) {
        return anadeAgenda(new Contacto(nombre, telefono, d, m, a));
    }

    public int anadeAgenda(ArrayList<Contacto> l) {
        int num = 0;
        if (l.isEmpty()) {
            return num;
        } else {
            for (Contacto c : l) {
                if (anadeAgenda(c)) {
                    num++;
                }
            }
        }
        return num;
    }

    public boolean borrarAgenda() {
        if (!lista.isEmpty()) {
            lista.clear();
            return true;
        }
        return false;
    }

    public boolean borrarContacto(Contacto c) {
        if (!lista.isEmpty()) {
            return lista.remove(c);
        }
        return false;
    }

    public boolean borrarContacto(String nombre) {
        return borrarContacto(new Contacto(nombre, 0, 1, 1, 1920));
    }

    public void muestraAgenda() {
        String aux = "La agenda tiene: " + lista.size() + " contactos\n";
        if (!lista.isEmpty()) {
            for (Contacto c : lista) {
                aux += c.toString() + "\n";
            }
        }
        System.out.println(aux);
    }
}
