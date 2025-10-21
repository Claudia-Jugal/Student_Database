//Claudia Garcia 3137392
import java.util.HashSet;
import java.util.Set;

public class Test {

    //Added the lecturer, subjects and names of students, including the ones that are enrolled in more than one course
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer(" Prathyusha", "Sagi", "Room 305");
        Lecturer lecturer2 = new Lecturer("Saeid", "Rezaei", "Room 306");
//Added three subjects
        Subject subject1 = new Subject("Databases", lecturer1, 5);
        Subject subject2 = new Subject("OOP", lecturer2, 5);
        Subject subject3 = new Subject("Probability", lecturer1, 5);
//Included dummy names for the students
        subject1.enrol("Derrick", "Zhang", 1, 4);
        subject1.enrol("Anna", "Shumilova", 2, 3);
        subject1.enrol("Claudia", "Garcia", 3, 4);
        subject1.enrol("Kieran", "McCarthy", 4, 3);
        subject1.enrol("Jose", "Garcia", 5, 4);

        subject2.enrol("Derrick", "Zhang", 1, 4);
        subject2.enrol("Flor", "Alanis", 6, 3);
        subject2.enrol("Martha", "Ortiz", 7, 4);
        subject2.enrol("Nestor", "Fernandez", 8, 3);
        subject2.enrol("Claudia", "Garcia", 3, 4);

        subject3.enrol("Lincoln", "Martinez", 9, 3 );
        subject3.enrol("Minerva", "Vallejo", 10,4);
        subject3.enrol("Kieran", "McCarthy", 4, 3);
        subject3.enrol("Martha", "Ortiz", 7, 3);
        subject3.enrol("Selina", "Ramirez", 13, 4);

        //print the students that are enrolled in each subject
        System.out.println("Students in Databases:");
        for (Student student : subject1.getStudents()) {
            System.out.println(student.getFirstName() + " " + student.getLastName() +
                    (student instanceof HonorStudent ? " (BSCH)" : " (BSCO)"));

        }


        System.out.println("\nStudents in OOP:");
        for (Student student : subject2.getStudents()) {
            System.out.println(student.getFirstName() + " " + student.getLastName() +
                    (student instanceof HonorStudent ? " (BSCH)" : " (BSCO)"));
        }

        System.out.println("\nStudents in Probability:");
        for (Student student : subject3.getStudents()) {
            System.out.println(student.getFirstName() + " " + student.getLastName() +
                    (student instanceof HonorStudent ? " (BSCH)" : " (BSCO)"));
        }

        // Showing the students enrolled in two subjects
        System.out.println("\nStudents in more than one subject:");

        //We are combining the students across subjects into a ser
Set<Student> studentsChecked = new HashSet<>();
Set<Student> duplicateStudents = new HashSet<>();

for (Student student : subject1.getStudents()){
    if(!studentsChecked.add(student)){
        duplicateStudents.add(student);
    }
}
for (Student student : subject2.getStudents()){
    if(!studentsChecked.add(student)){
        duplicateStudents.add(student);
    }
}

for(Student student : subject3.getStudents()){
    if(!studentsChecked.add(student)){
        duplicateStudents.add(student);
    }
}
for(Student student : duplicateStudents){
    student.displayInfo();
}
    }
}
