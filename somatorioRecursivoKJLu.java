public class somatorioRecursivoKJLu {
    public static int somatorio(int k, int j) {
        //Caso base: quando k é igual a j, retornamos j (ou k, são iguais :P)
        if(k == j) {
            return k;
        }

        //Se k for maior que j, invertemos os valores para garantir que somamos corretamente. 
        if(k > j) {
            return somatorio(k, j);
        }

        return k + somatorio(k + 1, j);
    }
    public static void main(String[] args) {
        int k = 3;
        int j = 6;
        int resultado = somatorio(k, j);
        System.out.println("O somatório dos números entre " + k + " e " + j + " é " + resultado);
    }
}
