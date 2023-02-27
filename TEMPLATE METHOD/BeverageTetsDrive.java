public class BeverageTeatDrive {
	public static void main(String[] args) {

		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook CoffeeHook = new CoffeeWithHook();

		System.out.println("\nMaking tea...");
		teaHook.preparePecipe();

		System.out.println("\nMaking Coffee...");
		coffeeHook.preparePecipe();
	}
}