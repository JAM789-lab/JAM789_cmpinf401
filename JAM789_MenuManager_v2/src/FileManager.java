import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
	 * Class FileManager
 	 * @author : Jason Mertz
	 * @created: 10/18/2022
	 */

public class FileManager {
	
	public static ArrayList<Entree> readEntrees(String fileName) {
		/**
		* Method calculate
		* @param fileName a String for reading a file
		* @return ArrayList<Entree> named ent
		*/

		ArrayList<Entree> ent = new ArrayList<Entree>();
		
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
		while((line = br.readLine()) != null) {
			//System.out.println(line);
			String[] temp = line.split("@@");
			//System.out.println(temp[0]);
			ent.add(new Entree(temp[0],temp[1],Integer.parseInt(temp[2])));
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
		
		return ent;
	}
	
	public static ArrayList<Side> readSides(String fileName){
		/**
		* Method calculate
		* @param fileName a String for reading a file
		* @return ArrayList<Side> named sid
		*/
		
		ArrayList<Side> sid = new ArrayList<Side>();
		
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
		while((line = br.readLine()) != null) {
			//System.out.println(line);
			String[] temp = line.split("@@");
			//System.out.println(temp[0]);
			sid.add(new Side(temp[0],temp[1],Integer.parseInt(temp[2])));
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
		
		return sid;
	}
	
	public static ArrayList<Salad> readSalads(String fileName){
		/**
		* Method calculate
		* @param fileName a String for reading a file
		* @return ArrayList<Salad> named sal
		*/
		
		ArrayList<Salad> sal = new ArrayList<Salad>();
		
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
		while((line = br.readLine()) != null) {
			//System.out.println(line);
			String[] temp = line.split("@@");
			//System.out.println(temp[0]);
			sal.add(new Salad(temp[0],temp[1],Integer.parseInt(temp[2])));
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
		
		return sal;
	}
	
	public static ArrayList<Dessert> readDesserts(String fileName){
		/**
		* Method calculate
		* @param fileName a String for reading a file
		* @return ArrayList<Dessert> named des
		*/
		
		ArrayList<Dessert> des = new ArrayList<Dessert>();
		
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
		while((line = br.readLine()) != null) {
			//System.out.println(line);
			String[] temp = line.split("@@");
			//System.out.println(temp[0]);
			des.add(new Dessert(temp[0],temp[1],Integer.parseInt(temp[2])));
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
		
		return des;
	}
}
