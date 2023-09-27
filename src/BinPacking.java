import java.util.ArrayList;
import java.util.Scanner;

public class BinPacking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of objects: ");
        int totalObjects = input.nextInt();

        ArrayList<Integer> objects = new ArrayList<>();
        ArrayList<ArrayList<Integer>> containers = new ArrayList<>();

        // Initialize the first container
        containers.add(new ArrayList<>());

        System.out.println("Enter the weight of each object:");

        for (int i = 0; i < totalObjects; i++) {
            int weight = input.nextInt();

            boolean packed = false;

            for (ArrayList<Integer> container : containers) {
                if (getTotalWeight(container) + weight <= 10) {
                    container.add(weight);
                    packed = true;
                    break;
                }
            }

            if (!packed) {
                ArrayList<Integer> newContainer = new ArrayList<>();
                newContainer.add(weight);
                containers.add(newContainer);
            }
        }

        // Display the results
        System.out.println("Total number of containers needed: " + containers.size());

        for (int i = 0; i < containers.size(); i++) {
            System.out.print("Container " + (i + 1) + ": ");
            for (int weight : containers.get(i)) {
                System.out.print(weight + " ");
            }
            System.out.println();
        }
    }

    public static int getTotalWeight(ArrayList<Integer> container) {
        int totalWeight = 0;
        for (int weight : container) {
            totalWeight += weight;
        }
        return totalWeight;
    }
}
