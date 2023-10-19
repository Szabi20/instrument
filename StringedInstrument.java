package music;

public abstract class StringedInstrument extends Istrument{

    int numberOfStrings;
    public void sound(){
        this.play();
    }

    @Override
    protected void play(){
        System.out.println(this.sound);
    }

}
