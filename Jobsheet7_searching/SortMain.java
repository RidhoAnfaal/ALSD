public class SortMain {
    public static void main(String[] args) {
        int[] data = { 10, 40, 30, 50, 70, 20, 100, 90 };

        MergeSorting sorter = new MergeSorting();

        System.out.println("Initial Data:");
        sorter.printArray(data);

        sorter.mergeSort(data);

        System.out.println("Sorted Data:");
        sorter.printArray(data);
    }
}
