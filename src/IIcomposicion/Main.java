package IIcomposicion;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta23 = new Cuenta();
        cuenta23.setNumero(25561);
        cuenta23.setSaldo(1500);
        cuenta23.setEstrategia(new EstrategiaCuentaCorriente());

        cuenta23.extraer(10000 );
        System.out.println(cuenta23.getSaldo());
        cuenta23.setEstrategia(new EstrategiaCajaAhorro());
        cuenta23.extraer(-10000);
        System.out.println(cuenta23.getSaldo());

    }
}
