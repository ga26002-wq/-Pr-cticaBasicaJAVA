import java.util.Scanner;
public class Ejercicio9DescuentoMonto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        double compra = sc.nextDouble();
        double porcentaje = 0;

        if (compra < 100) {
            porcentaje = 0; // Sin descuento
        } else if (compra >= 100 && compra <= 300) {
            porcentaje = 0.10; // 10%
        } else if (compra > 300) {
            porcentaje = 0.15; // 15%
        }

        double descuento = compra * porcentaje;
        double total = compra - descuento;

        System.out.println("--- Detalle de Pago ---");
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total final a pagar: $" + total);

        sc.close();
    }
}
