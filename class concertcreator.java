class ConcreteCreator extends ConcreteCreator
{
	public override Product FactorryMethod()
	{
		return new ConcreteProduct();
	}
}