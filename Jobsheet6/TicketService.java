public class TicketService {
    Tickets[] tickets = new Tickets[50];
    int idx = 0;

    void add(Tickets t) {
        if (idx < tickets.length) {
            tickets[idx] = t;
            idx++;
        } else {
            System.out.println("The ticket list is already full-filled");
        }
    }

    void displayAll() {
        for (Tickets t : tickets) {
            if (t != null) {
                System.out.println("Airlines: " + t.airlines + ", Destination: " + t.dest + ", Origin: " + t.origin
                        + ", Price: " + t.price);
            }
        }
    }

    void bubbleSort(boolean asc) {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if ((asc && tickets[j].price > tickets[j + 1].price)
                        || (!asc && tickets[j].price < tickets[j + 1].price)) {
                    // SWAP
                    Tickets temp = tickets[j];
                    tickets[j] = tickets[j + 1];
                    tickets[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort(boolean asc) {
        for (int i = 0; i < idx - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if ((asc && tickets[j].price < tickets[minIdx].price)
                        || (!asc && tickets[j].price > tickets[minIdx].price)) {
                    minIdx = j;
                }
            }
            // SWAP
            Tickets temp = tickets[minIdx];
            tickets[minIdx] = tickets[i];
            tickets[i] = temp;
        }
    }
}