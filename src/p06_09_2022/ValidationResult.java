package p06_09_2022;

import java.util.ArrayList;

public class ValidationResult {
	private boolean hasErrors;
	ArrayList<String> errors = new ArrayList<String>();
	public boolean isHasErrors() {
		return hasErrors;
	}
	public ArrayList<String> getErrors() {
		return errors;
	}
	
	public void addError (String greska) {
		this.hasErrors = true;
		errors.add(greska);
	}
	
	public void print () {
		if (this.hasErrors) {
			for ( int i = 0; i < this.errors.size(); i++ ) {
				System.out.println(this.errors.get(i));
			}
		}else {
			System.out.println("Valid email.");
		}
	}
	
	
}
