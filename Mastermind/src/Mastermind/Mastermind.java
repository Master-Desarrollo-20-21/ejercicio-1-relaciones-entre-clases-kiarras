

public class Mastermind {

    private MastermindView mastermindView;
    private Game game;

    public Mastermind(){
        this.mastermindView = new MastermindView();
        this.game = new Game(this.mastermindView);
    }

    public void start() {
        do {
            this.game.play();
        } while (isResumed());
    }
    
    private boolean isResumed() {
        if(mastermindView.isResumed()){
            this.game = new Game();
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
            new Mastermind().start();
    }
}
