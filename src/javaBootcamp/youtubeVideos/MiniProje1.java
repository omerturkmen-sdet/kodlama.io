package javaBootcamp.youtubeVideos;

public class MiniProje1 {

    public static void main(String[] args) {


       int sayi = 29;

       boolean flag = true;
       for (int i=2; i<sayi; i++){
           if (sayi % i == 0){
                  flag = false;
                  break;
           }
       }

       String mesaj = flag ? "Sayı asaldır" : "Sayı asal değildir";
       System.out.println(mesaj);
    }

}
