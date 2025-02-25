package inventario;

public class Producto {
    
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        setCantidad(cantidad);
        setPrecio(precio);
    }
    
    // Getters
    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCantidad(int cantidad) {
        if(cantidad < 0) {
            System.out.println("La cantidad asignada debe ser positiva");
        } else {
            this.cantidad = cantidad;
        }
    }
    
    public void setPrecio(double precio) {
        if(precio < 0) {
            System.out.println("Precio inválido. Debe ser mayor a cero");
        } else {
            this.precio = precio;
        }
    }
    
    public void actualizarStock(int cantidad) {
        int nuevaCantidad = this.cantidad + cantidad;
        if(nuevaCantidad >= 0) {
            this.cantidad = nuevaCantidad;
        } else {
            System.out.println("No hay suficiente cantidad para realizar la operación");
        }
    }
    
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: $" + precio);
        System.out.println("-----------------------------");
    }
}
