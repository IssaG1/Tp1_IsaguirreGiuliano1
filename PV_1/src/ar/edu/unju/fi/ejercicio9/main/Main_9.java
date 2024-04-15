package ar.edu.unju.fi.ejercicio9.main;


import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // aca creamos 3 objetos de producto, para que pida 3 veces ingresar datos
        for (int i = 0; i < 3; i++) {
            Producto producto = new Producto();
            
            System.out.println("--------------------------------------------------------");
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            System.out.println("--------------------------------------------------------");
            System.out.println("                                                        ");

            producto.setNombre(scanner.nextLine());
            
            System.out.println("--------------------------------------------------------");
            System.out.println("Ingrese el código del producto " + (i + 1) + ":");
            System.out.println("--------------------------------------------------------");
            System.out.println("                                                        ");

            producto.setCodigo(scanner.nextLine());
            
            System.out.println("--------------------------------------------------------");
            System.out.println("Ingrese el precio del producto " + (i + 1) + ":");
            System.out.println("--------------------------------------------------------");
            System.out.println("                                                        ");

            producto.setPrecio(scanner.nextDouble());
            
            System.out.println("--------------------------------------------------------");
            System.out.println("Ingrese el descuento del producto " + (i + 1) + " (entre 0 y 50):");
            System.out.println("--------------------------------------------------------");
            System.out.println("                                                        ");
            producto.setDescuento(scanner.nextInt());

            scanner.nextLine(); // salto

            // calculo descuento
            System.out.println("|--------------------------------------------------------|");
            System.out.println("|     Datos del producto " + (i + 1) + ":" +            "|");
            System.out.println("|     Nombre: " + producto.getNombre() +                "|");
            System.out.println("|     Código: " + producto.getCodigo() +                "|");
            System.out.println("|     Precio: " + producto.getPrecio()    +             "|");
            System.out.println("|     Descuento: " + producto.getDescuento() +"%         |");
            System.out.println("|     Precio con descuento: " + producto.calcularDescuento());
            System.out.println("---------------------------------------------------------|");

        }

        scanner.close();
    }
}
