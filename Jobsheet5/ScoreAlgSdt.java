public class ScoreAlgSdt {
    private String nameSdt;
    private int scoreAssgment;
    private int scoreQuiz;
    private int scoreMid;
    private int scoreFinal;

    public ScoreAlgSdt(String nameSdt, int scoreAssgment, int scoreQuiz, int scoreMid, int scoreFinal) {
        this.nameSdt = nameSdt;
        this.scoreAssgment = scoreAssgment;
        this.scoreQuiz = scoreQuiz;
        this.scoreMid = scoreMid;
        this.scoreFinal = scoreFinal;
    }

    public double calculateTotalScore() {
        double totalScore = (double) (scoreAssgment * 0.3) + (scoreQuiz * 0.2) + (scoreMid * 0.2) + (scoreFinal * 0.3);
        return totalScore;
    }

    public String getNameSdt() {
        return nameSdt;
    }

    public static void main(String[] args) {
        ScoreAlgSdt[] students = {
                new ScoreAlgSdt("Rani", 80, 85, 80, 85),
                new ScoreAlgSdt("Dani", 70, 75, 70, 75),
                new ScoreAlgSdt("Saraswati", 90, 95, 90, 95)
        };

        for (ScoreAlgSdt student : students) {
            System.out.println(student.getNameSdt() + " - Total Score: " + student.calculateTotalScore());
        }

        double totalScore = 0;
        for (ScoreAlgSdt student : students) {
            totalScore += student.calculateTotalScore();
        }

        double averageScore = totalScore / students.length;
        System.out.println("Average Total Score: " + averageScore);
    }
}
