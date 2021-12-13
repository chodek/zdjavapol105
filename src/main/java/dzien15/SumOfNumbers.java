package dzien15;

public class SumOfNumbers {


    public static int sumNumbersInInt(int value) {
        //  12356 % 10 = 6
        //  12356 / 10 = 1235
        //  1235 % 10  = 5
        //  1235 / 10 = 123
        // 123 % 10 = 3
        // 123 / 10 = 12
        // 12 % 10 = 2
        // 1 / 10 = 0 !!!! koniec sumowac wszystkie operacje modulo i dodac to co zostalo w liczbie

        int currentSum = 0;
        while (value > 9) {
            currentSum += value % 10;
            value /= 10;
        }
        currentSum += value;
        return currentSum;

    }

}
