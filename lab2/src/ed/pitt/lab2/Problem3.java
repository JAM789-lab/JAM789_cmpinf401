package ed.pitt.lab2;

import javax.swing.JOptionPane;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iMoney, bucks, sawbucks, Benjamins, grands;
		String money;
		
		money = JOptionPane.showInputDialog("Input an amount of money from 1 to 9999");
		iMoney = Integer.parseInt(money);
		
		grands = iMoney / 1000;
		Benjamins = iMoney % 1000 / 100;
		sawbucks = iMoney % 100 / 10;
		bucks = iMoney & 10;
		
		JOptionPane.showMessageDialog(null, "You have " + grands + " grands, " + Benjamins + " Benjamins, " + sawbucks + " sawbucks, and " + bucks + " bucks.");

	}

}
