public class Producto {
    
    // Atributos
    private String nombrePr;
    private double precioUnitario;

    // Constructor

    public Producto (String nombrePr, double precioUnitario){
        this.nombrePr = nombrePr;
        this.precioUnitario = precioUnitario;
    }
    
    // Getters y Setters
    public String getNombrePr (){
        return nombrePr;
    }

    public void setNombreP (String nombrePr){
        this.nombrePr = nombrePr;
    }

    public double getPrecioUnitario (){
        return precioUnitario;
    }

    public void setPrecioUnitario (double precioUnitario){
        this.precioUnitario = precioUnitario;
    }
}
