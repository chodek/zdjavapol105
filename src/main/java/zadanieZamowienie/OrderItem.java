package zadanieZamowienie;

public class OrderItem {
    private String name;
    private int count;
    private double price;

    public OrderItem(String name, int count, double price){
        this.name = name;
        this.count = count;
        this.price = price;
    }


    public double calculateValue(){
        return count * price;
    }

    @Override
    public String toString(){
        return "OrderItem{name=" + name + ",count=" + count + ", price=" + price + "}";
    }

}
