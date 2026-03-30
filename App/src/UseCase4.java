import java.util.HashMap;
import java.util.Map;

/**
 * ========================================================
 * MAIN CLASS - UseCase4
 * ========================================================
 *
 * Use Case 4: Room Search & Availability Check
 *
 * Description:
 * This class demonstrates how guests
 * can view available rooms without
 * modifying inventory data.
 *
 * The system enforces read-only access
 * by design and usage discipline.
 *
 * @version 4.0
 */
public class UseCase4 {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // --- Create room domain objects ---
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom  = new SuiteRoom();

        // --- Initialize centralized inventory ---
        RoomInventory inventory = new RoomInventory();

        // --- Simulate Suite fully booked ---
        inventory.updateAvailability("Suite", 0);

        // --- Create search service ---
        RoomSearchService searchService = new RoomSearchService();

        // --- Header ---
        System.out.println("========================================");
        System.out.println("   Book My Stay - Room Search");
        System.out.println("========================================");

        // --- Perform read-only search ---
        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );

        // --- Confirm state unchanged ---
        System.out.println("\n--- Inventory After Search (Unchanged) ---");
        for (Map.Entry<String, Integer> entry :
                inventory.getRoomAvailability().entrySet()) {
            System.out.println("  " + entry.getKey()
                    + " -> " + entry.getValue() + " room(s)");
        }

        System.out.println("\n========================================");
        System.out.println("  Search completed. No state modified.");
        System.out.println("========================================");
    }
}