package Assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {

    public static void run(){
        int a,b, x=0, even = 0, odd = 0, sumEven = 0, sumOdd = 0;
        Random randInt = new Random();
        List<Integer> numbers = new ArrayList<>();
        Scanner inputLabel = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = inputLabel.nextInt();
        System.out.println("Enter b : ");
        b = inputLabel.nextInt();

        if(a>b){
            x=b;
            b=a;
            a=x;
        }

        System.out.println("Random numbers beetwen a and b : ");
        for(int i = 0; i < 40; i++){
            int random_a_b = randInt.nextInt(b-a+1) + a;
            numbers.add(random_a_b);
            System.out.println(random_a_b);
        }
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                even++;
                sumEven += number;
            } else {
                odd++;
                sumOdd += number;
            }
        }
        System.out.println("Evens : " + even + "\nOdds : " + odd + "\nEvens sum : " + sumEven + "\nOdds sum : " + sumOdd
                + "\nSum of both : " + (sumOdd + sumEven));

        for(int i = 0; i < 5; i++){
            if(sumEven > sumOdd) System.out.println("Random number " + i + " : " + (randInt.nextInt(sumEven-sumOdd+1) + sumOdd));
            else System.out.println("Random number" + i + " : " + (randInt.nextInt(sumOdd-sumEven+1) + sumEven));
        }
    }

    public static void main(String[] args){
        Task_3.run();
    }
}

