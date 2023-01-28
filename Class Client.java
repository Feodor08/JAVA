Class Client
{
	private AbstractWater water;
	private AbstractBottle bottle;

	public Client(AbstractFactory factory)
	{
		water = factory.CreateWater();
		bottle = factory.Createbottle();
	}
	public void Run()
	{
		bottle.Interact(water);
	}
}