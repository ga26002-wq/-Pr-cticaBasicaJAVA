import java.util.Scanner;
public class Ejercicio5PromedioEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Ingrese nota 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Ingrese nota 3: ");
        double n3 = sc.nextDouble();

        double promedio = (n1 + n2 + n3) / 3;

        System.out.printf("Promedio final: %.2f\n", promedio);

        if (promedio >= 6.0) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }

        sc.close();
    }
}
