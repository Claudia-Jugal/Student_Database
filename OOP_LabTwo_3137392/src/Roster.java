// Claudia Garcia 3137392

import java.util.ArrayList;

public interface Roster {
    public ArrayList<Student> getStudents();

    public ArrayList<HonorStudent> getBSCHStudents();

    public ArrayList<OrdinaryStudent> getBSCOStudents();

    public Student getStudent(int id);

   public  boolean enrol(Student student);

    public boolean enrol(String firstName, String lastName, int id, int years);
}
