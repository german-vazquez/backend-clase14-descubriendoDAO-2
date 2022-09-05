package IIcomposicion;

public class Cuenta {
    private int numero;
    private double saldo;
    private EstrategiaExtraccion estrategia;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean extraer(double monto) {
        return estrategia.extraer(this, monto); // dependiendo de la cuenta donde se encuentre situada usará el metodo extraer que corresponda a esa cuenta.
    }

    public void setEstrategia(EstrategiaExtraccion estrategia) {
        this.estrategia = estrategia;
    }
}
