import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class FileManager
 * @author : Jason Mertz
 * @created: 10/18/2022
 */

public class FileManager {

	public static ArrayList<MenuItem> readItems(String fileName){
		ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
				//System.out.println(line);
				String[] temp = line.split("@@");
				//System.out.println(temp[0]);
				if(temp[1].equalsIgnoreCase("entree")) {
					menu.add(new Entree(temp[0],temp[2],Integer.parseInt(temp[3]), Double.parseDouble(temp[4])));
				}else if(temp[1].equalsIgnoreCase("side")) {
					menu.add(new Side(temp[0],temp[2],Integer.parseInt(temp[3]), Double.parseDouble(temp[4])));
				}else if(temp[1].equalsIgnoreCase("salad")) {
					menu.add(new Salad(temp[0],temp[2],Integer.parseInt(temp[3]), Double.parseDouble(temp[4])));
				}else if(temp[1].equalsIgnoreCase("dessert")) {
					menu.add(new Dessert(temp[0],temp[2],Integer.parseInt(temp[3]), Double.parseDouble(temp[4])));
				}
				//System.out.println(entrees.get(0));
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return menu;
	}

	public static void writeMenu(String fileName, ArrayList<Menu> menus ) {
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);

			for(Menu menu : menus) {
				bw.write(menu.getName() + "\n");
				bw.write("Entree: " + menu.getEntree().getName() + ", " + menu.getEntree().getDescription() + ", " + menu.getEntree().getCalories() + ", $" + String.format("%.2f",menu.getEntree().getPrice()) + "\n");
				bw.write("Side: " + menu.getSide().getName() + ", " + menu.getSide().getDescription() + ", " + menu.getSide().getCalories() + ", $" + String.format("%.2f",menu.getSide().getPrice()) + "\n");
				bw.write("Salad: " + menu.getSalad().getName() + ", " + menu.getSalad().getDescription() + ", " + menu.getSalad().getCalories() + ", $" + String.format("%.2f",menu.getSalad().getPrice()) + "\n");
				bw.write("Dessert: " + menu.getDessert().getName() + ", " + menu.getDessert().getDescription() + ", " + menu.getDessert().getCalories() + ", $" + String.format("%.2f",menu.getDessert().getPrice()) + "\n\n");

				bw.write("Total Calories: " + (menu.getEntree().getCalories() + menu.getSide().getCalories() + menu.getSalad().getCalories() + menu.getDessert().getCalories()) + "\n");
				bw.write("Total Price: $" + String.format("%.2f",(menu.getEntree().getPrice() + menu.getSide().getPrice() + menu.getSalad().getPrice() + menu.getDessert().getPrice())) + "\n\n");

			}

			bw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
