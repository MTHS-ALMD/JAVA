package poo.RelacionamentoEntreClasses;
import java.util.Random;

public class Luta {

    private Lutador challenger;
    private Lutador challenged;
    private int rounds;
    private boolean approved;

    private Lutador getChallenger() {
        return challenger;
    }

    private void setChallenger(Lutador challenger) {
        this.challenger = challenger;
    }

    private Lutador getChallenged() {
        return challenged;
    }

    private void setChallenged(Lutador challenged) {
        this.challenged = challenged;
    }

    private int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void markFigth(Lutador figther1,Lutador figther2){
        if (figther1.getCategory()== figther2.getCategory()&&figther1!=figther2){
            this.approved=true;
            this.challenger=figther1;
            this.challenged=figther2;
        }else{
            this.approved=false;
            this.challenger=null;
            this.challenged=null;
        }
    }
    public void Figth(){
        if (this.isApproved()==true){
            this.challenger.introduction();
            this.challenged.introduction();
            Random random=new Random();
            int winner= random.nextInt(3);
            switch (winner){
                case 0:
                    System.out.printf("------RESULTADO------");
                    System.out.printf("\nEmpate!");
                    this.challenger.tieFigth();
                    this.challenged.tieFigth();
                    break;
                case 1:
                    System.out.printf("------RESULTADO------");
                    System.out.printf("\nO lutador %s ganhou a luta!",this.getChallenger().getName());
                    this.challenger.winFigth();
                    this.challenged.loseFigth();
                    break;
                case 2:
                    System.out.printf("------RESULTADO------");
                    System.out.printf("\nO lutador %s ganhou a luta!",this.getChallenged().getName());
                    this.challenged.winFigth();
                    this.challenger.loseFigth();
                    break;
            }
        }else{
            System.out.printf("Não foi possível marcar a luta");
        }
    }
}
