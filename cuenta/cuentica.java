package poo;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String mensaje) {
        super(mensaje);
    }
}

// Encapsulación
public class cuentica {

    private String Cuenta;
    private double Balance;

    public cuentica(String Cuenta, double BalanceInicial) {
        this.Cuenta = Cuenta;
        this.Balance = BalanceInicial;
    }
    
    public void deposito(double monto) {
        this.Balance += monto;
    }
    
    public void retirar(double monto) throws InsufficientFundsException {
        if (monto > this.Balance) {
            throw new InsufficientFundsException("Fondo insuficiente");
        }
        this.Balance -= monto;
    }
    
    public double obtenerBalance() {
        return Balance;
    }
    
    public static void main(String[] args) {
        // Polimorfismo
        cuentica myAccount = new cuentaAhorro(0.05, "12345", 1000.0);

        double montoDepositado = 200.0;
        myAccount.deposito(montoDepositado);
        System.out.println("Se depositó: " + montoDepositado);

        double montoRetirado = 50.0;
        try {
            myAccount.retirar(montoRetirado);
            System.out.println("Se retiró: " + montoRetirado);
        } catch (InsufficientFundsException e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }

        if (myAccount instanceof cuentaAhorro) {
            cuentaAhorro cuentaAhorro = (cuentaAhorro) myAccount;
            double interesGenerado = cuentaAhorro.aplicarInteres();
            System.out.println("Intereses generados: " + interesGenerado);
        }

        System.out.println("Saldo final: " + myAccount.obtenerBalance());
    }
    
}
