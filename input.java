import java.util.Arrays;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array of primitives
       // int[] arr = new int[5];
        //arr[0]=23;
        //arr[1]=43;
        //arr[2]=80;
        //System.out.println(arr[1]);
        //System.out.println(arr[4]);
        //input using for loopss
       // for (int i = 0; i < arr.length; i++) {
         //   arr[i] = in.nextInt();
          //  System.out.println(Arrays.toString(arr));
            //array of objects
            String[] str= new String[4];
            for (int j = 0; j < str.length; j++) {
                str[j]=in.next();


            }
            System.out.println(Arrays.toString(str));

            
        }


    }

