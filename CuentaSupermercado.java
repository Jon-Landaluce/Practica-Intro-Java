import java.util.HashMap;

public class CuentaSupermercado {

    // Atributos
    private HashMap<String, Producto> productos;
    private HashMap<String, Integer> cantidades;
    private int cantidad;

    // Constructor
    public CuentaSupermercado() {
        this.productos = new HashMap<>();
        this.cantidades = new HashMap<>();
        this.cantidad = 0;
    }

    // Metodos

    // Añadir productos a la cuenta
    
    public void añadirProducto(Producto producto, int cantidad) {
        
        // Solo si el producto ya existe: sumar solo las unidades
        if (productos.containsKey(producto.getNombrePr())){
            cantidades.put(producto.getNombrePr(), cantidades.get(producto.getNombrePr()) + cantidad);
        // En caso constrario añadir a las listas
        } else {
            productos.put(producto.getNombrePr(), producto);
            cantidades.put(producto.getNombrePr(), cantidad);
        }
        this.cantidad += cantidad;
    }

    // Calcular precio total de la compra
    public double calcularPrecioTotal() {

        double total = 0;
        
        for (String nombreProducto : productos.keySet()) {
            total += productos.get(nombreProducto).getPrecioUnitario() * cantidades.get(nombreProducto);
        }
        return total;
    }

    // Mostrar ticket
    public void mostrarTicket(){
        System.out.println();
        System.out.println();
        System.out.println("TICKET");
        System.out.println();
        System.out.println("PROD.\t\t\tUN.\tPRECIO UN.\t\tTOTAL");
        System.out.println("--------------------------------------------------------------");
        for (String nombreProducto : productos.keySet()){
            Producto producto = productos.get(nombreProducto);
            int cantidad = cantidades.get(nombreProducto);
            System.out.printf("%s\t\t\t%d\t\t%.2f\t\t%.2f\n", nombreProducto,
            cantidad,
            producto.getPrecioUnitario(), 
            producto.getPrecioUnitario() 
            * cantidad);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("Total:\t\t\t\t\t\t\t%.2f\n", calcularPrecioTotal());

    }

    // Obtener longitud del hashmap para controlar el numero de iteraciones
    // al crear productos en el main
    
    public HashMap<String, Producto> getHashMapProductos(){
        return productos;
    }
}