public class Filmes {
    private String titulo;
    private int anoFilme;
    private String genero;
    private String diretor;
    private double notaMedia;

    // Construtor
    public Filmes(String titulo, int anoFilme, String genero, String diretor, double notaMedia) {
        this.titulo = titulo;
        this.anoFilme = anoFilme;
        this.genero = genero;
        this.diretor = diretor;
        this.notaMedia = notaMedia;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoFilme() {
        return anoFilme;
    }

    public void setAnoFilme(int anoFilme) {
        this.anoFilme = anoFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

}
