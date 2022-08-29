import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuántos números de la serie de Fibonacci quieres calcular? \n");
        int numeros = sc.nextInt();

        FibonacciSerie.fibonacci(numeros);
    }
}