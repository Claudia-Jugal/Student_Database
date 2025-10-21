// Claudia Garcia 3137392

//With this class we are adding the information of a ordinary student that will end the course with 300 credits

public class OrdinaryStudent extends Student {
    public OrdinaryStudent(String firstName, String lastName, int id) {
        super(firstName, lastName, id, 3);
        setCredits(300);
    }


    public void displayInfo() {
        System.out.println("Ordinary Student: " + getFirstName() + " " + getLastName() +
                ", ID: " + getId() + ", Credits: " + getCredits() + ", Years: " + getYears());
    }
}
