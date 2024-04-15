public class Main {
    public static void main(String[] args) {

        // Inizializza una matrice
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Stampare la somma degli elementi sulla prima riga
        int sumFirstRow = sumFirstRow(matrix);
        System.out.println("La somma degli elementi della prima riga è: " + sumFirstRow);
    }

    // Metodo per calcolare la somma degli elementi sulla prima riga
    public static int sumFirstRow(int[][] matrix) {
        int sum = 0;
        // Ciclo attraverso gli elementi della prima riga
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[0][i];
        }
        return sum;
    }
}


