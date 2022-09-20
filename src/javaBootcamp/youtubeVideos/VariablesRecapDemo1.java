package javaBootcamp.youtubeVideos;

public class VariablesRecapDemo1 {

    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;

        int enBüyükSayi = sayi1;

        if (enBüyükSayi < sayi2) {
            enBüyükSayi = sayi2;
        }

        if (enBüyükSayi < sayi3){
            enBüyükSayi = sayi3;
        }

        System.out.println("En büyük sayi: " + enBüyükSayi);

    }

}
