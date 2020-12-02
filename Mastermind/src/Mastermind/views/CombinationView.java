package views;

public class CombinationView extends View {

    final String PROPOSE = "Propose a combination: ";
    final String WRONG_LENGTH = "Wrong proposed combination length \n";
    final String WRONG_COLORS = "Wrong colors, they must be: rbygop \n";
    
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
