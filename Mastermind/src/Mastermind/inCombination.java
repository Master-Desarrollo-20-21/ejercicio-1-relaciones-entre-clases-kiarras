

public abstract class Combination {
    protected static final int MAX_COLORS = 4;
    protected String code;
    protected char[] charCode = new char[MAX_COLORS];

	public abstract String getCombination();
}
