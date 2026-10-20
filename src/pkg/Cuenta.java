package pkg;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    public String mNumero;
    public String mTitular;
    public List<Movimiento> mMovimientos = new ArrayList<>();
    private double saldoTemporal;

    public Cuenta(double saldoInicial) {
        this.saldoTemporal = saldoInicial;
    }
    
    public double getSaldo() {
        return this.saldoTemporal;
    }
    
    public void ingreso(double i) {
        this.saldoTemporal += i;
    }
    
    public void reintegro(double i) {
        if (this.saldoTemporal - i < -500.0) {
            System.out.println("Fondos insuficientes");
        }
        this.saldoTemporal -= i;
    }
}