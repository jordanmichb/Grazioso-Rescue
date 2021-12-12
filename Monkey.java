


public class Monkey extends RescueAnimal {

    // Instance variable
    private String species;
    private String height;
    private String bodyLength;
    private String tailLength;

	
	
	// Constructor
    public Monkey(String name, String species, String gender, String age,
    String weight, String height, String bodyLength, String tailLength, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setHeight(height);
        setBodyLength(bodyLength);
        setTailLength(tailLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionCountry(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry); 
    }
    
    //Accessor Method
    public String getSpecies() {
        return species;
    }

    // Mutator Method
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }

    //Accessor Method
    public String getHeight() {
        return height;
    }

    // Mutator Method
    public void setHeight(String monkeyHeight) {
        height = monkeyHeight;
    }

    //Accessor Method
    public String getBodyLength() {
        return bodyLength;
    }

    // Mutator Method
    public void setBodyLength(String monkeyBodyLength) {
        bodyLength = monkeyBodyLength;
    }

    //Accessor Method
    public String getTailLength() {
        return tailLength;
    }

    // Mutator Method
    public void setTailLength(String monkeyTailLength) {
        tailLength = monkeyTailLength;
    }
}
