package trabajoavanzadopoo;

import java.time.DateTimeException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgendaContacto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;
        do {
            System.out.println("\n****** MENÚ AGENDA DE CONTACTOS *****");
            System.out.println("1. Add nuevo contacto");
            System.out.println("2. Mostrar todos los contactos");
            System.out.println("3. Borrar un contacto por nombre");
            System.out.println("4. Borrar todos los contactos");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            while (!sc.hasNextInt()) {
                System.out.print("Por favor, introduce un número válido: ");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    
                    try{
                        System.out.println("\n****** Añadir nuevo contacto");
                        System.out.print("Introduce el nombre: ");
                        String entradaNombre = sc.nextLine();

                        Pattern patronNombre = Pattern.compile("[a-zA-ZÁÉÍÓÚÑñ]+(?:[\\s'-][A-Za-zÁÉÍÓÚÑñ]+)*");
                        Matcher matcherNombre = patronNombre.matcher(entradaNombre);

                        if(!matcherNombre.find()){
                            System.out.println("ERROR: Nombre no válido");
                            break;
                        }

                        String nombre = matcherNombre.group();

                        System.out.print("Introduce el teléfono: ");
                        String entradaTelefono = sc.nextLine();

                        Pattern patronTelefono = Pattern.compile("\\+\\d+{2}\\s?(\\d+{9})");
                        Matcher matcherTelefono = patronTelefono.matcher(entradaTelefono);

                        if(!matcherTelefono.find()){
                            System.out.println("ERROR: Telefono no válido");
                            break;
                        }

                        String telefono = matcherTelefono.group();

                        System.out.print("Introduce el día de nacimiento: ");
                        String entradaDia = sc.nextLine();

                        Pattern patronDia = Pattern.compile("([0-2][1-9]|3[0-1])");
                        Matcher matcherDia = patronDia.matcher(entradaDia);

                        if(!matcherDia.find()){
                            System.out.println("ERROR: Día no válido");
                            break;
                        }

                        String dia = matcherDia.group();

                        System.out.print("Introduce el mes de nacimiento: ");
                        String entradaMes = sc.nextLine();

                        Pattern patronMes = Pattern.compile("0[1-9]|1[0-2]");
                        Matcher matcherMes = patronMes.matcher(entradaMes);

                        if(!matcherMes.find()){
                            System.out.println("ERROR: Mes no válido");
                            break;
                        }

                        String mes = matcherMes.group();


                        System.out.print("Introduce el año de nacimiento: ");
                        String entradaYear = sc.nextLine();

                        Pattern patronYear = Pattern.compile("(\\d{4})");
                        Matcher matcherYear = patronYear.matcher(entradaYear);

                        if(!matcherYear.find()){
                            System.out.println("ERROR: Año no válido");
                            break;
                        }

                        String year = matcherYear.group();


                        sc.nextLine();
                        agenda.anadeAgenda(new Contacto(nombre, Long.parseLong(telefono), Integer.parseInt(dia), Integer.parseInt(mes), Integer.parseInt(year)));
                        System.out.println("Contacto añadido correctamente");

                        break;
                    }catch(IllegalArgumentException e){
                        System.out.println("Fecha fuera de rango permitido");
                    }catch(DateTimeException e){
                        System.out.println("Fecha inválida: "+e.getMessage());
                    }/*catch(NumberFormatException e){
                        
                    }*/
                    
                    
                case 2:
                    System.out.println("\n****** Mostrando contactos");
                    agenda.muestraAgenda();
                    break;
                case 3:
                    System.out.println("\n****** Borrar contacto por nombre");
                    System.out.print("Introduce el nombre del contacto a borrar: ");
                    String nombreBorrar = sc.nextLine();
                    if (agenda.borrarContacto(nombreBorrar)) {
                        System.out.println("Contacto borrado correctamente");
                    } else {
                        System.out.println("No se encontró ningún contacto con ese nombre");
                    }
                    break;
                case 4:
                    System.out.println("\n****** Borrar todos los contactos");
                    agenda.borrarAgenda();
                    System.out.println("Todos los contactos han sido eliminados");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no válida. Intentalo de nuevo");
            }
        } while (opcion != 5);
        sc.close();
        
        
        
        
        // Identificador de correos electrónicos
        Pattern patronCorreos =        
        Pattern.compile("([a-zA-Z0-9._%-]+)@([a-zA-Z0-9.-]+).([a-zA-Z]{2,6})");
        // Texto sucio con un correo oculto
        Matcher coincidenteCorreos = 
        patronCorreos.matcher("#####____123dasd@gmail.com€@#~$$ (+++)");
        while (coincidenteCorreos.find()) {
            System.out.println("Encontrado correo: " 
            + coincidenteCorreos.group());
        }
        
        
        
        
        
    }
}
