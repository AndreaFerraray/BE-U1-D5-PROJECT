package MediaInfo;

import java.util.Scanner;

 public class MultimediaPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reproducible[] mediaList = new Reproducible[5];

        mediaList[0] = new AudioRecording("Audio 1", 3, 2, 5);
        mediaList[1] = new Video("Video 1", 4, 3, 3);
        mediaList[2] = new Image("Immagine 1", 5);

        int choice;
        do {
            System.out.println("Scegli un media da eseguire (1-5, 0 per terminare): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= mediaList.length) {
                Reproducible media = mediaList[choice - 1];
                if (media.isReproducible()) {
                    media.play();
                } else {
                    media.show();
                }
            } else if (choice != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (choice != 0);

        System.out.println("Uscita dal lettore multimediale.");
    };{
}}
