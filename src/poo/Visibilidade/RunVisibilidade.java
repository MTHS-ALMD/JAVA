package poo.Visibilidade;

public class RunVisibilidade {

    public static void main(String[] args) {
        Visibilidade u1=new Visibilidade();
        u1.age=18;
        u1.name="Jurandir";
        u1.weight=1.84f;
        u1.status();
        u1.death();
        Visibilidade u2=new Visibilidade();
        u2.name="Shirinder";
        u2.age=38;
        u2.weight=1.65f;
        u2.status();
        u2.alive();
    }
}
