package javaBootcamp.youtubeVideos;

public class Arrays {

    public static void main(String[] args) {

        String[] ögrenciler = new String[4];

        ögrenciler[0] = "Engin";
        ögrenciler[1] = "Efe";
        ögrenciler[2] = "Ece";
        ögrenciler[3] = "Ege";

        for (int i = 0; i < ögrenciler.length; i++) {
            System.out.println(ögrenciler[i]);
        }

        for (String ögrenci : ögrenciler) {
            System.out.println(ögrenci);
        }
    }

}
