
import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        
        //Pedir cantidad total de diferentes productos
        Scanner scanner = new Scanner(System.in);

        CuentaSupermercado cuentaSupermercado = new CuentaSupermercado();

        // Bienvenida y numero total de articulos
        System.out.println();
        System.out.print("Bienvenido a Supermercado Pepito!");
        System.out.println();
        System.out.print("Ingrese numero total de productos: ");
        int nTotProductos = scanner.nextInt();

        
        // Pedir nombre precio unitario y cantidad en bucle hasta alcanzar nTotProductos
        while (cuentaSupermercado.getHashMapProductos().size() < nTotProductos) { 
        
            scanner.nextLine();
            System.out.println();
            System.out.print("Ingrese nombre del producto:");
            String nombrePr = scanner.nextLine();
            System.out.println();
            System.out.print("Ingrese precio unitario del producto: ");
            double precioUnitario = scanner.nextFloat();
            System.out.println();
            scanner.nextLine();
            System.out.print("Ingrese la cantidad de este producto: ");
            int cantidad = scanner.nextInt();

            Producto producto = new Producto(nombrePr, precioUnitario);
            cuentaSupermercado.añadirProducto(producto, cantidad);
        }

        cuentaSupermercado.mostrarTicket();

        scanner.close();
    }
}  


