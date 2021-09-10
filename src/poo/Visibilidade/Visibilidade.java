package poo.Visibilidade;

public class Visibilidade {
    String name;
    public int age;
    public float weight;
    private boolean living;

    public void status(){
        System.out.printf("O nome do usuario é %s.\n",name);
        System.out.printf("Ele(a) tem %d anos.\n",age);
        System.out.printf("Sua altura é %.2f.\n",weight);
    }
    public void death(){
        this.living=false;
        System.out.printf("Usuário se encontra falecido(a).\n\n");
    }
    public void alive(){
        this.living=true;
        System.out.printf("Usuário se encontra vivo(a).\n\n");
    }

}

