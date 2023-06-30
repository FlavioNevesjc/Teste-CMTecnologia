import java.util.Random;

public class Questao1 {
    public static void main(String[] args) {
        Inveter();
    }

    public static void Inveter() {
        //Gerar numeros aleatorios para Matriz
        Random random = new Random();
        int[][] matriz = new int[5][5];
        for(int i = 0; i< 5; i++) {
            System.out.print("[");
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(" " + matriz[i][j]);
            }
            System.out.print("]\n");
        }

        // Inverter as diagonais da matriz
        int[] temp = new int[5];
        for(int i = 0;i< 5;i++){
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    temp[i] = matriz[i][j];
                }
            }
        }

        // Imprimir a matriz com as diagonais invertida
        System.out.println("** Matriz com as Diagonais invertidas **");
        for(int i = 0;i< 5;i++){
            System.out.print("[");
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = temp[4 - i];
                }
                System.out.print(" " + matriz[i][j]);
            }
            System.out.print("]\n");
        }
    }
}