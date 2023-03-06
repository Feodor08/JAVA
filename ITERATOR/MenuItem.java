public class MenuItem {
	String name;
	String description;
	boolean vegeterian;
	double price;

	public MenuItem(String name,
	String description,
	boolean vegeterian,
	double price)
	{
		this.name = name;
		this.description = description;
		this.vegeterian = vegeterian;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public String getVegeterian() {
		return vegeterian;
	}

	public String getPrice() {
		return price;
	}
}