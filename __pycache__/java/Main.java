package __pycache__.java;

//Find the index of largest number in an Array
 class findTheIndexOfLargestNumberInAnArray {
    
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={1,24,34,24,52,94,64,2,23,45,92,91};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
            if(arr[arr.length-1-i]>arr[max]){
                max=i;
            }
            
            System.out.println(i);
        }
        System.out.println("number:"+arr[max]+" max; "+max);
    
    }
}