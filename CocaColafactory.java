class CocaColaFactory extends AbstractFactory
{
	public AbstractWater CreateWater()
	{
		retutn new CocaColaWater();
	}
	public AbstractBottle CreateBottle()
	{
		retutn new CocaColaBottle();
	}
}