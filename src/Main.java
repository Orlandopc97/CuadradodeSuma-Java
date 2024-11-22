import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el valor de a y b: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int suma = ((a*a) + (b*b)) + (2*a*b);

        System.out.println(suma);

    }
}