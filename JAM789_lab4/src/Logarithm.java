import javax.swing.JOptionPane;

public class Logarithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String iLog, iBase;
		int log, base;
		
		do {
		iLog = JOptionPane.showInputDialog("Enter the number you would like to take the log of: ");
		log = Integer.parseInt(iLog);
		}while(log <= 0);
		
		do {
		iBase = JOptionPane.showInputDialog("Enter the number you would like to take the base of: ");
		base = Integer.parseInt(iBase);
		}while(base <= 1);
		
		JOptionPane.showMessageDialog(null, "The logarithm of " + log + " with base " + base + " is " + fLog(log, base));
		
	}
	public static int fLog(int X, int b) {
		int Y;
		for(Y = 0; X >= b; Y++) {
			X /= b;
		}
		
		return Y;
	}

}
