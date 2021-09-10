package poo.Classe;

public class RunClasse {
    public static void main(String[] args) {
        Classe u1=new Classe();
        u1.age=18;
        u1.name="Jurandir";
        u1.weight=1.84f;
        u1.status();
        u1.death();
        Classe u2=new Classe();
        u2.name="Shirinder";
        u2.age=38;
        u2.weight=1.65f;
        u2.status();
        u2.alive();
    }
}
