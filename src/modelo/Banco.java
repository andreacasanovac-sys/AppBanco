package modelo;

public class Banco {
    private String nombre;
    private String direccion;
    private int telefono;
    private Cliente[] clientes;
    private int numeroClientes;

    public Banco(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        clientes = new Cliente[10];
        this.numeroClientes = 0;
    }

    public Cliente getCliente(int numeroCliente) {
        return clientes[numeroCliente - 1];
    }

    public void setCliente(Cliente cliente) {
        clientes[numeroClientes] = cliente;
        numeroClientes++;
    }

    public void imprimirReporte() {

    }
}