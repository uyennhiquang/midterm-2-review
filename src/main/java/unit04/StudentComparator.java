package unit04;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

  @Override
  public int compare(Student s1, Student s2) {
    return (Float.compare(s1.getGpa(), s2.getGpa()) != 0) ? (Float.compare(s1.getGpa(), s2.getGpa()))
        : (s1.getName().compareTo(s2.getName())*-1);
  }

}
