public class planeReservation {
    // String.valueOf(int).
    public void printSeats(char[][] seats) {

        for (int row = 0; row < seats.length; row++) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < seats[0].length; col++) {
                System.out.print(seats[row][col] + " ");
            }
            System.out.println();
        }

    }

    public static boolean checkedSeats(char[][] plane) {
        for (int row = 0; row < plane.length; row++) {
            for (int col = 0; col < plane[0].length; col++) {
                if (plane[row][col] != 'X')
                    return false;
            }
        }
        return true;
    }

    public static int rowSeat(String nSeat) {
        char rowChar = nSeat.charAt(0);
        return (int) rowChar - 49;
    }

    public static int colSeat(String nSeat) {
        char colChar = nSeat.charAt(1);
        if (colChar == 'A') {
            return 0;
        } else if (colChar == 'B') {
            return 1;
        } else if (colChar == 'C') {
            return 2;
        } else if (colChar == 'D') {
            return 3;
        } else {
            return -1;
        }
    }


}
