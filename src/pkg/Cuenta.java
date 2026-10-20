package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    public String mNumero;
    public String mTitular;
    public List<Movimiento> mMovimientos = new ArrayList<>();

    public Cuenta(double saldoInicial) {
        if (saldoInicial > 0) {
            ingreso(saldoInicial);
        }
    }
    
    public double getSaldo() {
        double saldo = 0;
        for (Movimiento m : mMovimientos) {
            saldo += m.getImporte(); 
        }
        return saldo;
    }
    
    public void ingreso(double i) {
        mMovimientos.add(new Movimiento(i, "Ingreso")); 
    }
    
    public void reintegro(double i) {
        if (getSaldo() - i < -500.0) {
        	System.out.println("Fondos insuficientes");
        }
        mMovimientos.add(new Movimiento(-i, "Reintegro")); 
    }
}