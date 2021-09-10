package poo.Exercício;

public class Livro implements Publicação{
    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPagina() {
        return totPagina;
    }

    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Livro(String titulo, String autor, int totPagina, Pessoa leitor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPagina(totPagina);
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(leitor);

    }

    public String detalhes() {
        return "Livro\n" +
                "Título='" + titulo + '\'' +
                "\nAutor='" + autor + '\'' +
                "\nTotal de páginas=" + totPagina +
                "\nPágina atual=" + pagAtual +
                "\nAberto=" + aberto +
                "\nLeitor=" + leitor.getNome()
                ;
    }

    @Override
    public void abrir() {
        if (this.isAberto()==true){
            System.out.printf("O livro já está aberto.");

        }else{
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()==false){
            System.out.printf("Esse livro já está fechado.");
        }else{
            this.setAberto(false);
        }
    }

    @Override
    public void folhear(int pagina){
        if (pagina>getTotPagina()||pagina<0){
            setTotPagina(0);
            System.out.printf("O livro em questão não possuí essa quantidade de páginas");
        }else{
            this.setPagAtual(pagina);
        }
    }

    @Override
    public void avancaPagina() {
        if(this.getPagAtual()>this.getTotPagina()){
            setPagAtual(getTotPagina());
            System.out.printf("Esse livro possuí apenas %d páginas",getTotPagina());
        }else{
            this.setPagAtual(getPagAtual()+1);
        }
    }
    @Override
    public void voltarPagina() {
        if (this.getTotPagina()<0){
            setPagAtual(0);
            System.out.printf("Esse livro não possui esse número de páginas");
        }else{
            this.setPagAtual(getPagAtual()-1);
        }
    }
}
