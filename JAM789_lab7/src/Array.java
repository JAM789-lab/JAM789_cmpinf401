import java.util.Random;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		String input;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many items should be added to the array?: ");
		input = scan.nextLine();
		size = Integer.parseInt(input);
		
		double[] array = new double[size];
		for(int i = 0; i < size; i++) {
			array[i] = rand.nextDouble();
			System.out.println(array[i]);
		}
		System.out.println("Maximum Value: " + max(array));
		System.out.println("Minimum Value: " + min(array));
		System.out.println("Sum of Values: " + sum(array));
		System.out.println("Average of Values: " + ave(array));

		scan.close();
	}
	
	public static double max(double[] data) {
		double max = 0;
		
		for(int i = 0; i < data.length; i++) {
			if(i == 0) {
				max = data[0];
			}else if(data[i] > max) {
				max = data[i];
			}
		}
		
		return max;
	}
	
	public static double min(double [] data) {
		double min = 0;
		
		for(int i = 0; i < data.length; i++) {
			if(i == 0) {
				min = data[0];
			}else if(data[i] < min) {
				min = data[i];
			}
		}
		
		return min;
	}
	
	public static double sum(double [] data) {
		double sum = 0;
		
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		
		return sum;
	}
	
	public static double ave(double [] data) {
		double sum = 0;
		double ave;
		
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		
		ave = sum / data.length;
		
		return ave;
	}

}
