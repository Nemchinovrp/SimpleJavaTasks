public class MinMaxValue {


    public static int maxValue() {
        int[] array = {2, 4, 6, 7, 1, 4, 9, 5, 7};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static int minValue() {
        int[] array = {2, 4, 6, 7, 1, 4, 9, 5, 7};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
