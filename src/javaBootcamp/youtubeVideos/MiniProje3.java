package javaBootcamp.youtubeVideos;

public class MiniProje3 {

    public static void main(String[] args) {

        int sayi = 7;

        int total = 0;

        for (int i=1; i<sayi; i++){
            if (sayi % i == 0){
                total += i;
            }
        }

        String mesaj = total == sayi ? "Girilen sayı mükemmel sayıdır"
                : "Girilen sayı mükemmel sayı değildir";

        System.out.println(mesaj);
    }

}
