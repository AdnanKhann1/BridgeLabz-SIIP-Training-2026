class Product<T> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }
}
