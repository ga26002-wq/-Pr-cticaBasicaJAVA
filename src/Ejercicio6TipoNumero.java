import java.util.Scanner;
public class Ejercicio6TipoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número es POSITIVO.");
        } else if (numero < 0) {
            System.out.println("El número es NEGATIVO.");
        } else {
            System.out.println("El número es NEUTRO (Cero).");
        }

        sc.close();
    }
}
