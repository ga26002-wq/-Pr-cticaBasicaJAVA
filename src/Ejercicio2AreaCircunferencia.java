import java.util.Scanner;
public class Ejercicio2AreaCircunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        // Usamos Math.PI para mayor precisión
        double area = Math.PI * Math.pow(radio, 2);

        System.out.printf("El área de la circunferencia es: %.2f\n", area);

        sc.close();
    }
}
