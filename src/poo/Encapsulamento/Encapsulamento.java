package poo.Encapsulamento;

public class Encapsulamento implements Interface{
    private int volume;
    private boolean on;
    private boolean playing;

    public Encapsulamento(){
        volume=50;
        on=false;
        playing=false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isOn() {
        return on;
    }

    private void setOn(boolean on) {
        this.on = on;
    }

    private boolean isPlaying() {
        return playing;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    @Override
    public void on() {
        this.setOn(true);
    }

    @Override
    public void off() {
        this.setOn(false);
    }

    @Override
    public void openMenu() {
        if (this.isOn()==true){
            System.out.printf("Ligado: %b.\n",this.isOn());
            System.out.printf("Tocando: %b.\n",this.isPlaying());
            System.out.printf("Volume: %d.",this.getVolume());
        }
    }

    @Override
    public void closeMenu() {
        if (this.isOn()==true){
            System.out.printf("Fechando menu...");
        }
    }

    @Override
    public void volumeUp() {
        if (this.isOn()==true){
            this.setVolume(this.getVolume()+1);
        }
    }

    @Override
    public void volumedown() {
        if (this.isOn()==true){
            this.setVolume(this.getVolume()-1);
        }
    }

    @Override
    public void muteOn() {
        if (this.isOn()==true&&this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void muteoff() {
        if (this.isOn()==true&&this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isOn()==true&&this.isPlaying()==false){
            this.setPlaying(true);
        }
    }

    @Override
    public void pause() {
        if (this.isOn()==true&&this.isPlaying()==true){
            this.setPlaying(false);
        }
    }
}
