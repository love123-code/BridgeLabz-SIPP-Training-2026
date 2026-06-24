package Online Retail Order Management;

public class OrderUtility {

    public void displayOrder(DeliveredOrder order) {

        System.out.println("Order ID : " + order.orderId);
        System.out.println("Order Date : " + order.orderDate);
        System.out.println("Tracking Number : " + order.trackingNumber);
        System.out.println("Delivery Date : " + order.getDeliveryDate());
        System.out.println("Status : " + order.getOrderStatus());
    }
}