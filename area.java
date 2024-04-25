import java.util.Scanner;
public class area {

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a year");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int num4=sc.nextInt();
        int num5=sc.nextInt();
        if(num1>num2&&num1>num3&&num1>num4&&num1>num5){
            if(num1>num3){
                if(num1>num4){
                    if(num1>num5){
                        System.out.println(num1 + "is largest");
                    }
                }
            }
        }
        else{
            System.out.println("natural number");
        }
    }
}