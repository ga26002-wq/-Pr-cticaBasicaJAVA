import java.util.Scanner;
public class Ejercicio8NumeroMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int n3 = sc.nextInt();

        int mayor = n1; // Asumimos que el primero es el mayor

        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }

        System.out.println("El número mayor de los tres es: " + mayor);
        sc.close();
    }
}
