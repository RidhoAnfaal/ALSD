import java.util.ArrayList;
import java.util.List;

public class SearchStudent {
    Students[] listStd = new Students[5];
    int idx;

    public SearchStudent(int numStudents) {
        listStd = new Students[numStudents];
    }

    public void add(Students std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    public void dislay() {
        for (Students students : listStd) {
            students.dislay();
            System.out.println("------------------------------------------------");
        }
    }

    public int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].nim == search) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found");
        }
    }

    public void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t : " + x);
            System.out.println("Name \t : " + listStd[pos].name);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("GPA \t : " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }

    /*
     * public int findBinarySearch(int search, int left, int right) {
     * int mid;
     * if (right >= left) {
     * mid = (left + right) / 2;
     * if (search == listStd[mid].nim) {
     * return (mid);
     * } else if (listStd[mid].nim > search) {
     * return findBinarySearch(search, left, mid - 1);
     * } else {
     * return findBinarySearch(search, mid + 1, right);
     * }
     * }
     * return -1;
     * }
     */

    public int findBinarySearch(int search, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (search == listStd[mid].nim) {
                return (mid);
            } else if (listStd[mid].nim < search) {
                return findBinarySearch(search, left, mid - 1);
            } else {
                return findBinarySearch(search, mid + 1, right);
            }
        }
        return -1;
    }

    public void showPositionName(String x, int pos) {
        if (pos != -1) {
            System.out.println("Name : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Name : " + x + " is not found");
        }
    }

    public void showDataName(String x, int pos) {
        if (pos != -1) {
            System.out.println("Name \t : " + x);
            System.out.println("NIM \t : " + listStd[pos].nim);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("GPA \t : " + listStd[pos].gpa);
        } else {
            System.out.println("Name " + x + " is not found");
        }
    }

    public int findSeqSearch(String search) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].name.equalsIgnoreCase(search)) {
                positions.add(i);
            }
        }
        if (positions.isEmpty()) {
            System.out.println("Name: " + search + " is not found");
            return -1;
        } else {
            System.out.println("Name: " + search + " is found at positions: " + positions);
            return positions.get(0);
        }
    }

    public int findSeqSearchDiscrepancy(String search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].name.replaceAll("\\s+", "").equalsIgnoreCase(search.replaceAll("\\s+", ""))) {
                position = i;
                break;
            }
        }
        return position;
    }

}