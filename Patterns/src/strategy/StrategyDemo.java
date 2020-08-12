package strategy;

public class StrategyDemo {
	
	public static void main(String[] args) {
		
		CreditCard amexCard = new CreditCard(new AmexStrategy());
		amexCard.setNumber("379185883464283");
		amexCard.setDate("04/2021");
		amexCard.setCvv("123");
		
		System.out.println("Is Amex valid: "+amexCard.isValid());
		
		CreditCard amexCard2 = new CreditCard(new AmexStrategy());
		amexCard2.setNumber("389185883464283");
		amexCard2.setDate("04/2021");
		amexCard2.setCvv("123");
		
		System.out.println("Is Amex valid: "+amexCard2.isValid());
		
		
		CreditCard visaCard = new CreditCard(new VisaStrategy());
		visaCard.setNumber("4479185883464283");
		visaCard.setDate("04/2021");
		visaCard.setCvv("123");
		
		System.out.println("Is Visa valid: "+visaCard.isValid());
	}

}
