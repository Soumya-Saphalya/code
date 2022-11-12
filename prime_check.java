import java .util.*;
class Main {
    public static void main(String args[]) {
        // TO write a program that will take input a number and check it prime or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime :");
        int number = sc. nextInt();
        int divisor = 2 ;
        while(divisor<number){
            if(number%divisor==0){
                System.out.print("The number is not prime");
                break;
            }else{
                divisor++;
            }
        }
        if(divisor==number){
            System.out.print("the number is prime");
        }


    }
}



