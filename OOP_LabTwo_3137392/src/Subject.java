// Claudia Garcia 3137392


import java.util.ArrayList;
// Created Subject class with private variables, implementing the methods in Roster
public class Subject implements Roster {
    private String title;
    private Lecturer lecturer;
    private int credits;
    private ArrayList<Student> roster;

    public Subject(String title, Lecturer lecturer, int credits) {
        this.title = title;
        this.lecturer = lecturer;
        this.credits = credits;
        this.roster = new ArrayList<>();
    }


    public ArrayList<Student> getStudents() {
        return new ArrayList<>(roster);
    }


    public ArrayList<HonorStudent> getBSCHStudents() {
        ArrayList<HonorStudent> honorStudents = new ArrayList<>();
        for (Student student : roster) {
            if (student instanceof HonorStudent) {
                honorStudents.add((HonorStudent) student);
            }
        }
        return honorStudents;
    }


    public ArrayList<OrdinaryStudent> getBSCOStudents() {
        ArrayList<OrdinaryStudent> ordinaryStudents = new ArrayList<>();
        for (Student student : roster) {
            if (student instanceof OrdinaryStudent) {
                ordinaryStudents.add((OrdinaryStudent) student);
            }
        }
        return ordinaryStudents;
    }

 // getters and setters for the private variables
    public Student getStudent(int id) {
        for (Student student : roster) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }


    public boolean enrol(Student student) {
        if (!roster.contains(student)) {
            roster.add(student);
            return true;
        }
        return false;
    }


    public boolean enrol(String firstName, String lastName, int id, int years) {
        for (Student student : roster) {
            if (student.getId() == id) {
                return false;
            }
        }
        Student newStudent = (years == 4) ? new HonorStudent(firstName, lastName, id)
                : new OrdinaryStudent(firstName, lastName, id);
        roster.add(newStudent);
        return true;
    }
}
