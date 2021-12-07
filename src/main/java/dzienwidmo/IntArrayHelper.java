package dzienwidmo;

public class IntArrayHelper {
    int[] tableOfInts;

    public IntArrayHelper(int[] tableOfInts) {
        this.tableOfInts = tableOfInts;
    }


    public int findMaxValue() {
        if (tableOfInts != null && tableOfInts.length > 0) {
            int currentMax = tableOfInts[0];
            for(int i = 0; i < tableOfInts.length ; i++){
                if (tableOfInts[i] > currentMax){
                    currentMax = tableOfInts[i];
                }
            }
            return currentMax;
        }
        return Integer.MIN_VALUE;
    }



}
