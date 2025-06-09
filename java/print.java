
import java.util.Scanner;

class print {
        public static void printRecursive(int value) {
        if (1 == value) {
            System.out.print(value + " ");
        } else {
            System.out.print(value + " ");
            printRecursive(value - 1);
            System.out.print(value + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        printRecursive(value);
        sc.close();
    }
}