package IHM;

import java.util.ArrayList;

public class bibiotheque {
    private livre[] bib = {};



    public livre[] refresh(ArrayList list){




    return bib;
    }


    public void addBook(livre newlivre){
        int taille = bib.length;
        livre[] blabla= new livre[taille+1];
        for(int i = 0;i<taille;i++){
            blabla[i] = bib[i];
        }

        blabla[taille] = newlivre;


        bib = blabla;
        System.out.println(bib);
    }

    public livre[] getBib() {
        return bib;
    }
}
