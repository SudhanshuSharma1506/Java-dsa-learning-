public class ceiling {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,6,8};
        int target =-13;
        int ans = ceiling(arr, target);
        System.out.println(ans);

    }
    static int ceiling(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }

        }
        return start;
    }
}

