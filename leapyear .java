import java.util.* ;

class leapyear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int year = sc.nextInt();
        if (year%4 ==0){
            if (year%100==0){
                if(year%400==0){
                    System.out.print("yes it is a leap year");
                }else {
                    System.out.print("Not a leap year");
                }
            }else{
                System.out.print("yes it is a leap year");
            }
        }else{
            System.out.print("Not a leap year");
        }

    }


}