import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String userInput = "";

        initializeDogList();
        initializeMonkeyList();
    	
        while (!(userInput.equalsIgnoreCase("q"))) {  // Loop until input is q
        	displayMenu();  // Show menu options
        	userInput = scanner.next();  // Input to choose menu option
        	switch (userInput) {  // Conditional to instruct program how to respond appropriately to input
        		case "1":
        			intakeNewDog(scanner);
        			break;
        			
        		case "2":
        			intakeNewMonkey(scanner);
        			break;
        			
        		case "3":
        			reserveAnimal(scanner);
        			break;
        			
        		case "4":
        			printAnimals(userInput);
        			break;
        			
        		case "5":
        			printAnimals(userInput);
        			break;
        			
        		case "6":
        			printAnimals(userInput);
        			break;
        			
        		case "q":
        			System.out.print("\n\nQuitting... goodbye!\n\n");
        			break;
        			
        		// Input validation, handles all cases that aren't 1-6 or q	
        		default:
        			System.out.println("Invalid input.");
        			break;
        	}
        }    
    }

    // This method prints the menu options
    public static void displayMenu() {
    	System.out.println("\n\n");
    	System.out.println("\t\t\t\t\t *******");
    	System.out.println("\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection:");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "Intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", true, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "In service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Grethel", "Capuchin", "female", "5", "15", "15", "16.7", "20", "06-22-2021", "Brazil", "Phase I", true, "Brazil");
    	Monkey monkey2 = new Monkey("Timothy", "Marmoset", "male", "2", "0.5", "7", "7", "13", "03-17-2021", "Brazil", "In service", false, "Brazil");
    	Monkey monkey3 = new Monkey("Oakley", "Squirrel Monkey", "male", "9", "1.5", "10", "10", "16", "04-09-2021", "Brazil", "In Service", false, "Brazil");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    public static void intakeNewDog(Scanner scanner) {
    	scanner.nextLine();
        System.out.println("What is the dog's name?");
        String dogName = scanner.nextLine();
        for (Dog dog: dogList) {
            if (dog.getName().equalsIgnoreCase(dogName)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //Returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the dog's breed?");
        String dogBreed = scanner.nextLine();
        
        System.out.println("What is the dog's gender?");
        String dogGender = scanner.nextLine();
        
        System.out.println("What is the dog's age?");
        String dogAge = scanner.nextLine();
        
        System.out.println("What is the dog's weight?");
        String dogWeight = scanner.nextLine();
        
        System.out.println("What is the dog's acquisition date?");
        String dogAcquisitionDate = scanner.nextLine();
        
        System.out.println("What is the dog's acquisition country?");
        String dogAcquisitionCountry = scanner.nextLine();
        
        System.out.println("What is the dog's training status?");
        String dogTrainingStatus = scanner.nextLine();
        
        System.out.println("What is the dog's reserved status?");
        boolean dogReserved = scanner.nextBoolean();
        
        System.out.println("What is the dog's service country?");
        String dogInServiceCountry = scanner.nextLine();
        
        //Create new instance of Dog
        Dog nextDog = new Dog(dogName, dogBreed, dogGender, dogAge, dogWeight, dogAcquisitionDate, 
        					  dogAcquisitionCountry, dogTrainingStatus, dogReserved, dogInServiceCountry);
        
        dogList.add(nextDog);
    }

    public static void intakeNewMonkey(Scanner scanner) {
    	scanner.nextLine();
    	System.out.println("What is the monkey's name?");
        String monkeyName = scanner.nextLine();
        for (Monkey monkey: monkeyList) {
            if (monkey.getName().equalsIgnoreCase(monkeyName)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return;  // Returns to menu
            }
        }
        
        System.out.println("What is the monkey's species?");
        String monkeySpecies = scanner.nextLine();
        // Input validation to make sure species is eligible
        String[] eligibleSpecies = new String[] {"capuchin", "guenon", "macaque", "marmoset", "squirrel monkey", "tamarin"};
        List<String> list = Arrays.asList(eligibleSpecies);  // Convert Array to ArrayList to use contains() method
        if (!(list.contains(monkeySpecies.toLowerCase()))) {
        	System.out.println("\n\n" + monkeySpecies + " is not an eligible species.\n\n");
        	return;  // Returns to menu
        	}
        
        
        System.out.println("What is the monkey's gender?");
        String monkeyGender = scanner.nextLine();
        
        System.out.println("What is the monkey's age?");
        String monkeyAge = scanner.nextLine();
        
        System.out.println("What is the monkey's weight?");
        String monkeyWeight = scanner.nextLine();
        
        System.out.println("What is the monkey's height?");
        String monkeyHeight = scanner.nextLine();
        
        System.out.println("What is the monkey's body length?");
        String monkeyBodyLength = scanner.nextLine();
        
        System.out.println("What is the monkey's tail length?");
        String monkeyTailLength = scanner.nextLine();
        
        System.out.println("What is the monkey's acquisition date?");
        String monkeyAcquisitionDate = scanner.nextLine();
        
        System.out.println("What is the monkey's acquisition country?");
        String monkeyAcquisitionCountry = scanner.nextLine();
        
        System.out.println("What is the monkey's training status?");
        String monkeyTrainingStatus = scanner.nextLine();
        
        System.out.println("What is the monkey's reserved status?");
        boolean monkeyReserved = scanner.nextBoolean();
        
        System.out.println("What is the monkey's service country?");
        String monkeyInServiceCountry = scanner.nextLine();
        
        // Create new instance of Monkey
        Monkey nextMonkey = new Monkey(monkeyName, monkeySpecies, monkeyGender, monkeyAge, monkeyWeight, monkeyHeight, 
        							   monkeyBodyLength, monkeyTailLength, monkeyAcquisitionDate, monkeyAcquisitionCountry, 
        							   monkeyTrainingStatus, monkeyReserved, monkeyInServiceCountry);
        
        monkeyList.add(nextMonkey);
        
    }

    public static void reserveAnimal(Scanner scanner) {
    		scanner.nextLine();
            System.out.println("Enter desired animal type: ");
            String desiredType = scanner.nextLine();
            
            System.out.println("Enter desired country: ");
            String desiredCountry = scanner.nextLine();
            
         // Search list of dogs if dog is desired
            if (desiredType.equalsIgnoreCase("dog")) {
            	boolean availableDog = false;
            	for (Dog dog: dogList) {
            		if ((dog.getInServiceCountry().equalsIgnoreCase(desiredCountry)) && (dog.getReserved() == false)) {
            			dog.setReserved(true);  // Change reservation status
            			System.out.print("\n\nYou have reserved " + dog.getName() + "\n\n");
            			availableDog = true;
            			break;  // Break loop so only first available dog is chosen
            		}
            	}
            	if (availableDog == false) {  // Place outside loop so only prints once
            			System.out.print("\n\nThere are no dogs available for reservation in " + desiredCountry + ".\n\n");
            	}
            }
            
            
            // Search list of monkeys if monkey is desired
            if (desiredType.equalsIgnoreCase("monkey")) {
            	boolean availableMonkey = false;
            	
            	for (Monkey monkey: monkeyList) {
            		if ((monkey.getInServiceCountry().equalsIgnoreCase(desiredCountry)) && (monkey.getReserved() == false)) {
            			monkey.setReserved(true);  // Change reservation status
            			System.out.print("\n\nYou have reserved " + monkey.getName() + "\n\n");
            			availableMonkey = true;
            			break;  // Break loop so only first available monkey is chosen
            		}
            	}
            	if (availableMonkey == false) {  // Place outside loop so only prints once
            			System.out.print("\n\nThere are no monkeys available for reservation in " + desiredCountry + ".\n\n");
            	}
            }
    }

    public static void printAnimals(String listType) {
    	
    	// Print list of all dogs
        if (listType.equals("4")) {
        	System.out.println("\n\n\tDogs at Grazioso Salvare:\n");
        	for (Dog dog: dogList) {  // Iterate over list and print important info
        		System.out.println("\t\t" + dog.getName());
        		System.out.println("\t\t\tTraining Status: " + dog.getTrainingStatus());
        		System.out.println("\t\t\tAcquisition Country: " + dog.getAcquisitionCountry());
        		System.out.println("\t\t\tReserved: " + dog.getReserved() + "\n");
        	}
        }
        
        // Print list of all monkeys
        if (listType.equals("5")) {
        	System.out.println("\n\n\tMonkeys at Grazioso Salvare:\n");
        	for (Monkey monkey: monkeyList) {  // Iterate over list and print important info
        		System.out.println("\t\t" + monkey.getName());
        		System.out.println("\t\t\tTraining Status: " + monkey.getTrainingStatus());
        		System.out.println("\t\t\tAcquisition Country: " + monkey.getAcquisitionCountry());
        		System.out.println("\t\t\tReserved: " + monkey.getReserved() + "\n");
        	}
        }
        
        // Print list of all in service and unreserved animals
        if (listType.equals("6")) {
        	System.out.println("\n\n\tAnimals at Grazioso Salvare: In Service and Unreserved:\n");
        	System.out.println("\t\tDogs:\n");
        	for (Dog dog: dogList) {
        		// Skip dogs that are not fully trained and/or are reserved
        		if ((dog.getTrainingStatus().equalsIgnoreCase("In Service")) && (dog.getReserved() == false)){
        			System.out.println("\t\t\t" + dog.getName());
        			System.out.println("\t\t\t\tBreed: " + dog.getBreed());
        			System.out.println("\t\t\t\tService Country: " + dog.getInServiceCountry() + "\n");
        		}
        	}
        		
    		System.out.println("\t\tMonkeys:\n");
        	for (Monkey monkey: monkeyList) {
        		// Skip monkeys that are not fully trained and/or are reserved
        		if ((monkey.getTrainingStatus().equalsIgnoreCase("In Service")) && (monkey.getReserved() == false)){
        			System.out.println("\t\t\t" + monkey.getName());
        			System.out.println("\t\t\t\tSpecies: " + monkey.getSpecies());
        			System.out.println("\t\t\t\tService Country: " + monkey.getInServiceCountry());
        		}
        	}
        }
    }
}

