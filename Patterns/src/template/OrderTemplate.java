package template;

public abstract class OrderTemplate {
	
	public abstract void doCheckout();//hook
	public abstract void doPayment();//hook
	public abstract void doReceipt();//hook
	public abstract void doDelivery();//hook
	
	
	public final void processOrder() {// base method
		doCheckout();
		doPayment();
		doReceipt();
		doDelivery();
	}
	

}
