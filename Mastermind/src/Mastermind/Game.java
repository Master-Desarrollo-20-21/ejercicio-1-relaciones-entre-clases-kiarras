import views.GameView;

public class Game {

    public static final int MAX_ATTEMPS = 10;
    public static final int WINS = 4;
    private ProposedCombination[] proposedCombinations;
    private SecretCombination secretCombination;
    public int[][] results;
    private GameView view;

    public Game() {
        this.view = new GameView();
        proposedCombinations = new ProposedCombination[MAX_ATTEMPS];
        results = new int[MAX_ATTEMPS][];
        secretCombination = new SecretCombination();
    }

    public void play() {
        this.view.showTitle();
        int i = 0;
        do {
            this.view.showAttempsNumber(i);
            this.view.showPreviousAttempts(previousAttempts(i));
            proposedCombinations[i] = new ProposedCombination();
            results[i] = secretCombination.isEqual(proposedCombinations[i].getProposedCombination().getCombination());
            i++;
            if (results[i - 1][0] == WINS) {
                break;
            }
        } while (i < proposedCombinations.length);
        this.view.finalResult(finalResult(i - 1));
    }

    private String[] previousAttempts(int previous) {
        String[] attempts = new String[previous];
        for (int j = 0; j < previous; j++) {
            attempts[j]=getAttempt(j);
        }
        return attempts;
    }

    public String getAttempt(int j) {
        return proposedCombinations[j].getCombination() + " --> " + results[j][0] + " blacks and " + results[j][1] + " whites";
    }

    private boolean finalResult(int i) {
        if (results[i][0] == 4)
            return true;
        return false;
    }
}
