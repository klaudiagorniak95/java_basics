package cdv;

import java.util.Scanner;

public class LeastElement {
    public static void main(String[] args){
        int[] table = {12,3,24,2,334};
        System.out.println("Najmniejsza liczba to: " + least(table));
    }


    public static float least(int[] numbers){
        int num = numbers[0];
        for (int number : numbers) {
            if (number < num) {
                num = number;
            }
        }
        return num;
    }

//    public static int[] table(int n1){
//        Scanner podaj_liczbe = new Scanner(System.in);
//        int[] numbers = {};
//        String stop_value = "quit";
//        while (num1 != stop_value) {
//            String num1 = podaj_liczbe.next();
//            int num2 = Integer.parseInt(num1);
//            numbers.add(num2);
//
//        }
//        return numbers;
//
//    }

}