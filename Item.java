public class Item {
    private String name;
    private double price;

// CONSTRUCTOR
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

// GETTERS AND SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}