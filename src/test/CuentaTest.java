package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pkg.Cuenta;

class CuentaTest {

    private Cuenta cta;

    @BeforeEach
    void setUp() throws Exception {
        cta = new Cuenta(20);
    }

    @Test
    void testIngreso() {
        cta.ingreso(25);
        assertEquals(45, cta.getSaldo());
    }

    @Test
    void testReintegro() {
        cta.reintegro(15);
        assertEquals(5, cta.getSaldo());
    }

    @Test
    void test0014() {
        Cuenta cuenta12345 = new Cuenta(50);
        cuenta12345.mNumero = "12345";
		
        Cuenta cuenta67890 = new Cuenta(0);
        cuenta67890.mNumero = "67890"; 

        cuenta12345.reintegro(200);
        cuenta67890.reintegro(350);
        cuenta12345.ingreso(100);   

        cuenta67890.reintegro(150);
        cuenta12345.reintegro(200);
        cuenta67890.ingreso(50);    

        assertEquals(-250.0, cuenta12345.getSaldo());
        assertEquals(-450.0, cuenta67890.getSaldo());
    }
}