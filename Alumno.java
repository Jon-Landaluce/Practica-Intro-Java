import java.util.Map;
import java.util.HashMap;

public class Alumno {

    // Atributos
    private String nombreAl;
    private String apellidoAl;
    private HashMap<String, Asignatura> colAsignaturas;

    // Constructor
    public Alumno(String nombreAl, String apellidoAl) {
        this.nombreAl = nombreAl;
        this.apellidoAl = apellidoAl;
        this.colAsignaturas = new HashMap<>();
    }

    // METODOS

    // Añadir asignatura
    public void informarAsignatura(String nombreAsignatura, double nota) {

        if (colAsignaturas.containsKey(nombreAsignatura)){
            System.out.println("La Asignatura " + nombreAsignatura + " ya se encuentra en la base de datos");

        } else { Asignatura asignatura = new Asignatura(nombreAsignatura, nota);
        colAsignaturas.put(asignatura.getNombreAsig(), asignatura);
        }
    }

    // Modificar asignatura 
    public void modificarAsignatura(String nombreAsignatura, double nuevaNota) {
        
        if (colAsignaturas.containsKey(nombreAsignatura)) {

            Asignatura objNombreYnota = colAsignaturas.get(nombreAsignatura);
            objNombreYnota.setNotaAsig(nuevaNota);
            //System.out.println("La nota de la asignatura: " + nombreAsignatura + " ha sido modificada correctamente al valor: " + nuevaNota);

        } else {
            System.out.println("La asignatura" + nombreAsignatura + " no se encuentra en la base de datos");
        }
    }

    // Calcular Promedio
    public double calcularPromedio (){

        if (colAsignaturas.isEmpty()) {
            return 0.0;

        } else {

            double sumaNotas = 0;

            for (String asignatura: colAsignaturas.keySet()) {
                Asignatura objNombreYnota = colAsignaturas.get(asignatura);
                sumaNotas += objNombreYnota.getNotaAsig();
            }
            return sumaNotas / colAsignaturas.size();
        }
    }

    // Mostrar Boletin
    public void mostrarBoletin(){
        System.out.println("Boletín de calificaciones");
        System.out.println();
        System.out.println("Alumno: " + nombreAl + " " + apellidoAl);
        System.out.println("------------------------------------");
        System.out.println("Asignatura\t\tNota");
        System.out.println("------------------------------------");
        for (Map.Entry<String, Asignatura> entry : colAsignaturas.entrySet()) {
            String nombreAsignatura = entry.getKey();
            Asignatura asignatura = entry.getValue();
            
            double nota = asignatura.getNotaAsig();
            
            System.out.printf("%-20s\t%.2f\n", nombreAsignatura, nota);
            }
            System.out.println("-----------------------------------");
            System.out.printf("Nota Media:\t\t%.2f\n", calcularPromedio());
            System.out.println();
            System.out.println();
            System.out.println();
    }


    // Getters & Setters
    public String getNombreAl() {
        return nombreAl;
    }

    public void setNombreAl(String nombreAl) {
        this.nombreAl = nombreAl;
    }

    public String getApellidoAl() {
        return apellidoAl;
    }

    public void setApellidoAl(String apellidoAl) {
        this.apellidoAl = apellidoAl;
    }

    // Obtener longitud del hashmap para controlar el numero de iteraciones
    // al crear productos en el main
    public HashMap<String, Asignatura> getColAsignaturas() {
        return colAsignaturas;
    }

}
