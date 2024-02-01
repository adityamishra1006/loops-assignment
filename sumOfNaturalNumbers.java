import java.util.Scanner;

public class sumOfNaturalNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to find the sum : ");
        int n = sc.nextInt();

        int sum = 0;
        if (n<=0) {
            System.out.println("Number must be greater than 0");
        }else{
            
        for(int i = 1; i<=n; i++){
            sum +=i;
        }
        System.out.println(sum);
        }
    }
}