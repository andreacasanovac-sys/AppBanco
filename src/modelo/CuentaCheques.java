package modelo;

public class CuentaCheques {
    private double balance;
    private double montoSobregiro;

    public CuentaCheques(double balance) {
        this.balance = balance;
    }

    public void retirar(double monto) {
        if (monto > 0) {
            if (balance >= monto) {
                balance = balance - monto;
            }else {
                if (balance + montoSobregiro >= monto) {
                    montoSobregiro = montoSobregiro - (monto - balance);
                    balance = 0;
                } else {
                    System.out.println("Monto insuficiente");
                }
            }
            } else {
            System.out.println("Monto incorrecto");
        }
        return;
    }

    public void depositar(double monto) {
        if (monto > 0) balance = balance + monto;
        else System.out.println("Monto incorrecto");
        return;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMontoSobregiro() {
        return montoSobregiro;
    }

    public void setMontoSobregiro(double montoSobregiro) {
        this.montoSobregiro = montoSobregiro;
    }
}