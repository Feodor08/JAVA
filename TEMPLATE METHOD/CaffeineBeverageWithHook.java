public abstarct class CaffeineBeverageWithHook {

	final void prepareRecipe () {
		boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
        	addCondiments();
        }
	}

	abstarct void brew();

	abstarct void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}

	boolean customerWantsCondiments() {
		return true;
	}
}