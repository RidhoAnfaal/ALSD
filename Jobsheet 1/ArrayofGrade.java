public class ArrayofGrade {
    public static void main(String[] args) {
        // input score
        // create scanner, declare n instantiate array, loop over array to get input
        int[] courseScore = { 75, 85, 70, 85, 62, 62, 85 };
        // convert score
        String[] letterScore = new String[courseScore.length];
        for (int score : courseScore) {

        }
    }

    static String letterConversion(double finalGrade) {
        String result = "";
        if (finalGrade > 80 && finalGrade <= 100) {
            result = "A";
        } else if (finalGrade > 73 && finalGrade <= 80) {
            result = "B+";
        } else if (finalGrade > 73 && finalGrade <= 80) {
            result = "B";
        } else if (finalGrade > 73 && finalGrade <= 80) {
            result = "C+";
        } else if (finalGrade > 73 && finalGrade <= 80) {
            result = "C";
        } else if (finalGrade > 73 && finalGrade <= 80) {
            result = "D";
        } else if (finalGrade > 73 && finalGrade <= 80) {
            result = "E";
        }
    }
}