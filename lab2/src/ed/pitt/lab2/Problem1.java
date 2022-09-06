package ed.pitt.lab2;
import javax.swing.JOptionPane;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dSide1, dSide2, hyp;
		String side1, side2;
		
		side1 = JOptionPane.showInputDialog("Input the length of the first side of the triangle:");
		side2 = JOptionPane.showInputDialog("Input the length of the second side of the triangle:");
		
		dSide1 = Double.parseDouble(side1);
		dSide2 = Double.parseDouble(side2);

		hyp = Math.sqrt(Math.pow(dSide1, 2) + Math.pow(dSide2, 2));
		hyp *= 100;
		int r = (int) Math.round(hyp);
		hyp = r/100.0;
		
		JOptionPane.showMessageDialog(null,"The hypotenuse is " + hyp);
	}

}
