import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        java.util.ArrayList<String> substrings = new java.util.ArrayList<>();

        for (int i = 0; i <= s.length() - k; i++) {
            substrings.add(s.substring(i, i + k));
        }
        java.util.Collections.sort(substrings);

        //returns smallest && largest
        return substrings.get(0) + "\n" + substrings.get(substrings.size() - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}