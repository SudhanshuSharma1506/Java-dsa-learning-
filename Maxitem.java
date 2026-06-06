public class Maxitem {
    public static void main(String[] args) {

        int[] arr = { 32,65,3,47,96,89};
        System.out.println(max(arr));

    }

    private static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }
        return maxVal;

    }
}
