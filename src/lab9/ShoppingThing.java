package lab9;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ShoppingThing {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		boolean done = false;
		double price = 0;

//		how to set up a map
		Map<String, Double> cart = new TreeMap<>();
		Map<String, Double> food = new TreeMap<>();

//		items in out map
		food.put("rice", 350.0);
		food.put("bagel", 5.99);
		food.put("egg", 19.99);
		food.put("bread", 19.99);
		food.put("chicken", 5.99);
		food.put("steak", 19.99);
		food.put("cereal", 2.99);
		food.put("bananna", 1.99);

		System.out.println("Welcome to the super market!");
		display1(food);
		System.out.println("What would you like?");
		
		String choice = scnr.next().toLowerCase();
		cart.putAll(getPrice(choice,price,food));
		
		while(!done) {
			price = 0;
			System.out.println("Your shopping cart so far:");
			System.out.println("==========================");
			
			for (String key : cart.keySet()) {
				System.out.println(key + " $" + cart.get(key));
				price += cart.get(key);
				
			}
			System.out.println("-------------------");
			System.out.println("Your total so far: " + price);
			System.out.println("-------------------");
			
			System.out.println("What else would you like to add or type 'done' to finish: ");
			choice = scnr.next().toLowerCase();
			
			if(choice.equals("done")) {
				done = true;
			}else if(!choice.equals("rice") && !choice.equals("bagel") && !choice.equals("egg") && !choice.equals("bread") 
					&& !choice.equals("chicken") && !choice.equals("steak") && !choice.equals("cereal") && !choice.equals("bananna")) {
				System.out.println("Sorry we don't have that item, try again");
			} else {
				cart.putAll(getPrice(choice,price,food));
			}

			
		}
		
		
		
		
		
	}

	public static void display1(Map<String, Double> m) {
//		loop through and print each
		System.out.println("Item ==== Price");
		System.out.println("================");
		for (String key : m.keySet()) {
			System.out.println(key + " $" + m.get(key));
		}

	}
	
	public static Map<String, Double> getPrice(String a, double price, Map<String, Double> m){
		
		Map<String, Double> total = new TreeMap<>();
		
		if(a.equals("rice")) {
			total.put("rice", m.get("rice"));
			
		} else if(a.equals("bagel")) {
			total.put("bagel", m.get("bagel"));
		
		} else if(a.equals("egg")) {
			total.put("egg", m.get("egg"));
		
		} else if(a.equals("bread")) {
			total.put("bread", m.get("bread"));
		
		} else if(a.equals("chicken")) {
			total.put("chicken", m.get("chicken"));
		
		} else if(a.equals("steak")) {
			total.put("steak", m.get("steak"));
		
		} else if(a.equals("cereal")) {
			total.put("cereal", m.get("cereal"));
		
		} else if(a.equals("bananna")) {
			total.put("bananna", m.get("bananna"));
		
		}
		
		return total;
		
	}
	
}

//1 map for the menu
//2 array list for the price and food items
