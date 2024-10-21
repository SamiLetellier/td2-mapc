package td1;

import java.util.List;

public class Memoire implements Document{

    private String titre;
    private List<Chapitre> cs;

    public Memoire(String titre, List<Chapitre> chapitres) {
        this.titre = titre;
        this.cs = chapitres;
    }

    @Override
    public String titre() {
        return this.titre;
    }

    @Override
    public int taille() {
        int taille = 0;
        for(Chapitre c : cs) {
            taille += c.taille() ;
        }
        return taille;
    }

}
