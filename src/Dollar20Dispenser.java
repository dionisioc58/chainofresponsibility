public class Dollar20Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 20) {
			int num = cur.getAmount() / 20;
			int remainder = cur.getAmount() % 20;
			System.out.println("Entregando " + num + " notas de 20");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}

}