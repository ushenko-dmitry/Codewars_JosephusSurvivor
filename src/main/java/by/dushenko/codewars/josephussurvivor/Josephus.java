package by.dushenko.codewars.josephussurvivor;

public class Josephus {

    public static int josephusSurvivor(int amount, int step) {
        int[] arr = new int[amount];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        while (arr.length > 1) {
            int[] bufArr = new int[arr.length - 1];
            int bufStep = step;
            if (step > arr.length) {
                bufStep -= step / arr.length * arr.length;
                if (bufStep == 0) {
                    bufStep = arr.length;
                }
            }
            int j = 0;
            for (int i = bufStep; i < arr.length; i++) {
                bufArr[j] = arr[i];
                j++;
            }
            for (int i = 0; i < bufStep - 1; i++) {
                bufArr[j] = arr[i];
                j++;
            }
            arr = bufArr;
        }
        return arr[0];
    }
}
