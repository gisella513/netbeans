/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReportesPack;

/**
 *
 * @author Michael
 */
public class repob {

    private int cantidad;
    private double precio;
    private double importe;

    public repob(int cantidad, double precio, double importe) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.importe = importe;

    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
