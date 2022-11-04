
/**
 * Class Menu
 * @author Jason Mertz
 * created: 09/30/22
 */

public class Menu {
	//Declaring variables
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	//Initializing different versions of object
	public Menu(String name) {
		this.name = name;
		entree = null;
		side = null;
		salad = null;
		dessert = null;

	}
	
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		salad = null;
		dessert = null;
	}
	
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	
	//Calculating total calories
	public int totalCalories() {
		int cal = 0;
		
		if(!(entree == null)) {
			cal += entree.getCalories();
		}
		if(!(side == null)) {
			cal += side.getCalories();
		}
		if(!(salad == null)) {
			cal += salad.getCalories();
		}
		if(!(dessert == null)) {
			cal += dessert.getCalories();
		}
				
		return cal;
	}
	
	//Forming description
	public String description() {
		String desc = "";
		
		//Adds name of menu to description (keep commented if name is meant to be added somewhere else
		//desc += name + "\n";
		
		if(!(entree == null)) {
			desc += "Entree: " + entree.getName() + ". " + entree.getDescription() + "\n";
		}else {
			desc += "Entree: N/A\n";
		}
		if(!(side == null)) {
			desc += "Side: " + side.getName() + ". " + side.getDescription() + "\n";
		}else {
			desc += "Side: N/A\n";
		}
		if(!(salad == null)) {
			desc += "Salad: " + salad.getName() + ". " + salad.getDescription() + "\n";
		}else {
			desc += "Salad: N/A\n";
		}
		if(!(dessert == null)) {
			desc += "Dessert: " + dessert.getName() + ". " + dessert.getDescription() + "\n";
		}else {
			desc += "Dessert: N/A\n";
		}
		
		return desc;
	}
}
