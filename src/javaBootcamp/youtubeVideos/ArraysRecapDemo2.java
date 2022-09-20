package javaBootcamp.youtubeVideos;

public class ArraysRecapDemo2 {

    public static void main(String[] args) {

        double[] myList = {1.2, 3.5, 2.7, 5.0, 4.1};

        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (number > max) {
                max = number;
            }
            total += number;
            System.out.println(number);
        }

        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + max);

    }

}
