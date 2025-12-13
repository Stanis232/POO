import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Contacto c1 = new Contacto("Estefanía", 1234, 1, 1, 1978);
        Contacto c2 = new Contacto("Carlos", 2345, 2, 1, 1978);
        Contacto c3 = new Contacto("Isidoro", 3456, 3, 1, 1978);
        Contacto c4 = new Contacto("Mamá", 4567, 1, 1, 1950);
        Agenda a1 = new Agenda();
        Agenda a2 = new Agenda();
        a1.anadeAgenda(c1);
        a1.anadeAgenda(c2);
        a1.anadeAgenda(c3);
        a2.anadeAgenda(c4);
        a2.anadeAgenda("Papá", 5678, 1, 2, 1950);
        System.out.println("*********************");
        System.out.println("Mostrando la agenda 1");
        System.out.println("*********************");
        a1.muestraAgenda();
        System.out.println("*********************");
        System.out.println("Mostrando la agenda 2");
        System.out.println("*********************");
        a2.muestraAgenda();
        System.out.println("*********************");
        System.out.println("Unidas");
        System.out.println("*********************");
        a1.anadeAgenda(a2.getMiscontactos());
        a1.muestraAgenda();
        System.out.println("*********************");
        System.out.println("Después de borrar a Mamá");
        System.out.println("*********************");
        a1.borrarContacto(c4);
        a1.muestraAgenda();
        System.out.println("*********************");
        System.out.println("Después de borrar a Isidoro");
        System.out.println("*********************");
        a1.borrarContacto("Isidoro");
        a1.muestraAgenda();
        System.out.println("*********************");
        System.out.println("Después de borrar todo");
        System.out.println("*********************");
        a1.borrarAgenda();
        a1.muestraAgenda();
        if(a1.borrarContacto("Carlos")) System.out.println("Incorrecto");
        else System.out.println("No puedo borrar a Carlos. Agenda vacía");
            */
        Scanner sc = new Scanner(System.in);
         Agenda agenda = new Agenda();
         int opcion;



         do {
             System.out.println("\n****** MENÚ *****");
             System.out.println("\nPulse 1 si quiere añadir nuevo contacto");
             System.out.println("\nPulse 2 si quiere mostrar todos los contactos");
             System.out.println("\nPulse 3 si quiere borrar un contacto por nombre");
             System.out.println("\nPulse 4 si quiere borrar todos los contactos");
             System.out.println("\nPulse 5 si quiere Salir");
             // --- MUEVE ESTO AQUÍ ---
             System.out.print("Elija una opción: "); // Un mensajito para que quede claro
             opcion = sc.nextInt();
             sc.nextLine();
             // -----------------------
             switch (opcion){
                 case 1:



                     System.out.println("Introduzca el nombre : ");
                     String nombre = sc.nextLine();
                     System.out.println("Introduzca el telefono : ");
                     long telefono = sc.nextLong();
                     System.out.println("Introduzca el dia de nacimiento: ");
                     int dia= sc.nextInt();
                     System.out.println("Introduzca el mes de nacimiento: ");
                     int mes= sc.nextInt();
                     System.out.println("Introduzca el año de nacimiento: ");
                     int año= sc.nextInt();
                     Contacto c1 = new Contacto(nombre,telefono,dia,mes,año);
                     agenda.anadeAgenda(c1);
                     System.out.println("Añadido  "+ c1.getNombre() + " con exito ");
                        break;

                 case 2:
                    agenda.muestraAgenda();
                    break;
                 case 3:
                     System.out.println("Diga a quien quiere borrar por el nombre");
                     String nombreborrar = sc.nextLine();

                         if (agenda.borrarContacto(nombreborrar)){
                             System.out.println(nombreborrar + " Borrado con exito1");
                         }else System.out.println(nombreborrar+ " no encontrado en la BBDD.");





                     break;


                 case 4:
                     agenda.borrarAgenda();

                 System.out.println("Agenda borrada con exito");
                     break;
             }














         }while (opcion != 5);



    }
}