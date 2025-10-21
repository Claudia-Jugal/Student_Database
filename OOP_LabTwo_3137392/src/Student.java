// Claudia Garcia 3137392

//The Student class extending Account variables
public abstract class Student extends Account {
    private int id;
    private int credits;
    private int years;

    //The variable first and last name are extending from Account
    public Student(String firstName, String lastName, int id, int years) {
        super(firstName, lastName);
        this.id = id;
        this.years = years;
        setEmail(firstName.toLowerCase() + "." + lastName.toLowerCase() + "@student.griffith.ie");
    }

    //Setters and getters for variables
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    //With the abstract method will be able to display the infromation needed
    public abstract void displayInfo();


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id;
    }


    public int hashCode() {
        return Integer.hashCode(id);
    }
}
