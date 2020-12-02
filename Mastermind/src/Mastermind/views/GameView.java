package views;

public class GameView extends View {
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
    
}
