public class Questao2 {
    public static void main(String[] args) {
        int [][] matrizA = new int[8][8];
        int [][] submatrizB = new int [4][4];

        int tamanhoAA = matrizA.length;
        int tamanhoAL = matrizA[0].length;
        int tamanhoBA = submatrizB.length;
        int tamanhoBL = submatrizB[0].length;

        calculaMatriz(tamanhoAA,tamanhoAL,tamanhoBA,tamanhoBL);
    }

// Função para validar quantas subMatriz B posso inserir na Matriz A
    public static void calculaMatriz(int tamanhoAA, int tamanhoAL, int tamanhoBA, int tamanhoBL) {

        int resultadoA = 0;
        int resultadoL = 0;
        int total;

        if (tamanhoAA < tamanhoBA) {
            System.out.println("A Altura da matriz A é menor que B");
        } else {
            if (tamanhoAA == tamanhoBA) {
                resultadoA = 0;
            } else {
                resultadoA = tamanhoAA/tamanhoBA;
            }
        }

        if (tamanhoAL < tamanhoBL) {
            System.out.println("A Largura da matriz A é menor que B");
        } else {
            if (tamanhoAL == tamanhoBL){
                resultadoL = 0;
            } else {
                resultadoL = tamanhoAL/tamanhoBL;
            }
        }

        if (resultadoA == 0 && resultadoL == 0) {
                total = 1;
            }

        if (resultadoA==0 || resultadoL==0) {
            total = resultadoA+resultadoL;
        } else {
            total = resultadoA*resultadoL;
        }

        System.out.println("Consigo inserir "+total+" submatriz B na matriz A");
    }
}
