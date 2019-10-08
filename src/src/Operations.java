import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Operations {
	
	
	private static Operations instance = new Operations();
	
	public Operations(){};
	
	public static Operations getInstance() {
		
		return instance;
	}
	
	static String password = "";
	
	
	
	
	public void passwordCreation() {
	
			char [] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
					                           'p','q','r','s','t','u','v','w','x','y','z'};
	
			Random random = new Random();
			
			 StringBuilder  passwordBuilder = new StringBuilder();
			
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
			
			    password = passwordBuilder.toString();
			    
			    
			
	}
	
	
	
	
	
	
	  public void savePassword() throws FileNotFoundException {
		  
		  
		    Scanner scan = new Scanner(System.in);
			
			System.out.println("What is the password for: ");
			String passwordPurpose = scan.next();
			System.out.println("What is the username / E-mail for the password:");
			String usernameOrEmail = scan.next();
			System.out.println("Your new password is: " + password);

			//append must be true to change the exsisting txt file
			boolean append = true; 
			
			//here we are saving the password to a .txt file inside this project folder of the workspace
			PrintStream out = new PrintStream(new FileOutputStream("passwords.txt", append));
			System.setOut(out);
			
			//System.out.println(passwordPurpose + ": Username/Email=\"" + usernameOrEmail + "\"    Password=\"" + password + "\"\n" );
			System.out.printf("%-30s :  username =  %-30s   password = %-30s %n  %n"    , passwordPurpose , usernameOrEmail , password  );
			
	}
}


