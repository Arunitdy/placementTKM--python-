import java.util.*;

class stri {

    static void substring(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length()+1; j++) {
                System.out.println(str.substring(i, j));
                count++;
            }
        }
        System.out.println(count);
    }

    static void subSequence(String str, String current, int index) {

       if (index == str.length()) {
            System.out.println(current);
            return;
       }
       
       subSequence(str, current, index+1);
       subSequence(str, current + str.charAt(index), index+1);
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string:");
        String str = "abc"; //sc.nextLine();

        substring(str);
        System.out.println("substring :" + str.length() * (str.length() + 1)/2);
      //  subSequence(str, "", 0);
        System.out.println("Subsequences of the string:" + Math.pow(2, str.length()));
        
        sc.close();
    }
}