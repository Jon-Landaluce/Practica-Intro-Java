import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

    // Crear Alumno y asignaturas
    
    String respuesta = "S";
    Scanner scanner = new Scanner(System.in);

    while (respuesta.equals("S")){

        // Crear Alumno 
        System.out.print("Introduzca el NOMBRE del alumno: ");
        String nombreAl = scanner.nextLine();
        System.out.print("Introduzca el APELLIDO del alumno: ");
        String apellidoAl = scanner.nextLine();
        Alumno alumno = new Alumno(nombreAl, apellidoAl);

        int numDeseadodeAsignaturas = 4;

        while (alumno.getColAsignaturas().size() < numDeseadodeAsignaturas){

            System.out.print("Introduzca NOMBRE de la asignatura: ");
            String nombreAsignatura = scanner.nextLine();
            System.out.print("Introduzca NOTA de la asignatura: ");
            double nuevaNota = scanner.nextDouble();
            scanner.nextLine();
            alumno.informarAsignatura(nombreAsignatura, nuevaNota);
        }

        String modificar = "S";

        while (!modificar.equals("N")){

            System.out.print("Desea modificar alguna asignatura? (S/N): ");
            modificar = scanner.nextLine().toUpperCase();

            if (modificar.equals("S")){
            System.out.print("Introduzca NOMBRE de la asignatura: ");
            String nombreAsignatura = scanner.nextLine();
            System.out.print("Introduzca NOTA de la asignatura: ");
            double nuevaNota = scanner.nextDouble();
            scanner.nextLine();
            alumno.modificarAsignatura(nombreAsignatura, nuevaNota);
            } else if (!modificar.equals("N")){
                System.out.println("Opcion no valida, responda S o N");
            }

        }

        alumno.mostrarBoletin();
        System.out.print("Desea añadir otro alumno? (S/N): ");
        respuesta = scanner.nextLine().toUpperCase();

        }
        scanner.close(); 
    }
}