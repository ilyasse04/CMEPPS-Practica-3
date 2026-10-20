package pkg;

import java.util.List;

public class Cuenta {
    public String mNumero;
    public String mTitular;
    public List<Movimiento> mMovimientos;

    public Cuenta(double saldoInicial) {
    }
    
    public double getSaldo() {
        return 0;
    }
    
    public void ingreso(double i) {
    }
    
    public void reintegro(double i) {
    }
}