package unit04;

import java.util.Collections;
import java.util.LinkedList;

public class StudentMain {
  public static void main(String[] args) {
    LinkedList<Student> students = new LinkedList<>();

    students.add(new Student("Alice", 2.3f));
    students.add(new Student("Alan", 2.3f));
    students.add(new Student("Bob", 2.3f));
    students.add(new Student("Charlie", 3.2f));
    students.add(new Student("Dave", 3.3f));

    System.out.println("Not sorted:");
    for (Student s:students) {
      System.out.println(s);
    }

    System.out.println("\nSorted (high to low gpa, alphabetical proper):");
    Collections.sort(students);
    for (Student s:students) {
      System.out.println(s);
    }

    System.out.println("\nSorted (low to high gpa, alphabetical reverse):");
    Collections.sort(students, new StudentComparator());
    for (Student s:students) {
      System.out.println(s);
    }

  }
  
}
