import java.util.ArrayList;

/**
 * Class MenuManager
 * @author : Jason Mertz
 * @created: 11/15/2022
 */

public class MenuManager {
	private ArrayList<Entree> entrees = new ArrayList<Entree>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}

	public MenuManager(String dishesFile) {
		/**
		* Method MenuManager
		* @param dishesFile a String for accessing dishes.txt
		*/
		
		ArrayList<MenuItem> menu;
		menu = FileManager.readItems(dishesFile);
		//System.out.println(menu.get(0));

		for(MenuItem item: menu) {
			if(item instanceof Entree) {
				entrees.add((Entree) item);
				//System.out.println("MenuManager55: " + item + " is an Entree");
				//System.out.println(item.getClass());

			}else if(item instanceof Side) {
				sides.add((Side) item);
				//System.out.println("MenuManager59: " + item + " is an Side");

			}else if(item instanceof Salad) {
				salads.add((Salad) item);
				//System.out.println("MenuManager63: " + item + " is an Salad");

			}else if(item instanceof Dessert) {
				desserts.add((Dessert) item);
				//System.out.println("MenuManager67: " + item + " is an Dessert");

			}
		}

	}

	public Menu randomMenu(String name) {
		/**
		* Method randomMenu
		* @param name a String for naming the random menu
		* @return Menu item using random Entree, Side, Salad, and Dessert items
		*/

		Entree ent = entrees.get((int)(Math.random() * entrees.size()));
		Side sid = sides.get((int)(Math.random() * sides.size()));
		Salad sal = salads.get((int)(Math.random() * salads.size()));
		Dessert des = desserts.get((int)(Math.random() * desserts.size()));

		return new Menu (name, ent, sid, sal, des);
	}



	public Menu minCaloriesMenu(String name) {
		/**
		* Method minCaloriesMenu
		* @param name a String for naming the minCalories menu
		* @return Menu item using lowest calorie Entree, Side, Salad, and Dessert items
		*/

		Entree ent = entrees.get(0);
		Side sid = sides.get(0);
		Salad sal = salads.get(0);
		Dessert des = desserts.get(0);

		for(Entree current : entrees) {
			if(current.getCalories() < ent.getCalories()) {
				ent = current;
			}
		}

		for(Side current : sides) {
			if(current.getCalories() < sid.getCalories()) {
				sid = current;
			}
		}

		for(Salad current : salads) {
			if(current.getCalories() < sal.getCalories()) {
				sal = current;
			}
		}

		for(Dessert current : desserts) {
			if(current.getCalories() < des.getCalories()) {
				des = current;
			}
		}

		return new Menu(name, ent, sid, sal, des);
	}

	public Menu maxCaloriesMenu(String name) {
		/**
		* Method maxCaloriesMenu
		* @param name a String for naming the maxCalories menu
		* @return Menu item using highest calorie Entree, Side, Salad, and Dessert items
		*/

		Entree ent = entrees.get(0);
		Side sid = sides.get(0);
		Salad sal = salads.get(0);
		Dessert des = desserts.get(0);

		for(Entree current : entrees) {
			if(current.getCalories() > ent.getCalories()) {
				ent = current;
			}
		}

		for(Side current : sides) {
			if(current.getCalories() > sid.getCalories()) {
				sid = current;
			}
		}

		for(Salad current : salads) {
			if(current.getCalories() > sal.getCalories()) {
				sal = current;
			}
		}

		for(Dessert current : desserts) {
			if(current.getCalories() > des.getCalories()) {
				des = current;
			}
		}

		return new Menu(name, ent, sid, sal, des);
	}


}
