import java.sql.SQLOutput;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        while (true){
            System.out.println("enter the operator");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if(op =='+'|| op =='-'|| op=='*'|| op=='/'){
                System.out.print("Enter two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();
                if(op == '+'){
                    ans= num1 + num2;

                }
                if (op=='-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1*num2;
                }
                if (op=='/'){
                    ans = num1/num2;

                }
                else if (op == 'x' || op == 'x') {
                    break;
                }





            }
            System.out.println(ans);
        }



    }

}
