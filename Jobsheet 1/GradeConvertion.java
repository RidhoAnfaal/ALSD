public class GradeConvertion {
    public static void main(String[] args) {
        //call final grade
        double finalGrade = finalGradeCalc(70, 86, 90, 65);
        String letterGrade = letterConversion(finalGrade);
    

    //final grade calculation
    static double finalGradeCalc(double assignment, double quiz, double mid, double fin) {
        double result = 0;
        result = 0.2 * assignment + 0.2 * quiz + 0.3 * mid + 0.4 * fin;
        return result;
    }

    // convert to letter
    static String letterConversion(double finalGrade) {
        String result = "";

        if (finalGrade >= 80) {
            result = "A";
        } else if (finalGrade >= 73) {
            result = "B+";
        } else if (finalGrade >= 65) {
            result = "B";
        } else if (finalGrade >= 60) {
            result = "C+";
        } else if (finalGrade >= 50) {
            result = "C";
        } else if (finalGrade >= 39) {
            result = "D";
        } else {
            result = "E";
        }
        return result;
    }

    // decide the final state
    static boolean finalDecission(String letter) {
        if (letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("B+") || letter.equalsIgnoreCase("B")
                || letter.equalsIgnoreCase("C+") || letter.equalsIgnoreCase("C") || letter.equalsIgnoreCase("D")
                || letter.equalsIgnoreCase("E")) {

        }
    }

}