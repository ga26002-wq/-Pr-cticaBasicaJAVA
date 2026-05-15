import java.util.Scanner;
public class Ejercicio4CalcularHipotenusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor del primer cateto: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el valor del segundo cateto: ");
        double b = sc.nextDouble();

        // Aplicamos el Teorema de Pitágoras: c = √(a² + b²)
        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("La hipotenusa del triángulo es: %.2f\n", hipotenusa);

        sc.close();
    }
}
