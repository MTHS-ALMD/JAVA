package poo.Exercício;

public class Run {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Zelão",23,"M");
        Livro l1 = new Livro("Chuchil","Joseph Williams",323,p1);
        System.out.printf(l1.detalhes());
    }
}
