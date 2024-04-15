package ar.edu.unju.fi.ejercicio8.main;
import ar.edu.unju.fi.ejercicio8.model.*;
import java.util.Scanner;


public class Main_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("|-------------------------------");
        System.out.println("Ingrese aqui el valor de n:");
        System.out.println("|-------------------------------");
        int n = scanner.nextInt();

        // aqui esta el objeto CalculadoraEspecial <- no olvidar donde lo puse
        CalculadoraEspecial calculadora = new CalculadoraEspecial();
        calculadora.setN(n);

        // en la siguiente linea mostramos la sumatoria una vez calculads
        
        double sumatoria = calculadora.calcularSumatoria();
        System.out.println("|-------------------------------");
        System.out.println("|La sumatoria es: " + sumatoria);
        System.out.println("|-------------------------------");

        // y aca mostramos la productoriaa
        long productoria = calculadora.calcularProductoria();
        System.out.println("|-------------------------------");
        System.out.println("|La productoria es: " + productoria);
        System.out.println("|-------------------------------");

        scanner.close();
    }
}
