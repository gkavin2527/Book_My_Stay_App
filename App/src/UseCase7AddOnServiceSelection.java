/**
 * ========================================================
 * MAIN CLASS - UseCase7AddOnServiceSelection
 * ========================================================
 *
 * Use Case 7: Add-On Service Selection
 *
 * Description:
 * This class demonstrates how optional
 * services can be attached to a confirmed
 * booking.
 *
 * Services are added after room allocation
 * and do not affect inventory.
 *
 * @version 7.0
 */
public class UseCase7AddOnServiceSelection {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Display application header
        System.out.println("Add-On Service Selection");

        // Initialize service manager
        AddOnServiceManager serviceManager = new AddOnServiceManager();

        // Create add-on services
        AddOnService breakfast = new AddOnService("Breakfast", 15.0);
        AddOnService spa       = new AddOnService("Spa", 50.0);
        AddOnService pickup    = new AddOnService("Airport Pickup", 30.0);

        // Attach services to reservations
        serviceManager.addService("Single-1", breakfast);
        serviceManager.addService("Single-1", spa);
        serviceManager.addService("Suite-1",  pickup);

        // Display selected services and total costs
        System.out.println("Services for Single-1: Breakfast, Spa");
        System.out.println("Total Add-On Cost for Single-1: "
                + serviceManager.calculateTotalServiceCost("Single-1"));

        System.out.println("Services for Suite-1: Airport Pickup");
        System.out.println("Total Add-On Cost for Suite-1: "
                + serviceManager.calculateTotalServiceCost("Suite-1"));
    }
}