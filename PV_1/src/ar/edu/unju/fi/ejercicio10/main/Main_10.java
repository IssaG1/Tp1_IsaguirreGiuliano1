package ar.edu.unju.fi.ejercicio10.main;
import ar.edu.unju.fi.ejercicio10.model.Pizza; 

import java.util.Scanner;


public class Main_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // creando 3 objetos para el ingreso de 3 pizzas
        for (int i = 1; i <= 3; i++) {
            Pizza pizza = new Pizza();

            System.out.println("** Pizza " + i + " **");

            // diametro
            int diametro;
            do {
                System.out.println("Ingrese el diámetro de la pizza (20, 30 o 40):");
                diametro = scanner.nextInt();
            } while (diametro != 20 && diametro != 30 && diametro != 40);

            pizza.setDiametro(diametro);

         // Solicitar al usuario si la pizza lleva ingredientes especiales
            System.out.println("¿La pizza lleva ingredientes especiales? (si/no):");
            String respuesta = scanner.next().toLowerCase(); // aqui convertimos a minusculas el si o no pa que tome si tiene el mayus activado
            boolean ingredientesEspeciales = respuesta.equals("si");
            pizza.setIngredientesEspeciales(ingredientesEspeciales);


            // aca llamamos a la funcion precio y area
            pizza.calcularPrecio();
            pizza.calcularArea();

         // resultado con descuento de la pizza 
            System.out.println("----------------------------------------------------");
            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + (pizza.isIngredientesEspeciales() ? "sí" : "no"));
            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizza.getArea());
            System.out.println("----------------------------------------------------");

            System.out.println();
        }

        scanner.close();
    }
}
