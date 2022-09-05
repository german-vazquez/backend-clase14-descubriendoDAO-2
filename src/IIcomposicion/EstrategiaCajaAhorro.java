package IIcomposicion;

public class EstrategiaCajaAhorro implements EstrategiaExtraccion {
    @Override
    public boolean extraer(Cuenta cuenta, double monto) {
        boolean resultado = false;
        if (cuenta.getSaldo() >= monto) {
            resultado = true;
            cuenta.setSaldo(cuenta.getSaldo() - monto);
        }
        return resultado;
    }
};
