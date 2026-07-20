abstract class WarehouseItem {
    abstract String getName();
}

class Electronics extends WarehouseItem {
    public String getName() { return "Electronics Item"; }
}

class Storage<T extends WarehouseItem> {
    private T item;

    public void store(T item) { this.item = item; }
    public T retrieve() { return item; }
}
