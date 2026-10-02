package modelo;

public class CuentaAhorros{
    private double balance;
    private double interes;

    public CuentaAhorros(double balance, double interes) {
        this.balance = balance;
        this.interes = interes;
    }

    public void retirar(double monto) {
        if (monto > 0) {
            if (balance >= monto) {
                balance = balance - monto;
            } else {
                System.out.println("Monto Insuficiente");
            }
        } else {
            System.out.println("Monto incorrecto");
        }
        return;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            balance = balance + monto;
        } else {
            System.out.println("Monto incorrecto");
        }
        return;
    }

    public void aplicarInteres() {
        balance = balance + balance * interes;
        return;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}