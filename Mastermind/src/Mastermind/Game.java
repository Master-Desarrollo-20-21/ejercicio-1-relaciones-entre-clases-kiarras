
public class Game {

    final int MAX_ATTEMPS = 10;
    final int WINS = 4;
    private ProposedCombination[] proposedCombinations;
    private SecretCombination secretCombination;
    public int[][] results;
    private MastermindView mastermindView;

    public Game() {
        proposedCombinations = new ProposedCombination[MAX_ATTEMPS];
        results = new int[MAX_ATTEMPS][];
        secretCombination = new SecretCombination();
    }

    public Game(MastermindView mastermindView) {
        this.mastermindView = mastermindView;
    }

    public void play() {
        this.mastermindView.showTitle();
        int i = 0;
        do {
            this.mastermindView.showAttempsNumber(i);
            this.mastermindView.showPreviousAttempts(showPreviousAttempts(i));
            proposedCombinations[i] = new ProposedCombination();
            results[i] = secretCombination.isEqual(proposedCombinations[i].getProposedCombination().show());
            i++;
            if (results[i - 1][0] == WINS) {
                break;
            }
        } while (i < proposedCombinations.length);
        this.mastermindView.finalResult(finalResult(i - 1));
    }

    private String[] showPreviousAttempts(int previous) {
        String[] attempts = new String[previous];
        for (int j = 0; j < previous; j++) {
            attempts[j]=getAttempt(j);
        }
        return attempts;
    }

    public String getAttempt(int j) {
        return proposedCombinations[j].show() + " --> " + results[j][0] + " blacks and " + results[j][1] + " whites";
    }

    private boolean finalResult(int i) {
        if (results[i][0] == 4)
            return true;
        return false;
    }
}
