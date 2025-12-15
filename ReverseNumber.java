import java.util.Scanner;

class ReverseNumber{
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        
        int digit;
        int result=0;
        
        while(input != 0){
            digit = input%10;
            result = result*10 + digit;
            input/=10;
        }
        System.out.println("Reversed Number: "+result);
    }
}