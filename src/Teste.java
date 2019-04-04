import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		ATMDispenseChain atm = new ATMDispenseChain();
		while (true) {
			int amount = 0;
			System.out.println("Quanto dinheiro você quer:");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("A quantidade deve ser múltipla de 10.");
				input.close();
				return;
			}
			atm.getDc1().dispense(new Currency(amount));
			System.out.println("Entrega encerrada!");
		}

	}

}