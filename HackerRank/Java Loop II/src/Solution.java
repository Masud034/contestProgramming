import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0; i< t ; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            printResult(a , b, n);
        }
        in.close();
    }

    private static void printResult(int a, int b, int n) {
        int previousResult = a;

        for (int i =0; i < n; i++){
            previousResult += (Math.pow(2 , i) * b);
            System.out.print(previousResult + " ");
        }
        System.out.println();
    }
}