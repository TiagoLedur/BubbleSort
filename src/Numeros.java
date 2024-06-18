public class Numeros {

    public static void main(String[] args) {
        int[] numeros = {5, 1, 9, 3, 2, 7, 4}; // Array de números a ser ordenado
        int tamanho = numeros.length;

        // Loop principal do Bubble Sort
        for (int i = 0; i < tamanho - 1; i++) {
            for (int x = 0; x < tamanho - i - 1; x++) {
                if (numeros[x] > numeros[x+1]) {
                    // Troca os elementos de posição
                    int temp = numeros[x];
                    numeros[x] = numeros[x+1];
                    numeros[x+1] = temp;
                }
            }
        }

        // Imprime o array ordenado
        System.out.println("Array ordenado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

}
