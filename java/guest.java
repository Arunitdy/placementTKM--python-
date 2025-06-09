import java.util.Scanner;

class guest {
    public static void main(String[] args) {
        System.out.println("Hello, Guest!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Time: ");
        int time = scanner.nextInt();
        int [] enter = new int[]{7,0,5,1,3};
        int [] leave = new int[]{1,2,1,3,4};
        
        int max = 0, cGuests = 0;
        for (int i = 0; i < time; i++) {
            cGuests += enter[i] - leave[i];
            if (cGuests > max) {
                max = cGuests;
            }
        }
        System.out.println("Maximum number of guests present at any time: " + max);
        scanner.close();

    }
}

/*
 * A party has been organised on cruise. The party is organised for a limited time(T). 
 * The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is 
 * represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.
Example 1:
Input :
5    -> Value of T
[7,0,5,1,3]  -> E[], Element of E[0] to E[N-1], where input each element is separated by new line 
[1,2,1,3,4]   -> L[], Element of L[0] to L[N-1], while input each element is separate by new line.
Output :
8
 */