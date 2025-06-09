import java.util.Scanner;

class sort {
    static void printArray(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void bubble(int []arr) {
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    printArray(arr);
                }

            }
        }
    } 
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: "); 
        int n = scanner.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        bubble(arr);
        System.out.println("Sorted array:");
        printArray(arr);
        scanner.close();
    }
}