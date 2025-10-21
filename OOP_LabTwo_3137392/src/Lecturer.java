// Claudia Garcia 3137392


// Class for Lecutrer's information, that extends Account class, which will bring the first and last name variables
public class Lecturer extends Account {
    private String office;

    public Lecturer(String firstName, String lastName, String office) {
        super(firstName, lastName);
        this.office = office;
        setEmail(firstName.toLowerCase() + "." + lastName.toLowerCase() + "@griffith.ie");
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
