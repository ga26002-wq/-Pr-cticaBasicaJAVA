import java.util.Scanner;
public class Ejercicio7PromedioValidado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nota 1 (0-10): ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese nota 2 (0-10): ");
        double n2 = sc.nextDouble();
        System.out.print("Ingrese nota 3 (0-10): ");
        double n3 = sc.nextDouble();

        // Validación de rango
        if ((n1 < 0 || n1 > 10) || (n2 < 0 || n2 > 10) || (n3 < 0 || n3 > 10)) {
            System.out.println("Error: Las notas deben estar entre 0 y 10.");
        } else {
            double promedio = (n1 + n2 + n3) / 3;
            System.out.printf("Promedio: %.2f\n", promedio);

            if (promedio >= 6.0) {
                System.out.println("Estado: APROBADO");
            } else {
                System.out.println("Estado: REPROBADO");
            }
        }
        sc.close();
    }
}
