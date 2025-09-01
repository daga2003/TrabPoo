/**
 * Classe que representa um Filme com suas principais características.
 *
 * Contém informações como título, ano de lançamento, gênero,
 * diretor e nota média atribuída ao filme.
 *
 * @author Fernanda
 * @version 1.0
 */
public class Filmes {
    private String titulo;
    private int anoFilme;
    private String genero;
    private String diretor;
    private double notaMedia;

    /**
     * Construtor da classe Filmes.
     *
     * @param titulo    Título do filme
     * @param anoFilme  Ano de lançamento do filme
     * @param genero    Gênero do filme
     * @param diretor   Diretor do filme
     * @param notaMedia Nota média atribuída ao filme
     */
    public Filmes(String titulo, int anoFilme, String genero, String diretor, double notaMedia) {
        this.titulo = titulo;
        this.anoFilme = anoFilme;
        this.genero = genero;
        this.diretor = diretor;
        this.notaMedia = notaMedia;
    }

    /** @return o título do filme */
    public String getTitulo() {
        return titulo;
    }

    /** @param titulo Define o título do filme */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /** @return o ano de lançamento do filme */
    public int getAnoFilme() {
        return anoFilme;
    }

    /** @param anoFilme Define o ano de lançamento do filme */
    public void setAnoFilme(int anoFilme) {
        this.anoFilme = anoFilme;
    }

    /** @return o gênero do filme */
    public String getGenero() {
        return genero;
    }

    /** @param genero Define o gênero do filme */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /** @return o diretor do filme */
    public String getDiretor() {
        return diretor;
    }

    /** @param diretor Define o diretor do filme */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /** @return a nota média do filme */
    public double getNotaMedia() {
        return notaMedia;
    }

    /** @param notaMedia Define a nota média do filme */
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
