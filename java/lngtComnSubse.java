public class lngtComnSubse {
    static String  text2 = "abcd";
    static String text1 = "bacd";

    public static void displaySubString (int [][] matrix, int i, int j) {
        if (i == 0 || j == 0) return; 
        
        if (text1.charAt(i-1) == text2.charAt(j-1)) {
            displaySubString(matrix, i-1, j-1);
            System.out.println((i - 1) + ":" + (j - 1) + ":" + text1.charAt(i - 1) + " ");
        } else {
            if (matrix[i-1][j] == matrix[i][j-1]){
                displaySubString(matrix, i, j-1);
                displaySubString(matrix, i-1, j);
            } else if (matrix[i-1][j] < matrix[i][j-1]) {
                displaySubString(matrix, i, j-1);
            } else {
                displaySubString(matrix, i-1, j);
            }
        }

    }

     public static  void display (int [][] matrix,int n,int m) {
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();
        int [][] matrix = new int[n+1][m+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if (j == 0 || i == 0) {
                    matrix[i][j] = 0;
                } else if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                } else {
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
                }

            }
        }
        display(matrix, n, m);
        displaySubString(matrix, n , m);
        return matrix[n][m];

    }
    public static void main(String []args) {
        System.out.println("\n longestCommonSubsequence : " + longestCommonSubsequence( text1, text2));

    }
}
