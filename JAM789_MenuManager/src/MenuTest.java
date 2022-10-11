
/**
 * Class MenuTest
 * @author Jason Mertz
 * created: 09/30/22
 */

public class MenuTest {

	public static void main(String[] args) {
		//Creating objects for Menus
		Entree gumbo = new Entree("Seafood Gumbo", "Traditional Southern gumbo with shrimp, blue crab and flavorful andouille sausage.", 150);
		Entree chicken = new Entree("Southern Fried Chicken Tenders", "Fresh hand-breaded chicken tenders fried crisp, with barbeque and honey mustard dipping sauces.", 200);
		Side fruit = new Side("Fruit Cup", "Mix of strawberries, blueberries, and honeydew.", 50);
		Salad strawberry = new Salad("Strawberry", "Grilled chicken breast, fresh farmers' market greens, strawberries, caramelized pecans, bleu cheese crumbles, and honey vinaigrette.", 150);
		Salad caprese = new Salad("Caprese Salad", "Ripe tomato with fresh mozzarella and basil.", 150);
		Dessert bark = new Dessert("Peppermint Bark", "Peppermint and chocolate bark.", 50);
		
		//Creating menus
		Menu test1 = new Menu("Test 1", gumbo, fruit);
		Menu test2 = new Menu("Test 2", chicken, fruit, strawberry, bark);
		
		System.out.println(test1.getName() + "\n" + test1.description() + test1.totalCalories());
		System.out.println(test2.getName() + "\n" + test2.description() + test2.totalCalories());
		
	}

}
