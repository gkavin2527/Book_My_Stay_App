public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        String filePath = "inventory.txt";

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService service = new FilePersistenceService();

        // STEP 1: LOAD (simulate system restart)
        service.loadInventory(inventory, filePath);

        inventory.display();

        // STEP 2: Modify inventory (simulate bookings)
        inventory.setRoom("Deluxe", 5);
        inventory.setRoom("Suite", 2);
        inventory.setRoom("Standard", 10);

        System.out.println("\nAfter Updates:");
        inventory.display();

        // STEP 3: SAVE before shutdown
        service.saveInventory(inventory, filePath);
    }
}