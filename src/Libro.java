public class Libro {
    public String titolo;
    public String autore;
    public int numPagine;

    //Costruttore
    public Libro(String _titolo, String _autore, int _numPagine) {
        this.titolo = _titolo;
        this.autore = _autore;
        this.numPagine = _numPagine;
    }

    public void print(){

        System.out.println("Titolo: " + this.titolo);
        System.out.println("Autore: " + this.autore);
        System.out.println("Numero di Pagine: " + this.numPagine);
    }

}
