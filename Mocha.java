public class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescrition() {
		return beverage.getDescrition() + ", Mocha";
	}
	public double cost() {
		return .20 + beverage.cost();
	}
}