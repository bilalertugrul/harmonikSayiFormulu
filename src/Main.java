import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double number, total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextDouble();

        for(double i=1 ; i <= number ; i++){
            total += 1/i;
        }
        System.out.println(number + " Sayısının Harmonik Seri Toplamı : " + total);
    }
}