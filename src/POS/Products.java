package POS;

import java.text.NumberFormat;

public class Products {
	private String name;
	private String category;
	private String description;
	private double price;

	// create a constructor to instiate the fields
	public Products(String name, String category, String description, double price) {
		super();
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
	}

	// Create the setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// a custom get accessor for the price variable
	public String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}

	@Override
	public String toString() {
		return name + " " + category + " " + description + " " + price;
	}

}
