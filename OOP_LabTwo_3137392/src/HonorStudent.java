// Claudia Garcia 3137392

//With this class we are adding the information of an honor student that will end the course with 360 credits
public class HonorStudent extends Student {
    public HonorStudent(String firstName, String lastName, int id) {
        super(firstName, lastName, id, 4);
        setCredits(360);
    }


    public void displayInfo() {
        System.out.println("Honor Student: " + getFirstName() + " " + getLastName() +
                ", ID: " + getId() + ", Credits: " + getCredits() + ", Years: " + getYears());
    }
}
