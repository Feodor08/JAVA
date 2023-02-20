public house {
	WeaterStation station;

	// Другие методы и конструктор

	public float getTemp() {
		return station.getThermometer().getTemperature();
	}
}
