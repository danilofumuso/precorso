import java.util.Arrays;

public class Studente {
    public String nome;
    public String cognome;
    public int[] listaVoti;
    public int media;

    public Studente(String _nome, String _cognome, int[] _listaVoti) {
        this.nome = _nome;
        this.cognome = _cognome;
        this.listaVoti = _listaVoti;
        this.media=0;
    }

    public int calcolaMedia() {
        int somma = 0;

        for (int i = 0; i < listaVoti.length; i++) {

            somma += listaVoti[i];

        }

        return media = somma / listaVoti.length;

    }

    public void print() {
        System.out.println("Nome Studente: " + this.nome);
        System.out.println("Cognome Studente: " + this.cognome);
        System.out.println("I tuoi voti: " + Arrays.toString(this.listaVoti));
        System.out.println("La media dei tuoi voti è: " + this.calcolaMedia());

    }
}
