public class App {
    public static void main(String[] args) throws Exception {

        // Conditional Structure
        boolean classsuspended = true;

        if (classsuspended) {
            System.out.println("Play games all day and sleep");
        } else {
            // Step 1
            ridefirstJeep();

            // Step 2
            ridesecondJeep();

            // Step 3
            walk();
        }

    }

    static void ridefirstJeep() {
        System.out.println("Ride jeep along San Joaquinn Street");
        System.out.println("Exit jeep along Kalentong" + "\n");
    }

    static void ridesecondJeep() {
        System.out.println("Ride jeep along Kalentong");
        System.out.println("Exit jeep at Legarda Station" + "\n");
    }

    static void walk() {
        System.out.println("Walk for 2 mins");
    }
}
