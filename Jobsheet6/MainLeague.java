public class MainLeague {
    public static void main(String[] args) {
        PremierLeagueService service = new PremierLeagueService();
        service.add(new PremierLeague("Liverpool", 29, 45, 82));
        service.add(new PremierLeague("Manchester City", 27, 39, 57));
        service.add(new PremierLeague("Leicester City", 28, 26, 50));

        System.out.println("Leagues before sorting:");
        service.displayAll();

        service.insertionSort();
        System.out.println("\nLeagues after insertion sort in ascending order:");
        service.displayAll();
    }
}