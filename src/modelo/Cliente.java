package modelo;

public class Cliente {
    private String nombre;
    private String apellido;
    private CuentaCheques cuentaCheques;
    private CuentaAhorros cuentaAhorros;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public CuentaCheques getCuentaCheques() {
        return cuentaCheques;
    }

    public void setCuentaCheques(CuentaCheques cuentaCheques) {
        this.cuentaCheques = cuentaCheques;
    }

    public CuentaAhorros getCuentaAhorros() {
        return cuentaAhorros;
    }

    public void setCuentaAhorros(CuentaAhorros cuentaAhorros) {
        this.cuentaAhorros = cuentaAhorros;
    }
}