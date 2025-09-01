import java.io.*;
// FileReader -> abrir o arquivo de texto.
//BufferedReader -> ler o arquivo linha por linha.
//IOException -> capturar possíveis erros na leitura do arquivo.

import java.util.*;
//ArrayList -> armazenar todos os filmes lidos do arquivo.
//Collections -> para:
//max() e min() -> encontrar o filme com maior e menor nota.
//sort() -> ordenar a lista de filmes pelo título.
//Comparator -> comparar filmes por nota ou título durante ordenações.

/**
 * Classe principal da aplicação de gerenciamento de filmes.
 *
 * <p>Esta aplicação lê um arquivo de texto contendo informações de filmes,
 * armazena-os em uma lista e realiza o processamento dos dados, incluindo:</p>
 * <ul>
 *   <li>Cálculo da média das notas</li>
 *   <li>Identificação do filme com maior e menor nota</li>
 *   <li>Ordenação dos filmes por título em ordem alfabética</li>
 * </ul>
 *
 * <p>O arquivo deve ter o formato:</p>
 * <pre>
 * titulo;ano;genero;diretor;nota
 * </pre>
 *
 * <p>Exemplo de execução:</p>
 * <pre>
 * java AppFilmes filmes.txt
 * </pre>
 *
 * @author Fernanda
 * @version 1.0
 */
public class AppFilmes {

    /**
     * Método principal da aplicação.
     *
     * <p>Recebe como argumento o nome do arquivo de texto que contém os dados dos filmes,
     * realiza a leitura do arquivo, cria objetos {@link Filmes}, calcula a média das notas,
     * identifica o filme com maior e menor nota e exibe a lista de filmes ordenada por título.</p>
     *
     * @param args Argumentos de linha de comando; espera-se que o primeiro argumento seja o
     *             caminho para um arquivo de texto (.txt) no formato:
     *             <pre>titulo;ano;genero;diretor;nota</pre>
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: java AppFilmes <arquivo.txt>");
            return;
        }

        String nomeArquivo = args[0];
        ArrayList<Filmes> listaFilmes = new ArrayList<>();

        // Leitura do arquivo e criação dos objetos Filmes
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length == 5) {
                    String titulo = dados[0];
                    int ano = Integer.parseInt(dados[1]);
                    String genero = dados[2];
                    String diretor = dados[3];
                    double nota = Double.parseDouble(dados[4]);

                    Filmes filme = new Filmes(titulo, ano, genero, diretor, nota);
                    listaFilmes.add(filme);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Processamento e exibição dos dados
        if (!listaFilmes.isEmpty()) {
            double somaNotas = 0;
            for (Filmes f : listaFilmes) {
                somaNotas += f.getNotaMedia();
            }
            double media = somaNotas / listaFilmes.size();

            Filmes maiorNota = Collections.max(listaFilmes, Comparator.comparingDouble(Filmes::getNotaMedia));
            Filmes menorNota = Collections.min(listaFilmes, Comparator.comparingDouble(Filmes::getNotaMedia));

            Collections.sort(listaFilmes, Comparator.comparing(Filmes::getTitulo));

            System.out.println("===== Lista de Filmes Ordenados por Título =====");
            for (Filmes f : listaFilmes) {
                System.out.println(f.getTitulo() + " (" + f.getAnoFilme() + ") - Nota: " + f.getNotaMedia());
            }

            System.out.println("\nMédia geral das notas: " + String.format("%.2f", media));
            System.out.println("Maior nota: " + maiorNota.getTitulo() + " - " + maiorNota.getNotaMedia());
            System.out.println("Menor nota: " + menorNota.getTitulo() + " - " + menorNota.getNotaMedia());
        }
    }
}


