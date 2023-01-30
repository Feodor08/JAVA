class Program
{
	static void Main()
	{
		Creator creator = nul;
		Product product = null;

		creator = new ConcreteCreator();
		product = creator.FactoryMethod();

		creator.AnOperation();
	}
}