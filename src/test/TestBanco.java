package test;

import modelo.Banco;
import modelo.Cliente;
import modelo.CuentaAhorros;
import modelo.CuentaCheques;

public class TestBanco {

    public static void main(String[] args) {
        Banco banco = new Banco("BANCO PATITO", "LA LAGUNA"); // Cremos el banco

        banco.setCliente(new Cliente("Balalaica", "Gómez")); // Incluyen clientes
        banco.setCliente(new Cliente("Pintatucha", "Pérez"));

        banco.getCliente(1).setCuentaAhorros(new CuentaAhorros(1000, .05)); // Creando cuenta de ahorros al cliente 1
        banco.getCliente(1).setCuentaCheques(new CuentaCheques(5000));

        banco.getCliente(1).getCuentaAhorros().depositar(5000);
        System.out.println(banco.getCliente(1).getCuentaAhorros().getBalance());

        banco.getCliente(1).getCuentaAhorros().retirar(1500);
        System.out.println(banco.getCliente(1).getCuentaAhorros().getBalance());

        banco.getCliente(1).getCuentaAhorros().aplicarInteres();
        System.out.println(banco.getCliente(1).getCuentaAhorros().getBalance());

        banco.getCliente(1).setCuentaCheques(new CuentaCheques(5000)); // Creando cuenta de Cheques al cliente 1
        banco.getCliente(1).getCuentaCheques().setMontoSobregiro(200);

        banco.getCliente(1).getCuentaCheques().retirar(300);
        System.out.println(banco.getCliente(1).getCuentaCheques().getBalance());

        banco.getCliente(1).getCuentaCheques().depositar(1500);
        System.out.println(banco.getCliente(1).getCuentaCheques().getBalance());

        banco.getCliente(1).getCuentaCheques().retirar(10000);
        System.out.println(banco.getCliente(1).getCuentaCheques().getBalance());

        banco.imprimirReporte();
    }
}