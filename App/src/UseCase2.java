/**
 * ========================================================
 * MAIN CLASS - UseCase2
 * ========================================================
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Description:
 * This class demonstrates room initialization
 * using domain models before introducing
 * centralized inventory management.
 *
 * Availability is represented using
 * simple variables to highlight limitations.
 *
 * @version 2.1
 */

public class UseCase2{

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // --- Create room objects ---
        Room single = new SingleRoom();
        Room doublRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // --- Static availability variables ---
        boolean isSingleAvailable = true;
        boolean isDoubleAvailable = true;
        boolean isSuiteAvailable  = false;

        // --- Display details ---
        System.out.println("========================================");
        System.out.println("   Book My Stay App - Room Availability");
        System.out.println("========================================");

        System.out.println("\n[Single Room]");
        single.displayRoomDetails();
        System.out.println("  Available    : " + isSingleAvailable);

        System.out.println("\n[Double Room]");
        doublRoom.displayRoomDetails();
        System.out.println("  Available    : " + isDoubleAvailable);

        System.out.println("\n[Suite Room]");
        suite.displayRoomDetails();
        System.out.println("  Available    : " + isSuiteAvailable);

        System.out.println("\n========================================");
        System.out.println("  System initialized successfully.");
        System.out.println("========================================");
    }
}
