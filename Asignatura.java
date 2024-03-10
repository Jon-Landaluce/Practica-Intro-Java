
public class Asignatura {

    // Atributos
    private String nombreAsignatura;
    private double nota;

    // Constructor
    public Asignatura(String nombreAsignatura, double nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }

    // Getter & Setters
    public String getNombreAsig() {
        return nombreAsignatura;
    }
    public void setNombreAsig(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
    public double getNotaAsig () {
        return nota;
    }
    public void setNotaAsig (double nota) {
        this.nota = nota;
    }
}
