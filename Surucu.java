import java.util.ArrayList;



// Driver class to test the method
class Surucu {
    public static void main(String[] args) {
        LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<>();
        Position<Integer> root = tree.addRoot(10);
        Position<Integer> left1 = tree.addLeft(root, 5);
        Position<Integer> right1 = tree.addRight(root, 15);
        Position<Integer> left2 = tree.addLeft(left1, -5);
        Position<Integer> right2 = tree.addRight(left1, 7);

        Position<Integer> left3 = tree.addLeft(right1, 12);
        Position<Integer> right3 = tree.addRight(right1, 20);

        Position<Integer> left4 = tree.addLeft(right3, 20);


        System.out.println("Binary Tree Structure:");
        for (Position p: tree.positions() ) {
            System.out.println(p.getElement());
        }
        System.out.println("----------------");
        for (Position p: tree.breadthfirst() ) {
            System.out.println(p.getElement());
        }


        int descendantsCount = tree.countDescendants(root);
        System.out.println("Descendants Count of Root: " + descendantsCount);

        int target = 7;
        boolean containsTarget = tree.contains(target);
        System.out.println("Tree Contains " + target + ": " + containsTarget);

        int min = tree.minimum();
        System.out.println("Minimum in the tree: "+ min);

        int summation = tree.sum();
        System.out.println("Sum of numbers in the tree: "+ summation);
    }
}

