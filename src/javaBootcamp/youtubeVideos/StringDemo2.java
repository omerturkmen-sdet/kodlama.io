package javaBootcamp.youtubeVideos;

public class StringDemo2 {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        String yeniMesaj = mesaj.replace(" ","_");
        System.out.println(yeniMesaj);

        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,5));

        System.out.println("-----------------------------");
        System.out.println("Split kullanıp mesajı kelimelere ayırma");
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());


    }

}
