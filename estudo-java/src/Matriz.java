import java.util.Scanner;

public class Matriz {
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas tera a matriz?");
        int l = sc.nextInt();

        System.out.print("Quantas colunas tera a matriz?");
        int c = sc.nextInt();

        int[][] matriz = new int [l][c];

        for(int i=0; i<l; i++){
            for(int j=0; j<c; j++){
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("MATRIZ GERADA:");
        for(int i=0; i<l; i++){
            for(int j=0; j<c; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.err.println();
        }

        sc.close();
    }
} 