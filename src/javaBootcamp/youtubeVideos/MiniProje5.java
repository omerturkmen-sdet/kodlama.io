package javaBootcamp.youtubeVideos;

public class MiniProje5 {

    public static void main(String[] args) {

       int[] sayilar = new int[]{1,2,5,7,9,0};
       int aranacak = 5;

       boolean flag = false;

       for (int i=0; i<sayilar.length; i++){
           if (aranacak == sayilar[i]){
               flag = true;
               break;
           }
       }

       if (flag){
           System.out.println("Sayı mevcuttur");
       }else {
           System.out.println("Sayı mevcut değildir");
       }

    }

}
