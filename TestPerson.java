import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestPerson 
{
  public static void main(String[] paramArrayOfString) 
  {
	Scanner s = new Scanner(System.in);
	  
    String str1 = "Montgomery";
    String str2 = "Scott";
    Person person1 = new Person(str1, str2);
    Person person2 = new Person("Hikaru", "Sulu");
    Person person3 = new Person("Pavel", "Chekov");
    RegisteredPerson registeredPerson1 = new RegisteredPerson("James", "Kirk", "SF00001");
    RegisteredPerson registeredPerson2 = new RegisteredPerson(person1, "ABCDEFG");
    OCCCPerson oCCCPerson1 = new OCCCPerson(registeredPerson1, "SF43434");
    OCCCPerson oCCCPerson2 = new OCCCPerson(new RegisteredPerson(person3, "FED9999"), "SF9999");
    Person person4 = new Person("Leonard", "McCoy");
    System.out.println(" P1 is : " + person1.toString());
    System.out.println(" P2 is : " + person2.toString());
    System.out.println("RP1 is : " + registeredPerson1.toString());
    System.out.println("RP2 is : " + registeredPerson2.toString());
    System.out.println("OP1 is : " + oCCCPerson1.toString());
    System.out.println("OP2 is : " + oCCCPerson2.toString());
    person4.eat();
    
    System.out.println("\nInitial test phase complete. Now for you, the user, to test the program!");
    System.out.println("To create a Person, Registered Person, or OCCC Person, please type 1, 2, or 3, respectively: ");
    String userObject = s.nextLine();
    
    if(userObject.equalsIgnoreCase("1")) 
    {
    	System.out.println("\nNow enter the first and last name of your Person, respectively: ");
    	String userFName = s.nextLine();
    	String userLName = s.nextLine();
    	Person userPerson = new Person(userFName, userLName);
    	System.out.println("Your Person: " + userPerson.toString());
    }
    else if (userObject.equalsIgnoreCase("2")) 
    {
    	System.out.println("\nNow enter the first name, last name and government ID of your Registered Person, respectively: ");
    	String userFName = s.nextLine();
    	String userLName = s.nextLine();
    	String userGovID = s.nextLine();
    	RegisteredPerson userRegisteredPerson = new RegisteredPerson(userFName, userLName, userGovID);
    	System.out.println("Your Registered Person: " + userRegisteredPerson.toString());
    }
    else if(userObject.equalsIgnoreCase("3")) 
    {
    	System.out.println("\nNow enter the first name, last name, government ID and student ID of your OCCC Person, respectively: ");
    	String userFName = s.nextLine();
    	String userLName = s.nextLine();
    	String userGovID = s.nextLine();
    	String userStudentID = s.nextLine();
    	RegisteredPerson p = new RegisteredPerson(userFName, userLName, userGovID);
    	OCCCPerson userOCCCPerson = new OCCCPerson(p, userStudentID);
    	System.out.println("Your OCCC Person: " + userOCCCPerson.toString());
    }
    else 
    {
    	System.out.println("\nInvalid input. exiting...");
    	System.exit(0);
    }
  }
}
