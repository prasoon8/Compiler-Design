class SyntaxTreeNode {
    String value;
    SyntaxTreeNode left, right;

    SyntaxTreeNode(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class SyntaxTreeGenerator {
    public static void main(String[] args) {
        // Constructing the syntax tree for the expression: 2 * (3 + 4)
        SyntaxTreeNode root = new SyntaxTreeNode("*");
        root.left = new SyntaxTreeNode("2");
        root.right = new SyntaxTreeNode("+");
        root.right.left = new SyntaxTreeNode("3");
        root.right.right = new SyntaxTreeNode("4");

        // Printing the syntax tree
        printSyntaxTree(root, "", true);
    }

    public static void printSyntaxTree(SyntaxTreeNode node, String prefix, boolean isTail) {
        if (node == null)
            return;

        // Print the current node
        System.out.println(prefix + (isTail ? "|-- " : "\\-- ") + node.value);

        // Recursively print left and right subtrees
        if (node.left != null || node.right != null) {
            printSyntaxTree(node.left, prefix + (isTail ? "    " : "|   "), false);
            printSyntaxTree(node.right, prefix + (isTail ? "    " : "|   "), true);
        }
    }
}
