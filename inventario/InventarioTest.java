package inventario;

public class InventarioTest {

    public static void main(String[] args) {
        
        Producto producto1 = new Producto("P001", "Laptop", 10, 1200.0);
        Producto producto2 = new Producto("P002", "Smartphone", 20, 800.0);
        Producto producto3 = new Producto("P003", "Tablet", 5, 500.0);

        System.out.println("Estado inicial del inventario:");
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();

        System.out.println("\nVendiendo 3 Laptops...");
        producto1.actualizarStock(-3);
        System.out.println("\nInventario actualizado:\n");
        producto1.mostrarInformacion();
        System.out.println("");

        System.out.println("Reponiendo 10 Smartphones...");
        producto2.actualizarStock(10);
        System.out.println("Reposición exitosa\n");
        System.out.println("Inventario actualizado:\n");
        producto2.mostrarInformacion();

        System.out.println("Intentando vender 7 Tablets...");
        producto3.actualizarStock(-7); 
        System.out.println("\nInventario actualizado:\n");
        producto3.mostrarInformacion();

        
        
        
        
    
        
    }
    
}
