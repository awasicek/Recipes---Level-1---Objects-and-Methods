
public class JamesBond {

	// Make a James Bond class that has a method findCode() that takes a Vault as a parameter. 
	// The codes are between 0 and 1 million. This method tries all the codes, and returns the first code that opens the vault, or -1 if no code opened the vault.
	int findCode(Vault aVault)
	{
		for(int i = 0; i <= 1000000; i++)
		{
			if(aVault.tryCode(i))
			{
				System.out.println("James Bond figured out that the code was " + i + ".");
				return i;
			}
		}
		return -1;
	}
}
