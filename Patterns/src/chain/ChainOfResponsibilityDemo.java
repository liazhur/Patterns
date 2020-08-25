package chain;

public class ChainOfResponsibilityDemo {
	
	public static void main(String[] args) {
		Director d = new Director();
		VP vp = new VP();
		CEO ceo = new CEO();
		
		d.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		Request request = new Request(RequestType.CONFERENCE, 500);
		d.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000);
		d.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 2000);
		d.handleRequest(request);
		
		
	}

}
