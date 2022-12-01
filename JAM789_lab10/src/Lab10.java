
public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {1,2,3,4,5};
		
	}

	//Task 1
	int sumOfDigits(int x) {
		int temp;
		if(x >= 0 && x <= 9) {
			temp = x;
		} else {
			temp = (x % 10) + sumOfDigits(x / 10);
		}
		return temp;
	}

	//Task 2
	void printArrayElements(int a[], int index) {
		if(index == a.length) {
			return;
		}
		System.out.println(a[index]);
		printArrayElements(a, index + 1);
	}

	//Task 3
	public static void printCombos(int[] a, String out, int startIndex, int k) {
		
	}

}
