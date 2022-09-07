package p06_09_2022;

public class Zadatak_validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailValidator email = new EmailValidator("sasasaas.com");
//		email.validate().errors.get(0);
		
		ValidationResult rezultat = new ValidationResult();
		
		email.validate().print();
		

	}

}
