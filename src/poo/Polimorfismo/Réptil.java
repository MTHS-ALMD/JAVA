package poo.Polimorfismo;

public class Réptil extends Animal {
    private String corEscamas;

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }

    @Override
    public void locomover() {
        System.out.printf("Rastejar");
    }

    @Override
    public void alimentar() {
        System.out.printf("Folhas");
    }

    @Override
    public void emitirSom() {
        System.out.printf("Emitir som de réptil");

    }
}
