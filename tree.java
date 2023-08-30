import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Height of Binary Tree: ");
        int n = sc.nextInt();
        
        List<List<Integer>> tree = new ArrayList<>();
        List<List<Integer>> leftTree = new ArrayList<>();
        List<List<Integer>> rightTree = new ArrayList<>();
        boolean check = true;

        for (int i = 0; i < n; i++) {
            int noOfInputs = (int) Math.pow(2, i);
            List<Integer> level = new ArrayList<>();
            
            System.out.printf("Enter %d node(s) data for level %d: ", noOfInputs, (i + 1));
            for (int j = 0; j < noOfInputs; j++) {
                int val = sc.nextInt();
                level.add(val);
            }

            tree.add(level);
            if (i > 0) {
                for (int j = 0; j < noOfInputs; j++) {
                    if (j < noOfInputs / 2) {
                        int val = sc.nextInt();
                        leftTree.get(i - 1).add(val);
                    } else {
                        int val = sc.nextInt();
                        rightTree.get(i - 1).add(val);
                    }
                }
            }

            if (i > 0 && !leftTree.get(i - 1).equals(rightTree.get(i - 1))) {
                check = false;
            }
        }

        System.out.println("Tree: " + tree);
        System.out.println("Left Tree: " + leftTree);
        System.out.println("Right Tree: " + rightTree);
        System.out.println("Is the tree symmetric? " + check);
        
        sc.close();
    }
}

