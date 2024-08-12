public class palindromoLu {
    public static boolean isPalindromo(String s) {
        //caso base 1: Se a string tiver 0 ou 1 caractere, é palíndromo.
        if(s.length() <= 1) {
            return true;
        }
        //Caso base 2: Se o primeiro e o último caracteres não são iguais, não é palíndromo.
        if (s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        //Recursão: verificar substring sem o primeiro e o último caractere. 
        return isPalindromo(s.substring(1,s.length()-1));
    }
    public static void main(String[] args) {
        String palavra = "radar";
        boolean resultado = isPalindromo(palavra);
        System.out.println("A palavra \"" + palavra + "\" é um palíndromo? " + resultado);
    }
}
