class PepsiBottle extends AbstractBottle
{
	public void Interact(AbstractWater water)
	{
		Console.Writeline(this + " interacts with " + water);
	}
}