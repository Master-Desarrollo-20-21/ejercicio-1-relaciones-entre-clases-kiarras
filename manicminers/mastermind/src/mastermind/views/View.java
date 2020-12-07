public class View {
    Console console;
    public View(){
        console = new Console();
    }
    public void getTitle() {
		this.console.out("\n---- MASTERMIND -----\n");
    }
    public boolean isResume() {
        String answer;
		do {
			answer = this.console.in("RESUME? (y/n): ");
		} while (!answer.equals("y") && !answer.equals("n"));
		return answer.equals("y");
    }
    public void getAttempts(String value) {
		this.console.out(value);
    }
    public string inCombination(){
        return this.console.in("Propose a combination: ");
    }
    public void getErroLength() {
        this.console.out("Wrong proposed combination length\n");
    }
    public void getErrorColor(String colors) {
        this.console.out("Wrong colors, they must be: " + colors + "\n");
    }
}
