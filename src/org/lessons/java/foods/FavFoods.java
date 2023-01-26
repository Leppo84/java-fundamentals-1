package org.lessons.java.foods;

public class FavFoods {
	public static void main(String[] args) {

		String[] favFoods = { "Pansoti", "Pizza", "Hamburger", "Kebap", "Focaccia" };
		System.out.println(favFoods.length);
		System.out.println("Il mio cibo preferito è: " + favFoods[0]);
		System.out.println("Il mio cibo preferito ma non troppo è: " + favFoods[4]);
		System.out.println("Il mio cibo semi-preferito è: " + favFoods[favFoods.length / 2]);
	}
}
