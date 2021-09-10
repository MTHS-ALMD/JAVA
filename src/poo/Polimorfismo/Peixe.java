package poo.Polimorfismo;

public class Peixe extends Animal{
    private String corEscamas;

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }

    public void soltarBolha(){
        System.out.printf("Soltando bolha...");
    }

    @Override
    public void locomover() {
        System.out.printf("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.printf("Residuos");
    }

    @Override
    public void emitirSom() {
        System.out.printf("Peixe não emite som");
    }
}
