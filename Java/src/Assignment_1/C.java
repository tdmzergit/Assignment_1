package Assignment_1;

import java.util.Scanner;

public class C {

    public static void main(String[] args) {

	    int a, b, c;
	    Scanner input_label = new Scanner(System.in);

        // მეთოდი 1

	    System.out.println("შეიყვანე a : ");
	    a = input_label.nextInt();

        System.out.println("შეიყვანე b : ");
        b = input_label.nextInt();

        System.out.println("შეიყვანე c : ");
        c = input_label.nextInt();

        // მეთოდი 2

        int lastDigit = a % 10;
        System.out.println("a ცვლადის ბოლო ციფრი არის " + lastDigit);

        // მეთოდი 3

        int firstDigit = b;
        while (firstDigit > 10) {
            firstDigit /= 10;
        }
        System.out.println("b ცვლადის პირველი ციფრია " + firstDigit);

        // მეთოდი 4

        int x, y, sum = 0;
        x = c;
        if ((x / 10) == 0) {
            sum = c;
        } else {
            while (x > 0) {
                y = x%10;
                sum = sum+y;
                x = x/10;
            }
        }
        System.out.println("c ცვლადის ციფრთა ჯამი უდრის  " + sum + "ს");

        // მეთოდი 5

        int multiply_Methods = lastDigit * firstDigit;
        System.out.println("მეთოდი 2-ის და მეთოდი 3-ის ნამრავლი შეადგენს " + multiply_Methods);

        // მეთოდი 6

        int multiply_AnotherMethods = firstDigit * multiply_Methods;
        System.out.println("მეთოდი 3-ის და მეთოდი 5-ის ნამრვალი არის " + multiply_AnotherMethods);
    }
}
