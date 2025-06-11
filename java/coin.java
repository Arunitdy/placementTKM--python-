import java.util.Scanner;

public class coin{
    
    static void Display(int [][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    static int Exchange (int [][] matrix, int []amount, int []coin) {
        System.out.println(matrix.length+ " "+ matrix[0].length+ " "+ amount.length+ " "+ coin.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == 0) {
                    matrix[i][j] = 1;
                } else if( i == 0) {
                    matrix[i][j] = (amount[j] % coin[i] == 0) ? 1 : 0;
                } else if (coin[i] > amount[j]) {
                    matrix[i][j]= matrix[i-1][j];
                } else {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][ amount[j]- coin[i]];
                }
            }
        }
        Display(matrix);
        return matrix[coin.length - 1][amount.length - 1];

    }

    public static void main (String []args){

        int []coin = new int[]{2, 3, 5, 10};

        System.out.print("enter the amount:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []amount = new int[n+1];

        for (int i = 0; i < n+1; i++) {
            amount[i] = i;
        }

        int [][]matrix = new int[coin.length][amount.length];

        Exchange(matrix, amount, coin);
    }
}