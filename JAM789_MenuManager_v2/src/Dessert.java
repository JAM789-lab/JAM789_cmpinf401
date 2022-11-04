
/**
 * Class Dessert
 * @author Jason Mertz
 * created: 09/30/22
 */

public class Dessert {
	//Declaring variables
	private String name;
	private String description;
	private int calories;
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	//Initializing object
	public Dessert(String name, String desc, int cal) {
		this.name = name;
		this.description = desc;
		this.calories = cal;
	}
}
