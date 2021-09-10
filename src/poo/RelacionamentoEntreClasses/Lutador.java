package poo.RelacionamentoEntreClasses;

public class Lutador {

    private String name;
    private String nationality;
    private float weigth;
    private int age;
    private float height;
    private String category;
    private int wins;
    private int loses;
    private int tie;

    public Lutador(String name, String nacionality, int age, float heigth, float weigth, int win, int lose, int tie){
        this.setName(name);
        this.setNationality(nacionality);
        this.setWeigth(weigth);
        this.setAge(age);
        this.setHeight(heigth);
        this.setWins(win);
        this.setLoses(lose);
        this.setTie(tie);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getNationality() {
        return nationality;
    }

    private void setNationality(String nationality) {
        this.nationality = nationality;
    }

    private float getWeigth() {
        return weigth;
    }

    private void setWeigth(float weigth) {
        this.weigth = weigth;
        setCategory();
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private float getHeight() {
        return height;
    }

    private void setHeight(float height) {
        this.height = height;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if (getWeigth()<52.2){
           category="Inválido";
        }else if (getWeigth()<=70.3){
            category="Leve";
        }else if (getWeigth()<=83.9){
            category="Médio";
        }else if (getWeigth()<=120.2){
            category="Pesado";
        }else{
            category="Inválido";
        }
    }

    private int getWins() {
        return wins;
    }

    private void setWins(int wins) {
        this.wins = wins;
    }

    private int getLoses() {
        return loses;
    }

    private void setLoses(int loses) {
        this.loses = loses;
    }

    private int getTie() {
        return tie;
    }

    private void setTie(int tie) {
        this.tie = tie;
    }

    public void introduction(){
        System.out.println("------Introdução------");
        System.out.printf("Nome: %s ",this.getName());
        System.out.printf("Nacionalidade: %s ",this.getNationality());
        System.out.printf("Peso: %.2fkg ",this.getWeigth());
        System.out.printf("Vitórias: %d ",this.getWins());
        System.out.printf("Derrotas: %d ",this.getLoses());
        System.out.printf("Empates: %d \n",this.getTie());

    }

    public void status(){
        System.out.printf("%s",this.getName());
        System.out.printf("é um peso %s",this.getCategory());
        System.out.printf("Vitórias:%d",this.getWins());
        System.out.printf("Derrotas:%d",this.getLoses());
        System.out.printf("Empates:%d",this.getTie());
    }

    public void winFigth(){
        this.setWins(getWins()+1);
    }

    public void loseFigth(){
        this.setLoses(getLoses()+1);
    }

    public void tieFigth(){
        this.setTie(getTie()+1);
    }

}
