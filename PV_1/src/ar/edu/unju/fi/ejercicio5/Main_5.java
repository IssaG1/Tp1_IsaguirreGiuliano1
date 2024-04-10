package ar.edu.unju.fi.ejercicio5;

	import java.util.Scanner;

	public class Main_5 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numero;

	        // ingresar un numero del 1 al 9
	        System.out.print("Ingrese un numero entero entre 1 y 9: ");
	        numero = scanner.nextInt();


	        // Mostrar la tabla de multiplicar 
	        System.out.println("Tabla de multiplicar del " + numero + ":");

	        for (int i = 0; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }

	        scanner.close();
	    }
	
	
	
	
	
	
	
	
}
