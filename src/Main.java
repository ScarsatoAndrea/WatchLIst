import ai.quarta.Libreria;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        libreria.tsvr(new File("data.tsv"));
        Scanner in = new Scanner (System.in);

        while(true){
            int scelta;
            System.out.println("Benvenuto nella tua WatchLIst, cosa vuoi fare?\n" +
                    "1) Visualizzare la tua watch list\n" +
                    "2) Cercare un film\n" +
                    "3) Uscire");
            scelta = Integer.valueOf(in.nextLine());
            if(scelta == 1){

            }else if (scelta == 2){

            }else{ break;}
        }

    }
}