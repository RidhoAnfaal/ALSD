import java.util.HashMap;
import java.util.Map;

public class VoteCounter {

    public static void main(String[] args) {
        String[] votes = {
                "Haris", "Dian", "Haris", "Rani", "Bisma", "Haris", "Haris", "Haris", "Haris", "Dian",
                "Haris", "Rani", "Bisma", "Haris", "Haris", "Haris", "Haris", "Dian", "Haris", "Rani",
                "Bisma", "Haris", "Haris", "Haris", "Haris", "Dian", "Haris", "Rani", "Bisma", "Haris",
                "Haris", "Haris", "Haris", "Dian", "Haris", "Rani", "Bisma", "Haris", "Haris", "Haris",
                "Haris", "Dian", "Haris", "Rani", "Bisma", "Haris", "Haris", "Haris", "Haris", "Dian",
                "Haris", "Rani", "Bisma", "Haris", "Haris", "Haris", "Haris", "Dian", "Haris", "Rani",
                "Bisma", "Haris", "Haris", "Haris", "Haris", "Dian", "Haris", "Rani", "Bisma", "Haris",
                "Haris", "Haris", "Haris", "Dian", "Haris", "Rani", "Bisma", "Haris", "Haris", "Haris"
        };

        // Menghitung jumlah suara untuk setiap kandidat
        Map<String, Integer> voteCounts = countVotes(votes);

        // Menentukan kandidat dengan jumlah suara terbanyak
        String majority = getMajority(voteCounts);

        // Menampilkan hasil penghitungan suara
        for (Map.Entry<String, Integer> entry : voteCounts.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("Kandidat dengan jumlah suara terbanyak: " + majority);
    }

    private static Map<String, Integer> countVotes(String[] votes) {
        Map<String, Integer> counts = new HashMap<>();

        for (String vote : votes) {
            counts.put(vote, counts.getOrDefault(vote, 0) + 1);
        }

        return counts;
    }

    private static String getMajority(Map<String, Integer> voteCounts) {
        int maxCount = Integer.MIN_VALUE;
        String majority = "";

        for (Map.Entry<String, Integer> entry : voteCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                majority = entry.getKey();
            }
        }

        return majority;
    }
}