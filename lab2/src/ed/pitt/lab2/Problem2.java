package ed.pitt.lab2;

import javax.swing.JOptionPane;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dRad, area, peri;
		String rad;
		
		rad = JOptionPane.showInputDialog("Input the radius of your circle:");
		
		dRad = Double.parseDouble(rad);
		
		peri = (Math.PI * 2 * dRad);
		peri *= 100;
		int r1 = (int) Math.round(peri);
		peri = r1/100.0;
		
		area = (Math.PI * dRad * dRad);
		area *= 100;
		int r2 = (int) Math.round(area);
		area = r2/100.0;
		
		
		JOptionPane.showMessageDialog(null, "The circle with radius " + dRad + " has an area of " + area + " and a perimeter of " + peri);

	}

}
