import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        Item newItem1 = new Item("Coffee", 1.75);
        Item newItem2 = new Item("Latte", 3.25);

        // 2 orders for unspecified guest:
        Order newOrder1 = new Order();
        Order newOrder2 = new Order();

        // 3 orders using overloaded constructor:
        Order newOrder3 = new Order("Eric");
        Order newOrder4 = new Order("Matt");
        Order newOrder5 = new Order("Deana");

        // Implementing addItem method from Order class:
        newOrder1.addItem(newItem1);
        newOrder1.addItem(newItem2);

        newOrder2.addItem(newItem1);
        newOrder2.addItem(newItem2);

        newOrder3.addItem(newItem1);
        newOrder3.addItem(newItem2);

        newOrder4.addItem(newItem1);
        newOrder4.addItem(newItem2);

        newOrder5.addItem(newItem1);
        newOrder5.addItem(newItem2);

        // Testing the getStatusMessage method:
        System.out.println(newOrder1.getStatusMessage());

        // Testing the getOrderTotal method:
        System.out.println(newOrder1.getOrderTotal());

        // Implementing the display method:
        newOrder1.display();
    }
}