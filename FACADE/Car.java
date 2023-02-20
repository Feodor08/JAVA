public class Car {
	Engine engine;
	//ther instance variables

	public Car() {
		//Инициализация
	}

	public void start(Key key) {
		Doors doors = new Doors();

		boolean authorized = key.turns();

		if (authorized) {
			engine.start();
			updateDashboardDisplay();
			doors.lock();

		}
	}

	public void updateDashboardDisplay() {
		//Перерисовка экрана
	}
}