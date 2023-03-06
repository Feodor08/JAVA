public class PancakeHoeseMenu {
	ArrayList menuItems;

	public PancakeHoeseMenu() {
		menuItems = new ArrayList();

		addItem("K&B's Pancacke Breakfast", "Pancacke with scrambled eggs, and toast", true, 2.99);

		addItem("Regular Pancacke Breakfast", "Pancackes with fried eggs, sausage", false, 2.99);

		addItem("Blueberry Pancacke", "Pancackes made with fresh blueberries", true, 3.49);

		addItem("Waffles", "Waffles, with your choice of blueberries or stawberries", true, 3.59);
	}
	public void addItem(String name, String description, boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public ArrayList getMenuItems(){
		return menuItems;
	}
}