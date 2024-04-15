package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;

    // ingrediences especiales adicionales
    private final int ADICIONAL_20 = 500;
    private final int ADICIONAL_30 = 750;
    private final int ADICIONAL_40 = 1000;

    // constr por defecto
    public Pizza() {
        this.diametro = 20; // diametr
        this.ingredientesEspeciales = false; // const ingredientes especiales
        calcularPrecio();
        calcularArea();
    }

    // geter y setters 
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    //precio de la pizza
    public void calcularPrecio() {
        if (diametro == 20) {
            precio = 4500 + (ingredientesEspeciales ? ADICIONAL_20 : 0);
        } else if (diametro == 30) {
            precio = 4800 + (ingredientesEspeciales ? ADICIONAL_30 : 0);
        } else if (diametro == 40) {
            precio = 5500 + (ingredientesEspeciales ? ADICIONAL_40 : 0);
        }
    }

    // area de la pizza
    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    }
}
