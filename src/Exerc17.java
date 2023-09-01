public class Exerc17
{
	public static void main(String[] args)
	{
		int A, B;
		A = 10;
		B = 8;
		if (A > 10 || A + B == 20)
		{
			System.out.println("Numero valido");
		}
		else
		{
			if (A == B)
			{
				System.out.println("A igual B");
			}
			else
			{
				if (A < 10 && B != 10)
				{
					System.out.println("A menor que 10");
				}
				else
				{
					System.out.println("Numero nao valido");
				}
			}
		}
	}
}