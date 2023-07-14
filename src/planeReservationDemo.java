import java.util.Scanner;
public class planeReservationDemo {
    public static void main(String[] args) {
        planeReservation reserve = new planeReservation();
        Scanner input = new Scanner(System.in);
        char[][] A = {{'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'},
                {'A', 'B', 'C', 'D'}};

        System.out.println("Seats available: ");
        while (!reserve.checkedSeats(A)) {
            reserve.printSeats(A);
            System.out.println("Please enter the seat number (1D, or 2C) or Q to exit: ");
            String seat = input.nextLine().toUpperCase();

            if (seat.equalsIgnoreCase( "Q")) {

                System.exit(0);
            } else {

                int row = reserve.rowSeat(seat);
                int col = reserve.colSeat(seat);

                if (A[row][col] == ('X')) {
                    System.out.println("Sorry, the chosen seat is occupied.");
                } else {
                    A[row][col] = 'X';
                }
            }
        }
    }
}