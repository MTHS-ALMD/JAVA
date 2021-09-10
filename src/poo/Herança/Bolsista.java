package poo.Herança;

public class Bolsista extends Aluno{
    private int bolsa;

    public void revonarBolsa(){
         setMatricula(true);
         System.out.printf("Bolsa renovada.");
     }

    @Override
    public void pagarMensalidade() {
        System.out.printf("Mensalidade de bolsista paga.");
    }
}
