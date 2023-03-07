import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int VND=23000 ;
        System.out.println("Nhap USD");
        int USD=scanner.nextInt();
        int total =USD*VND;
        System.out.println(USD+"USD" +"=" +total+"VND");


    }
}