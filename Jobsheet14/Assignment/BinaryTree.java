package Assignment;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void add(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private Node deleteRecursive(Node current, int data) {
        if (current == null) {
            return null;
        }

        if (data < current.data) {
            current.left = deleteRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = deleteRecursive(current.right, data);
        } else {
            // Case 1: No children
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: One child
            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }

            // Case 3: Two children
            // Find the inorder successor (smallest in the right subtree)
            Node successor = findMin(current.right);
            // Copy the successor's data to the current node
            current.data = successor.data;
            // Delete the successor
            current.right = deleteRecursive(current.right, successor.data);
        }

        return current;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void find(int data) {
        Node node = findRecursive(root, data);
        if (node != null) {
            System.out.println("Data " + data + " found in the tree.");
        } else {
            System.out.println("Data " + data + " not found in the tree.");
        }
    }

    private Node findRecursive(Node current, int data) {
        if (current == null || current.data == data) {
            return current;
        }

        if (data < current.data) {
            return findRecursive(current.left, data);
        } else {
            return findRecursive(current.right, data);
        }
    }

    public void traverseInOrder() {
        traverseInOrderRecursive(root);
        System.out.println();
    }

    private void traverseInOrderRecursive(Node node) {
        if (node != null) {
            traverseInOrderRecursive(node.left);
            System.out.print(node.data + " ");
            traverseInOrderRecursive(node.right);
        }
    }

    public void traversePreOrder() {
        traversePreOrderRecursive(root);
        System.out.println();
    }

    private void traversePreOrderRecursive(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrderRecursive(node.left);
            traversePreOrderRecursive(node.right);
        }
    }

    public void traversePostOrder() {
        traversePostOrderRecursive(root);
        System.out.println();
    }

    private void traversePostOrderRecursive(Node node) {
        if (node != null) {
            traversePostOrderRecursive(node.left);
            traversePostOrderRecursive(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void findSmallestAndLargest() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        int smallest = root.data;
        int largest = root.data;

        findSmallestAndLargestRecursive(root, smallest, largest);

        System.out.println("Smallest value: " + smallest);
        System.out.println("Largest value: " + largest);
    }

    private void findSmallestAndLargestRecursive(Node node, int smallest, int largest) {
        if (node != null) {
            if (node.data < smallest) {
                smallest = node.data;
            }
            if (node.data > largest) {
                largest = node.data;
            }

            findSmallestAndLargestRecursive(node.left, smallest, largest);
            findSmallestAndLargestRecursive(node.right, smallest, largest);
        }
    }

    public void displayLeafData() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        displayLeafDataRecursive(root);
    }

    private void displayLeafDataRecursive(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }

            displayLeafDataRecursive(node.left);
            displayLeafDataRecursive(node.right);
        }
    }

    public int countLeaves() {
        return countLeavesRecursive(root);
    }

    private int countLeavesRecursive(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        return countLeavesRecursive(node.left) + countLeavesRecursive(node.right);
    }
}
