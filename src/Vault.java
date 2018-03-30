// James Bond is trying to crack a vault.

// 1. We need a Vault object that contains a secret code. It also contains a tryCode() method that takes a number as a parameter 
// and returns true if that number opens the vault, false otherwise.

// 2. Test your vault object using a main method.

// 3. Make a James Bond class that has a method findCode() that takes a Vault as a parameter. 
// The codes are between 0 and 1 million. This method tries all the codes, and returns the first code that opens the vault, or -1 if no code opened the vault.

// 4. Test your code by instantiating the JamesBond and Vault classes.

// 5. Add a constructor for Vault so that you can easily set the secret code.

// Note to teacher:
// 1. Draw UML diagrams of the classes
// 2. Get the students to figure out the method signatures 
// 3. Then start coding

// UML DIAGRAMS:

// Vault
// ____________________
// -secretCode: int
// ____________________
// +tryCode(guess: int): boolean

// JamesBond
// ____________________
// +findCode(aVault: Vault): int

public class Vault {
	private int secretCode;
	
	public Vault(int setCode) 
	{
		this.secretCode = setCode;
	}
	
	boolean tryCode(int guess)
	{
		if (guess == secretCode)
		{
			System.out.println("You guessed the code!");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Vault myVault = new Vault(3241);
		JamesBond jb = new JamesBond();
		jb.findCode(myVault);
	}
}
