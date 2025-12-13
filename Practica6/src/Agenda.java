import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> lista;



    public Agenda() {
        lista = new ArrayList<>();
    }

    public ArrayList<Contacto> getMiscontactos() {
        return lista;
    }

    public boolean anadeAgenda(Contacto c){
        if(!(c.getNombre().isEmpty())&& !lista.contains(c)){

           lista.add(c);
            return true;

        }


        return false;
    }

    public boolean anadeAgenda(String nombre, long telefono, int d, int m, int a){


        return anadeAgenda(new Contacto(nombre, telefono, d, m, a));
    }
    public int anadeAgenda(ArrayList<Contacto> listaa){
        int nuevos=0;

        for (Contacto c: listaa){
        if (anadeAgenda(c)){

            nuevos++;
        }

        }

        return nuevos;

    }
    public boolean borrarAgenda(){
      if (!lista.isEmpty()){

          lista.clear();
          return true;
      }
      return false;
    }

    public boolean borrarContacto(Contacto c){
        if (!lista.isEmpty()){
            lista.remove(c);
            // no necesita return trueee ya lo hace el .remove LOCURA ;
        }

        return false;
    }
    public boolean borrarContacto(String nombre){
       return borrarContacto(new Contacto(nombre,0,1,1,1920));
    }
    public void muestraAgenda(){
       String aux = "La agenda tiene " + lista.size() + " numero de contactos ";
       if (!lista.isEmpty()){
           for(Contacto c: lista){
                aux+= c.toString() + "\n";
           }
       }
        System.out.println(aux);
    }


}

