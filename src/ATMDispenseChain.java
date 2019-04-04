public class ATMDispenseChain {
	
	private DispenseChain dc1;
	private DispenseChain dc2;
	private DispenseChain dc3;

	public ATMDispenseChain() {
		// initialize the chain
		dc1 = new Dollar50Dispenser();
		dc2 = new Dollar20Dispenser();
		dc3 = new Dollar10Dispenser();

		// set the chain of responsibility
		dc1.setNextChain(dc2);
		dc2.setNextChain(dc3);
	}

	public DispenseChain getDc1() {
		return dc1;
	}
}