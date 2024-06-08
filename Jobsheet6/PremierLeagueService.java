public class PremierLeagueService {
    PremierLeague[] leagues = new PremierLeague[20];
    int idx = 0;

    void add(PremierLeague p) {
        if (idx < leagues.length) {
            leagues[idx] = p;
            idx++;
        } else {
            System.out.println("The league list is already full-filled");
        }
    }

    void displayAll() {
        for (PremierLeague p : leagues) {
            if (p != null) {
                System.out.println(
                        "Team: " + p.team + ", Play: " + p.play + ", Goal: " + p.goal + ", Points: " + p.points);
            }
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            PremierLeague temp = leagues[i];
            int j = i;
            while (j > 0 && leagues[j - 1].points > temp.points) {
                leagues[j] = leagues[j - 1];
                j--;
            }
            leagues[j] = temp;
        }
    }
}