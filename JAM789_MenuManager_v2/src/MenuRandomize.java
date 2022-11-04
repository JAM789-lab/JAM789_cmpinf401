import java.util.ArrayList;

/**
	 * Class MenuRandomize
 	 * @author : Jason Mertz
	 * @created: 10/18/2022
	 */
public class MenuRandomize {
	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();
	
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		/**
		* Method MenuRandomize
		* @param entreeFile a String for accessing entrees.txt 
		* @param sideFile a String for accessing sides.txt
		* @param saladFile a String for accessing salads.txt
		* @param dessertFile a String for accessing desserts.txt
		*/

		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
		
	}
	
	public Menu randomMenu() {
		/**
		* Method randomMenu
		* @return new Menu(Sting, Entree, SIde, Salad, Dessert)
		*/

		Entree ent = entrees.get((int)(Math.random() * entrees.size()));
		Side sid = sides.get((int)(Math.random() * sides.size()));
		Salad sal = salads.get((int)(Math.random() * salads.size()));
		Dessert des = desserts.get((int)(Math.random() * desserts.size()));
		
		return new Menu("Random Menu", ent, sid, sal, des);
	}

}
