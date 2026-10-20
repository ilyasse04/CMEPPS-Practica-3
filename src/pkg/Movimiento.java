package pkg;

public class Movimiento {
    private Double importe;
    private String detalle;

    public Movimiento(Double importe, String detalle) {
        this.importe = importe;
        this.detalle = detalle;
    }

    public Double getImporte() {
        return importe;
    }

    public String getDetalle() {
        return detalle;
    }
}