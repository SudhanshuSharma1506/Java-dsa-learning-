public class LinearSearch {
    public static void main(String[] args) {


        int[] nums = {23, 51, 32, 4, 76};
        int target = 4;
        int answer = linearSearch(nums, target);
        System.out.println(answer);

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }


        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;

            }
        }


        return -1;


    }
}