

public class ProposedCombination extends Combination{

    private MastermindView mastermindView;

    public ProposedCombination(MastermindView mastermindView) {
        this.mastermindView = mastermindView;
        code = getValidCombination();
    }

    private String getValidCombination() {
        String value = this.mastermindView.inProposedCombination("");
        while (value.length() != 4) {
            value = this.mastermindView.inWrongLength();
        } 
        while (!isColorsOK(value)) {
            value = this.mastermindView.inWrongColors();
        }
        return value;
    }


    private boolean isColorsOK(String value) {
        for (char c : value.toCharArray()) {
                if(Color.valueOf(c) == null) return false;
            }
        return true;
    }

    public ProposedCombination getProposedCombination() {
		return this;
	}

    @Override
    public String show() {
        return code;
    }
}
