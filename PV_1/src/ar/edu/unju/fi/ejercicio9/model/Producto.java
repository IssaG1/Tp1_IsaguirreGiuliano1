package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private int descuento;

    // constr por defecto
    public Producto() {
        this.nombre = "";
        this.codigo = "";
        this.precio = 0.0;
        this.descuento = 0;
    }

    // getters y seter para los atrb.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    // calculando descuento, error en en precio, arreglar ante de mandar al main// ya funca
    public double calcularDescuento() {
        double precioConDescuento = precio;
        if (descuento > 0 && descuento <= 50) {
            double porcentajeDescuento = descuento / 100.0;
            precioConDescuento = precio * (1 - porcentajeDescuento);
        }
        return precioConDescuento;
    }
}

