package poo.MetodosEspeciais;

public class MetodosEspeciais {
    private String name;
    private int age;
    private float weight;
    private boolean living;
    private String gender;

    public MetodosEspeciais(String name,String gender,int age,float weight,boolean living){
        setAge(age);
        setGender(gender);
        setLiving(true);
        setWeight(weight);
        setName(name);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
       this.age=age;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public boolean isLiving() {
        return living;
    }
    public void setLiving(boolean living) {
        this.living = living;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender=gender;
    }

    public void status(){
        System.out.printf("O nome do usuário(a) é %s.\n",getName());
        if(gender.equals("feminino")){
            System.out.printf("%s é do sexo feminino.\n",getName());
        }
        else if(gender.equals("masculino")){
            System.out.printf("%s é do sexo masculino.\n",getName());
        }
        else{
            System.out.println("Gênero não indentificado.");
        }
        if(age<=0){
            System.out.println("Idade inválida.");
        }
        else{
            System.out.printf("Ele(a) tem %d anos.\n",getAge());
        }
        System.out.printf("Sua altura é %.2f.\n",getWeight());
        if(isLiving()==true){
            System.out.printf("Usuário se encontra vivo(a).\n\n");
        }
        else{
            System.out.printf("Usuário(a) se encontra falecido(a).\n\n");
        }
    }
}
