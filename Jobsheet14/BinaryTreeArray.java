public class BinaryTreeArray {
    int[] arr;
    int size;

    public BinaryTreeArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void add(int data) {
        if (size == arr.length) {
            System.out.println("Array is full.");
            return;
        }

        arr[size++] = data;
    }

    public void traversePreOrder() {
        System.out.println("Pre-Order Traversal:");
        traversePreOrderRecursive(0);
        System.out.println();
    }

    private void traversePreOrderRecursive(int index) {
        if (index >= size) {
            return;
        }

        System.out.print(arr[index] + " ");
        traversePreOrderRecursive(2 * index + 1); // Left child
        traversePreOrderRecursive(2 * index + 2); // Right child
    }

    public void traversePostOrder() {
        System.out.println("Post-Order Traversal:");
        traversePostOrderRecursive(0);
        System.out.println();
    }

    private void traversePostOrderRecursive(int index) {
        if (index >= size) {
            return;
        }

        traversePostOrderRecursive(2 * index + 1); // Left child
        traversePostOrderRecursive(2 * index + 2); // Right child
        System.out.print(arr[index] + " ");
    }
}
