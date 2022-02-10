import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    // CONSTRUCTORS
    public Order() {
        this.name = "Guest"; //Will default to this name of "Guest" when a name is not provided.
        this.ready = false;
    }

    // This constructor is "overloaded"
    public Order(String name) {
        this.name = name;
        this.ready = false;
    }

    // GETTERS AND SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

// METHODS

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if(this.ready = true) {
            return("Your order is ready.");
        } else {
            return("Your order will be ready soon.");
        }
    }

    public double getOrderTotal() {
        double sum = 0.0;
        // for(int i = 0; i < total.length; i++) {
        //     sum = sum + total[i];
        // }
        for(Item eachItem : this.items) {
            sum += eachItem.getPrice();
        }
        return sum;
    }

    public void display() {
        System.out.printf("Customer Name: %s", this.name);
            for(Item eachItem : this.items) {
                System.out.println(eachItem.getName() + eachItem.getPrice());
            }
        // System.out.printf("%s" + " - " + "%s", this.price);
        System.out.printf("Total: %s", this.getOrderTotal());
    }
}