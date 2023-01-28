class Program
{
	public static void Main()
	{
		Client client = null;

		client = New Client(new CocaColaFactory());
		client.Run();

	    client = New Client(new PepsiFactory());
		client.Run();
	}
}