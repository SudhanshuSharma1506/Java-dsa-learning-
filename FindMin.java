public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,29,19,15,13,4,1,14};
        System.out.println(minimum_num(arr));

    }
    static int minimum_num(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans ){
                ans = arr[i];

            }
        }
        return ans;
    }
}
