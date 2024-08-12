
public class fibonacciRecursivoLu {

    public static int fibonacci(int n) {
        //Caso base: Fibonacci de 0 = 0 | Fibonacci de 1 = 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int numero = 6;
        int resultado = fibonacci(numero);
        System.out.println("O " + numero + " º numero da sequencia de Fibonacci é: " + resultado);
    }
}
