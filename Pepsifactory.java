class PepsiFactory extends AbstractFactory
{
	public AbstractWater CreateWater()
	{
		retutn new PepsiWater();
	}
	public AbstractBottle CreateBottle()
	{
		retutn new PepsiBottle();
	}
}