public class MainTicket {
    public static void main(String[] args) {
        TicketService service = new TicketService();
        service.add(new Tickets("Airline A", "Destination B", "Origin A", 100));
        service.add(new Tickets("Airline B", "Destination C", "Origin B", 200));
        service.add(new Tickets("Airline C", "Destination A", "Origin C", 150));

        System.out.println("Tickets before sorting:");
        service.displayAll();

        service.bubbleSort(true);
        System.out.println("\nTickets after bubble sort in ascending order:");
        service.displayAll();

        service.selectionSort(false);
        System.out.println("\nTickets after selection sort in descending order:");
        service.displayAll();
    }
}