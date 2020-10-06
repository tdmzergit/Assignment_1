package Assignment_1;

import java.util.Scanner;

public class A {
    int x;
    String sayHello;

    public A(String phrase) {
        sayHello = phrase;
    }

    public static void main(String[] args){
        B constructor = new B("Hello");
        System.out.println(constructor.sayHello);

        constructor.firstMethod();
        constructor.secondMethod();
        constructor.thirdMethod();
        constructor.bFirstMethod();
        constructor.bSecondMethod();

    }

    public void firstMethod(){
        Scanner input_label = new Scanner(System.in);
        System.out.println("შეიყვანეთ x : ");
        input_label.nextInt();
    }

    public void secondMethod(){
        System.out.println("x დამატებული 12 არის " + x+12);
    }

    public void thirdMethod(){
        if (x % 2 == 0) {
            System.out.println(x + " არის ლუწი");
        } else {
            System.out.println(x + " არის კენტი");
        }
    }
}
