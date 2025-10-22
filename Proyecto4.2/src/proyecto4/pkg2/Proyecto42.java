package proyecto4.pkg2;

public class Proyecto42 {

    public static void main(String[] args) {
        
        // 1. Creamos la asignatura
        System.out.println("--- Creando la asignatura de Programación Orientada a Objetos ---");
        Asignatura poo = new Asignatura();

        // 2. Creamos varios alumnos
        Alumno alumno1 = new Alumno("Stanis", 693755169);
        Alumno alumno2 = new Alumno("Pedro", 693755269);
        Alumno alumno3 = new Alumno("Ana", 693755369);
        Alumno alumno4 = new Alumno("Pedro", 693755269); // Este es un duplicado de Pedro

        // 3. Añadimos los alumnos a la asignatura
        System.out.println("\n--- Añadiendo alumnos a la asignatura ---");
        System.out.println("Añadiendo a Stanis... Resultado: " + poo.anadirAlumno(alumno1));
        System.out.println("Añadiendo a Pedro... Resultado: " + poo.anadirAlumno(alumno2));
        System.out.println("Añadiendo a Ana... Resultado: " + poo.anadirAlumno(alumno3));
        
        // Intentamos añadir al alumno duplicado
        System.out.println("Intentando añadir a Pedro otra vez... Resultado: " + poo.anadirAlumno(alumno4));

        // 4. Añadimos convocatorias a un alumno
        System.out.println("\n--- Añadiendo convocatorias a Stanis ---");
        
        // Obtenemos el array de convocatorias de Stanis
        Convocatoria[] convocatoriasStanis = alumno1.getConv();
        
        // Creamos y asignamos las convocatorias
        convocatoriasStanis[0] = new Convocatoria("Enero", 8);
        convocatoriasStanis[1] = new Convocatoria("Junio", 9);


        // 5. Mostramos toda la información de la asignatura
        System.out.println("\n--- Información final de la asignatura ---");
        System.out.println(poo.toString());
        
        // --- Prueba del método copia() sin JUnit ---
        System.out.println("\n--- Probando el método copia() de Convocatoria ---");
        
        // Prueba con valores
        Convocatoria convOriginal1 = new Convocatoria("febrero", 5);
        Convocatoria convCopia1 = convOriginal1.copia();
        System.out.println("Original 1: " + convOriginal1);
        System.out.println("Copia 1:    " + convCopia1);
        // Comprobamos si son el mismo objeto en memoria (debería ser false)
        System.out.println("¿Son el mismo objeto? " + (convOriginal1 == convCopia1)); 

        System.out.println("---");

        // Prueba con constructor por defecto
        Convocatoria convOriginal2 = new Convocatoria();
        Convocatoria convCopia2 = convOriginal2.copia();
        System.out.println("Original 2: " + convOriginal2);
        System.out.println("Copia 2:    " + convCopia2);
        // Comprobamos si son el mismo objeto en memoria (debería ser false)
        System.out.println("¿Son el mismo objeto? " + (convOriginal2 == convCopia2));
    }
}