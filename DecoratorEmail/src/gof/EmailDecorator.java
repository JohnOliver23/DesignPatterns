package gof;

public abstract class EmailDecorator implements Email {
	public Email email;

	public EmailDecorator(Email email) {
		this.email = email;
		
	}

	public Email getEmail() {
		return email;
	}
	
	

}
