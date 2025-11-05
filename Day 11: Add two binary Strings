// add two binary strings 
import java.util.Scanner;

public class addbinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();


        StringBuilder result = new StringBuilder();
        int i = a.length() - 1; // pointer for string 'a' (start at LSB)
        int j = b.length() - 1; // pointer for string 'b' (start at LSB)
        int carry = 0;
        while (i >= 0 || j >= 0|| carry==1) {     // loop will till the carry or any digit remains left
            int x = (i >= 0) ? a.charAt(i) - '0' : 0;    // convert char to int by subtracting 0
            int y = (j >= 0) ? b.charAt(j) - '0' : 0;
            int sum=x+y+carry;
            result.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        String sum=result.reverse().toString();
        System.out.println(sum);

    }

}
