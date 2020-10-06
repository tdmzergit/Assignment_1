package Assignment_1;

import java.util.Scanner;

class B extends A {

    int y;

    public B(String phrase) {
        super(phrase);
    }


    public void bFirstMethod() {
        Scanner input_label = new Scanner(System.in);
        System.out.println("შეიყვანეთ y : ");
        y = input_label.nextInt();
    }

    public void bSecondMethod() {
        System.out.println((x+y) + "არის x, y-ის ჯამი");
    }
}