package zadanieZamowienie;

public class Main {

    public static void main(String[] args) {

        OrderItem keyboards = new OrderItem("Logtiech X4 ", 2, 349);
        OrderItem displays = new OrderItem("Acer 2", 3, 1000);
        OrderItem mice = new OrderItem("Microsoft S", 5, 20);

        Order amazonOrder = new Order();
        amazonOrder.addItem(keyboards);
        amazonOrder.addItem(displays);
        amazonOrder.addItem(mice);

        System.out.println(amazonOrder.calculateValue());
        System.out.println(amazonOrder);


    }
}
