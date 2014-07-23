package com.example.model;

//do jest dao bo ma metodê getTypes na podstawie  taste

import java.util.ArrayList;
import java.util.List;

public class CoffeeExpert {
	public List<String> getTypes(String taste) {
		List<String> result = new ArrayList<String>();
		if (taste.equals("milky")) {
			result.add("Latte");
			result.add("Cappuccino");
		} else if (taste.equals("froffy")) {
			result.add("Latte");
			result.add("Cappuccino");
			result.add("Frappuccino");
		} else if (taste.equals("icey")) {
			result.add("Frappuccino");
		} else if (taste.equals("strong")) {
			result.add("Espresso");
			result.add("Double espresso");
		} else {
			result.add("Vending machine");
		}
		return (result);
	}
}
