package Online Retail Order Management;

public class Main {

    public static void main(String[] args) {

        DeliveredOrder order =
                new DeliveredOrder(
                        101,
                        "24-06-2026",
                        "TRK12345",
                        "27-06-2026"
                );

        OrderUtility utility = new OrderUtility();

        utility.displayOrder(order);
    }
}