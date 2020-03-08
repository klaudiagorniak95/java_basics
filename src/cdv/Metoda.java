package cdv;

public class Metoda {
    public static void main(String[] args) {
        int[] table = {50,10,89,3,212};
        float number = average(table);
        System.out.println(number);

    }

    public static float average(int[] numbers){

        float sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum = sum + numbers[i];
        }

        float average = sum / (float) numbers.length;
        return average;
    }

}

