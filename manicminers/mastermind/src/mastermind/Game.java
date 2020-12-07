package mastermind;

class Game {

	final int MAX_ATTEMPS = 10;
	int attempsCounter = 0;
	private View view;
	Combination secretCombination;
	Result[] results = new Result[MAX_ATTEMPS];

	Game() {
		this.view = new View();
	}
	
	public void start() {
		this.attempsCounter = 0;
		this.results = new Result[MAX_ATTEMPS];
		this.secretCombination = new Combination();
		this.secretCombination.setRandomValue();
		this.view.getTitle();
	}
	
	public void play() {
		this.start();
		do {
			Combination proposedCombination = new Combination();
			proposedCombination.readValue();
			this.results[this.attempsCounter] = new Result(proposedCombination, this.secretCombination);
			this.attempsCounter++;
			this.view.getAttempts(this.toString());

		} while (!this.isEndOfGame());
	}
	
	private boolean isEndOfGame() {
		return this.attempsCounter == MAX_ATTEMPS || this.getLastResult().isWinner();
	}
	
	private Result getLastResult() {
		return this.results[this.attempsCounter - 1];
	}

	public boolean resume() {
		return this.view.isResume();
	}
	//pasar esto a view necesita de muchos parametros
	public String toString() {
		String rs = "\n" + this.attempsCounter + " attempt(s):\n";
		
		for (int i = 0; i < this.attempsCounter; i++) {
			rs += results[i].toString() + "\n";
		}
		
		if(this.isEndOfGame()) {
			if (this.getLastResult().isWinner()) {
				rs += "You've won!!! ;-)\n";
			} else {
				rs += "You've lost!!! :-(\n";
				rs += "Secret was: " + this.secretCombination.getValue() + "\n";
			}
		}
		
		return rs;
	}
}
