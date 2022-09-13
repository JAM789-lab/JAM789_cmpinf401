import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input, unit, con;
		String[] test;
		double dInput;
		
		input = JOptionPane.showInputDialog("Input either a distance or weight amount (be sure to include units):");
		test = input.split(" ", 2);
		dInput = Double.parseDouble(test[0]);
		unit = test[1];
		
		con = converter(dInput, unit);
		
		JOptionPane.showMessageDialog(null, dInput + " " + unit + " = " + con);
		
	}
	public static String converter(double val, String nUnit) {
		int r;
		String convert = "";
		
		if(nUnit.equalsIgnoreCase("cm")) {
			val /= 2.54;
			nUnit = "in";
		}else if(nUnit.equalsIgnoreCase("in")) {
			val *= 2.54;
			nUnit = "cm";
		}else if(nUnit.equalsIgnoreCase("yd")) {
			val /= 1.094;
			nUnit = "m";
		}else if(nUnit.equalsIgnoreCase("m")) {
			val *= 1.094;
			nUnit = "yd";
		}else if(nUnit.equalsIgnoreCase("oz")) {
			val *= 28.35;
			nUnit = "gm";
		}else if(nUnit.equalsIgnoreCase("gm")) {
			val /= 28.35;
			nUnit = "oz";
		}else if(nUnit.equalsIgnoreCase("lb")) {
			val /= 2.205;
			nUnit = "kg";
		}else if(nUnit.equalsIgnoreCase("kg")) {
			val *= 2.205;
			nUnit = "lb";
		}
		val *= 100;
		r = (int) Math.round(val);
		val = r/100.0;
		
		convert = val + " " + nUnit;
		return convert;
	}
	
}
