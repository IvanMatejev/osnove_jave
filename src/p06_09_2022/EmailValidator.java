package p06_09_2022;

public class EmailValidator extends Validator {
	private String email;
	
	

	public EmailValidator(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public ValidationResult validate() {
		// TODO Auto-generated method stub
		ValidationResult result = new ValidationResult();
		if ( !this.email.contains("@")) {
			result.addError("Email is invalid");
		}else if( !this.email.endsWith(".com") ) {
			result.addError("Email is invalid");
		}
		return result;
	}
	
}
