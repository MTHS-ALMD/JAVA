package poo.Classe;

public class Classe {
    String name;
    int age;
    float weight;
    boolean living;

    void status(){

        System.out.printf("O nome do usuario é %s.\n",name);
        System.out.printf("Ele(a) tem %d anos.\n",age);
        System.out.printf("Sua altura é %.2f.\n",weight);
    }
    void death(){
        this.living=false;
        System.out.printf("Usuário se encontra falecido(a).\n\n");
    }
    void alive(){
        this.living=true;
        System.out.printf("Usuário se encontra vivo(a).\n\n");
    }
}

