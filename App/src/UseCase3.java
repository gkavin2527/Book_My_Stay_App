import java.util.HashMap;
import java.util.Map;

/**
 * ========================================================
 * MAIN CLASS - UseCase3
 * ========================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class demonstrates how room availability
 * is managed using a centralized inventory.
 *
 * Room objects are used to retrieve pricing
 * and room characteristics.
 *
 * No booking or search logic is introduced here.
 *
 * @version 3.1
 */
public class UseCase3 {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // --- Create room type objects ---
        Room single   = new SingleRoom();
        Room doubleRm = new DoubleRoom();
        Room suite    = new SuiteRoom();

        // --- Initialize centralized inventory ---
        RoomInventory inventory = new RoomInventory();

        // --- Display initial inventory ---
        System.out.println("========================================");
        System.out.println("   Book My Stay - Room Inventory");
        System.out.println("========================================");

        System.out.println("\n--- Initial Availability ---");
        displayInventory(inventory);

        // --- Display room details alongside inventory ---
        System.out.println("\n--- Room Details ---");

        System.out.println("\n[Single Room]");
        single.displayRoomDetails();
        System.out.println("  Available : "
                + inventory.getRoomAvailability().get("Single"));

        System.out.println("\n[Double Room]");
        doubleRm.displayRoomDetails();
        System.out.println("  Available : "
                + inventory.getRoomAvailability().get("Double"));

        System.out.println("\n[Suite Room]");
        suite.displayRoomDetails();
        System.out.println("  Available : "
                + inventory.getRoomAvailability().get("Suite"));

        // --- Simulate an availability update ---
        System.out.println("\n--- Updating Suite availability to 0 ---");
        inventory.updateAvailability("Suite", 0);
        displayInventory(inventory);

        System.out.println("\n========================================");
        System.out.println("  Inventory initialized successfully.");
        System.out.println("========================================");
    }

    /**
     * Prints the full inventory map to console.
     *
     * @param inventory the RoomInventory instance
     */
    private static void displayInventory(RoomInventory inventory) {
        for (Map.Entry<String, Integer> entry
                : inventory.getRoomAvailability().entrySet()) {
            System.out.println("  " + entry.getKey()
                    + " -> " + entry.getValue() + " room(s) available");
        }
    }
}