package poo;

// Herencia
public class cuentaAhorro extends cuentica{
    
    private double tasaInteres;

    public cuentaAhorro(double tasaInteres, String Cuenta, double BalanceInicial) {
        super(Cuenta, BalanceInicial);
        this.tasaInteres = tasaInteres;
    }
    
    public double aplicarInteres() {
        double interes = obtenerBalance() * tasaInteres;
        deposito(interes);
        return interes;
    }
    
    
}
