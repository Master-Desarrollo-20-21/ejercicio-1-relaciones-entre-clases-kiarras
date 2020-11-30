
public class MastermindView {

    final String PROPOSE = "Propose a combination: ";
    final String WRONG_LENGTH = "Wrong proposed combination length \n";
    final String WRONG_COLORS = "Wrong colors, they must be: rbygop \n";
    Console console;

    public MastermindView() {
        this.console = new Console();
    }

    public boolean isResumed() {
        console.out("Resume? (y/n):");
        if (console.inChar() == 'y') {
            return true;
        }
        return false;
    }

    public void showTitle() {
        console.out("----- MASTERMIND ----- \n");
    }

    public void showAttempsNumber(int i) {
        console.out(i + " attempt(s): \n xxxx \n");
    }

    public void finalResult(Boolean result) {
        if (result) {
            console.out("You've won!!! ;-) \n");
        } else {
            console.out("You've lost!!! :-( \n");
        }
    }

	public void showPreviousAttempts(String[] showPreviousAttempts) {
        for (int i = 0; i < showPreviousAttempts.length; i++) {
            console.out(showPreviousAttempts[i] + "\n");
        }
    }
    
    public String inProposedCombination(String alert) {
        console.out(alert);
        console.out(PROPOSE);
        return console.inString();
    }

	public String inWrongLength() {
		return inProposedCombination(WRONG_LENGTH);
	}

	public String inWrongColors() {
		return inProposedCombination(WRONG_COLORS);
	}
}
