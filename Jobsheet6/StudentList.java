public class StudentList {
    Student list[] = new Student[5];
    int idx;

    // add method
    void add(Student std) {
        if (idx < list.length) {
            list[idx] = std;
            idx++;
        } else {
            System.out.println("The student lis is already full-filled");
        }
    }

    // print method
    void print() {
        for (Student s : list) {
            s.print();
            System.out.println("=======================================================");
        }
    }

    // bubble sort method
    void bubbleSort() {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if (list[j].gpa > list[j - 1].gpa) {
                    // SWAP
                    Student tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;
                }
            }
        }
    }

    // selection sort method
    void selectionSort() {
        for (int i = 0; i < list.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].gpa < list[idxMin].gpa) {
                    idxMin = j;
                }
            }
            // SWAP
            Student tmp = list[idxMin];
            list[idxMin] = list[i];
            list[i] = tmp;
        }
    }

    // insertion sort method
    void insertionSort(boolean asc) {
        for (int i = 1; i < list.length; i++) {
            Student tmp = list[i];
            int j = i;
            if (asc) {
                // Ascending algorithm here
                while (j > 0 && list[j - 1].gpa > tmp.gpa) {
                    list[j] = list[j - 1];
                    j--;
                }
            } else {
                // Descending algorithm here
                while (j > 0 && list[j - 1].gpa < tmp.gpa) {
                    list[j] = list[j - 1];
                    j--;
                }
            }
            list[j] = tmp;
        }
    }

    /*
     * void insertionSort() {
     * for (int i = 0; i < list.length; i++) {
     * Student tmp = list[i];
     * int j = i;
     * while (j > 0 && list[j - 1].gpa > tmp.gpa) {
     * list[j] = list[j - 1];
     * j--;
     * }
     * list[j] = tmp;
     * }
     * }
     */
}
