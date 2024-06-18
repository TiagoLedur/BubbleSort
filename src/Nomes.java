public class Nomes{

        public static void main(String[] args) {
            String[] nomes = {"Carlos", "Kaua", "Bruno", "Daniel", "Tiago", "Leonardo"}; // Array de nomes a ser ordenado
            int tamanho = nomes.length;

            // Loop principal do Bubble Sort
            for (int i = 0; i < tamanho - 1; i++) {
                for (int x = 0; x < tamanho - i - 1; x++) {
                    if (nomes[x].compareTo(nomes[x+1]) > 0) {
                        // Troca os elementos de posição
                        String temp = nomes[x];
                        nomes[x] = nomes[x+1];
                        nomes[x+1] = temp;
                    }
                }
            }

            // Imprime o array ordenado
            System.out.println("Nomes ordenados:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(nomes[i] + " ");
            }
        }
    }

