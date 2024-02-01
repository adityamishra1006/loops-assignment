import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to find the Multiplication Table : ");
        int n = sc.nextInt();

        if (n<=0) {
            System.out.println("Enter number greater than 0. ");
        }else{
            for(int i = 1; i<=10; i++){
                System.out.println(n + "*"+ i +"="+(n*i));
            }
        }
    }
}
