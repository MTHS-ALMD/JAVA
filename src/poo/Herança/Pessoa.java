package poo.Herança;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazerAniver(){
        this.setIdade(this.getIdade()+1);
    }

    public String toString() {
        return  "nome='" + nome + '\'' +
                "\nidade=" + idade +
                "\nsexo='" + sexo + '\'' ;
    }
}
