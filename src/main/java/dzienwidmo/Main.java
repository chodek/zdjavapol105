package dzienwidmo;

public class Main {

    public static void main(String[] args) {

        int[] table = new int[]{13,3425,234,2,234342,34};
        IntArrayHelper helper = new IntArrayHelper(table);

        System.out.println(helper.findMaxValue());

        //helper.exists(5);

    }

}
