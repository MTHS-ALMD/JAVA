package poo.Polimorfismo;

public class Ave extends Animal{
    private String corPenas;

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    public void fazerNinho(){
        System.out.printf("Fazendo ninho...");
    }

    @Override
    public void locomover() {
        System.out.printf("Voando");
    }

    @Override
    public void alimentar() {
        System.out.printf("Frutas");

    }

    @Override
    public void emitirSom() {
        System.out.printf("Emitir som de ave");

    }
}
