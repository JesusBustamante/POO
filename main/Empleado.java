package main;

public class Empleado {
    
    private String nombre;
    private int id;
    private double salario;

    public Empleado() {}
    
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        setSalario(salario);
    }
    
    // Getter y setter para nombre
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }
    
    // Getter para salario
    public double getSalario() {
        return salario;
    }
    
    // Setter personalizado para salario
    public void setSalario(double salario) {
        if(salario < 0) {
            System.out.println("El salario ingresado es inválido, asigne solo valores positivos");
        } else {
            this.salario = salario;
        }
    }
    
    public void mostrarInformacion() {

        System.out.println("Información del empleado");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Salario: " + salario);

    }
    
}
