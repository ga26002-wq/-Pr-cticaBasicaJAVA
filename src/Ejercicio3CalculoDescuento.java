import java.util.Scanner;
public class Ejercicio3CalculoDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto total de la compra: ");
        double compra = sc.nextDouble();

        // Calculamos el 10% de descuento
        double descuento = compra * 0.10;
        double totalPagar = compra - descuento;

        System.out.println("--- Resumen de Compra ---");
        System.out.println("Monto original: $" + compra);
        System.out.println("Descuento (10%): $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);

        sc.close();
    }
}
