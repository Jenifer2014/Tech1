package condition_statment;

public class if_else {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		String browser="IE";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Successfully Opened Chrome Browser");
		}
		else
		{
			System.out.println("Failed");
		}
		
		System.out.println("Program Ended");
	}

}
