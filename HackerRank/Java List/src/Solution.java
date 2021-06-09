import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("How many elements you want to add initially: ");
        int initialNumberOfElements = scanner.nextInt();

        while (initialNumberOfElements > 0) {
            numbers.add(scanner.nextInt());
            initialNumberOfElements--;
        }

        System.out.print("Number of Queries: ");
        int numberOfQueries = scanner.nextInt();
        scanner.nextLine();

        while (numberOfQueries > 0) {
            System.out.print("Insert or Delete: ");
            String query = scanner.next();

            if (query.equals("Insert")) {
                System.out.print("Put your input in (index, element format) :");
                numbers.add(scanner.nextInt(), scanner.nextInt());
            }
            if (query.equals("Delete")) {
                System.out.print("Enter the index number you want to delete: ");
                numbers.remove(scanner.nextInt());
            }
            numberOfQueries--;
        }

        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}