import views.CombinationView;

public class ProposedCombination extends Combination {

    private CombinationView view;

    public ProposedCombination() {
        this.view = new CombinationView();
        code = getValidCombination();
    }

    private String getValidCombination() {
        String value = this.view.inProposedCombination("");
        while (value.length() != 4) {
            value = this.view.inWrongLength();
        } 
        while (!isColorsOK(value)) {
            value = this.view.inWrongColors();
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
    public String getCombination() {
        return code;
    }
}
