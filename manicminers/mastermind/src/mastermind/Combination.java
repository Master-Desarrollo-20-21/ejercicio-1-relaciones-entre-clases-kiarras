package mastermind;

import java.util.Random;

class Combination {

	protected static final int LENGHT = 4;	
	protected String[] colors;
	protected Console console;
	
	public Combination() {
		this.console = new Console();
	}
	
	public String[] getColors() {
		return this.colors;
	}
	
	public boolean isValid() {
		return this.isValidLength() && this.isValidColors();
	}
	
	public boolean isValidLength() {
		return this.colors.length == LENGHT;
	}
	
	public boolean isValidColors() {
		for(String color: this.colors) {
			if (!Colour.isValid(color)) {
				return false;
			}
		}
		return true;
	}
	
	public String getValidColours() {
		return Colour.validColours();
	}
	
	public int length() {
		return LENGHT;
	}
	
	public void readValue() {
				
		do {
			this.setValue(this.view.inCombination());
			
			if(!this.isValidLength()) {
				this.view.getErrorLength();
			}
			if(!this.isValidColors()) {
				this.view.getErrorColor(this.getValidColours());
			}				
		}
		while(!this.isValid());
	}
	
	public void setValue(String colors) {
		this.colors=colors.split("(?!^)");
	}
	
	public String getValue() {
		return String.join("", this.colors);
	}
	
	public void setRandomValue() {
		String combination="";
		
		do {
			int randomIndex = new Random().nextInt(Colour.values().length);
			char colour = Colour.validColours().toCharArray()[randomIndex];
			if (combination.indexOf(colour) == -1) {
				combination += colour;
			}
		} while (combination.length() < LENGHT);

		this.setValue(combination); 
	}
}
