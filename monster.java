import java.util.*;
public class monster {
    static int Defeat (int []power, int []bon, int n, int exp) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (power[i] <= exp) {
                exp += bon[i];
                count++;
                System.out.println(exp);
            }
        }
        return count;
    }
    
    static void display (int []m) {
        for (int i = 0 ; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println("");
    }

    public static void main (String []args) {
        System.out.print("enter the number of monster:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("enter exp:");
        int exp = sc.nextInt();

        int []power = new int[n];
        int []bon =new int[n];

        
        for (int i = 0 ; i < n; i++) {
            System.out.print("enter power of "+i+"th monstor:");
            power[i] = sc.nextInt();
            System.out.print("enter the bonus of " + i + "th monstor:");
            bon[i] = sc.nextInt();
        }
        display(bon);
        display(power);

        //sort
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (power[j] > power[j+1] ) {

                    //power
                    int temp = power[j+1];
                    power[j+1] = power[j];
                    power[j] = temp;

                    //bonus
                    temp =  bon[j+1];
                    bon[j+1] = bon[j];
                    bon[j] = temp;
                }
            }
        }
        
        display(bon);
        display(power);

        System.out.println("number of monstors defeat:" + Defeat(power, bon, n, exp));
    }
}