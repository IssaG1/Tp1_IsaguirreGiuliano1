package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
    private int n;

    // constr por defectp
    public CalculadoraEspecial() {
        this.n = 0; // Valor por defecto para n
    }

    // getter para n
    public int getN() {
        return n;
    }

    // setter para n
    public void setN(int n) {
        this.n = n;
    }

    // calcular sumatoria aqui, no olvidar este metodo llamarlo en el main
    public double calcularSumatoria() {
        double sumatoria = 0;
        for (int k = 1; k <= n; k++) {
            double termino = (double) (k * (k + 1) / 2);
            sumatoria += Math.pow(termino, 2);
        }
        return sumatoria;
    }

    // calculando productoria no olvidar tambien llamarlo
    public long calcularProductoria() {
        long productoria = 1; // long segun google pa calcular numeros muy grandes, recordar pagina 
        for (int k = 1; k <= n; k++) {
            productoria *= (k * (k + 4));
        }
        return productoria;
    }
}

