import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            list.add(num);
        }

        removeDuplicate(list);

        System.out.println("Distinct integers in input order:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> distinctList = new ArrayList<>();

        for (int num : list) {
            if (!distinctList.contains(num)) {
                distinctList.add(num);
            }
        }

        list.clear(); // Clear the original list

        // Copy distinct elements back to the original list
        for (int num : distinctList) {
            list.add(num);
        }
    }
}
