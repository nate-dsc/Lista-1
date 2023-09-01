public class Exerc04
{
	public static void main(String[] args)
	{
		int A, B;
		A = 6;
		B = 15;
		if (A > 10 || A + B == 20)
		{
			System.out.println("Numero valido");
		}
		else
		{
			if (A == B)
			{
				System.out.println("A igual a B; A e B diferentes de 10; A < 10");
			}
			else
			{
				System.out.println("Numero nao valido");
			}
		}
	}
}