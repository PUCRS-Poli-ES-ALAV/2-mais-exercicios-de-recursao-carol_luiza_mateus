
public class somatorioRecursivoLu {

    public static int somatorio(int n) {
        //Caso base: se n for 0, o somatório é 0.
        if (n == 0) {
            return 0;
        }
        return n + somatorio(n - 1); //método chama a si mesmo e soma 'n' ao resultado da chamada.
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = somatorio(numero);
        System.out.println("O somatório de " + numero + " até 0 é: " + resultado);
    }
}
