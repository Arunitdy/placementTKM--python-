// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int candies=13;
        int num_people=4;
        int[] result = new int[num_people]; 
        int j=-1;
        int i=1;
        while(candies>0){
           if(candies>=i){
                System.out.println("if:"+i);
                j=(j+1)%num_people;
                result[j]+=i;
                System.out.println("candies: "+(candies-i)+" result[ j: "+j+ " ] = i: "+i+"  result["+j+"]="+result[j]);
                candies-=i;
                i++;
          
            }else{
                System.out.println("else:"+i);
                
                j=(j+1)%num_people;
                result[j]+=candies;
                candies=0;
                System.out.println("candies: "+(candies-i)+" result[ j: "+j+ " ] = i: "+i+"  result["+j+"]="+result[j]);
                break;
            }
        }
    }
}