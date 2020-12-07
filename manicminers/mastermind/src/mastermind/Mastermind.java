package mastermind;

class Mastermind {
	
	private Game game;
	
	public Mastermind() {
		
	}
	//en este play, Game lo hace todo
	private void play() {
		 do {
			 this.game = new Game();
			 this.game.play();
		 }
		 while(this.game.resume());
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}
}
