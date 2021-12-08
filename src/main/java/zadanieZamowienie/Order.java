package zadanieZamowienie;

public class Order {

    private OrderItem[] orderItems;
    private int maxSize;

    private int currentSize = 0; // ile elementow tablicy w danej chwili jest zajetych

    public Order(int maxSize){
        this.maxSize = maxSize;
        this.orderItems = new OrderItem[maxSize];
    }

    public Order(){
        this.maxSize = 10;
        this.orderItems = new OrderItem[maxSize];
    }

    public void addItem(OrderItem itemToAdd){
        if(currentSize < maxSize){
            orderItems[currentSize++] = itemToAdd; // zamiast nastepnej linii z: currentSize += 1;
        } else {
            System.out.println("Koszyk jest pelny, nie moge dodac pozycji!");
        }
    }

    public double calculateValue(){
        double currentSum = 0;
        for(int i = 0; i < currentSize; i++){
            currentSum += orderItems[i].calculateValue();
        }
        return currentSum;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order{\n");
        for(int i = 0; i < currentSize; i++){
            sb.append(i + 1 + ". ");
            sb.append(orderItems[i].toString() + "\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
