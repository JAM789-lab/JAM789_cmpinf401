
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circ = new Circle();
		Cylinder cyl = new Cylinder();
		Staff sta = new Staff("John", "106", 500);
		sta.setSchool("Bug");
		
		System.out.println(circ.getArea());
		System.out.println(cyl.getVolume());
		System.out.println(cyl.getColor());
		System.out.println(sta.toString());
	}

}
