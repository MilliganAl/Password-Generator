import java.util.Random;

public class Operations {
	
	public void passwordCreation() {
	
		
			
			char [] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
					                           'p','q','r','s','t','u','v','w','x','y','z'};
			
			
			StringBuilder passwordBuilder = new StringBuilder();
			
			
			Random random = new Random();
			
			//Adding the letters.
			for ( int i = 0 ; i < 10 ; i++ ) {
				
				int randomLetter = random.nextInt(26);
				passwordBuilder.append(letters[randomLetter]);
				
			}
			
			//adding the numbers to our password at a random index.
			for ( int i = 0 ; i < 2 ; i++ ) {
				
				int randomNumber = random.nextInt(1000);
				int randomIndex = random.nextInt(10);
				String numbers = Integer.toString(randomNumber);
				
				passwordBuilder.insert(randomIndex,numbers);
			
			}
			
			//Adding capitalized letters.
			for ( int i = 0 ; i < 4 ; i++ ) {
				
				int randomCaps = random.nextInt(26);
				int randomIndex = random.nextInt(10);
				
				char capLetters = letters[randomCaps];
				
				String capLettersInString = Character.toString(capLetters).toUpperCase();
				
				passwordBuilder.insert(randomIndex , capLettersInString);
				
			}
			
			String password = passwordBuilder.toString();
			
		   
			
			System.out.println("New Password: " + password);
			
	}
}


