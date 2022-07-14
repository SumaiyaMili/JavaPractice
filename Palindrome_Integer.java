//Algorithm 
//1.extract single digit for number(using reminder)
//2.reverse the number (multyply and sum)
//3.compare the orginal & reversed number 


import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Enter The Number : ");
        Scanner scan = new Scanner(System.in);
        int orginal = scan.nextInt(); //suppose it is 123
        int sum= 0; // sum needed to reverse number
        int remainder;
        int temp=orginal; //put the number in temporary variable to change


        //reverse the number
        while (temp!=0){
            remainder=temp%10; //123 %2 = 3
            sum=sum*10+remainder;//0*10+3 =3 multyply with 10 create a sapce to add next number
            temp=temp/10;
        }
        int reversed=sum;
        System.out.println("Reversed Number Is "+reversed);
        if ( orginal== reversed)
        {
   System.out.println("So It Is A Palindrome Number");
    }
        else
            System.out.println("So It Is Not A Palindrome Number");
    }
}
