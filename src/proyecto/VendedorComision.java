package proyecto;

import java.util.Scanner;

public class VendedorComision {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del vendedor: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el sueldo mensual del vendedor: ");
        double sueldoMensual = scanner.nextDouble();
        System.out.print("Ingrese el monto de la venta 1: ");
        double venta1 = scanner.nextDouble();
        System.out.print("Ingrese el monto de la venta 2: ");
        double venta2 = scanner.nextDouble();
        System.out.print("Ingrese el monto de la venta 3: ");
        double venta3 = scanner.nextDouble();
        System.out.print("Ingrese el monto de la venta 4: ");
        double venta4 = scanner.nextDouble();
        double comision = (venta1 + venta2 + venta3+ venta4) * 0.10;
         double pagoTotal = sueldoMensual + comision;
       
        System.out.println("\nResultados:");
        System.out.println("Nombre del vendedor: " + nombre);
        System.out.println("La comisión de la venta es: " + comision);
        System.out.println("El sueldo neto del vendedor es: " + pagoTotal);
    }
}
