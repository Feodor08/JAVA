public class CoffeeWithHook extends CaffeinBeverageWithHook {
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	public void addCondiments() {
		System.out.println("Addng Sugar and Milk");
	}

	public boolean customerWantsCondiments() {
		String answer = getUserInput();

		if (answer.toLowerCase().startWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;

		System.out.println("Would you like milk and sugar with your coffee (y/n? ");

		BufferedReader in = new BufferedReader (new InputStraemReader(System.in));
		try {
			answer = in.readline();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}