package unit04;

public class Student implements Comparable<Student>{
  private String name;
  private float gpa;
  
  public Student(String name, float gpa) {
    this.name = name;
    this.gpa = gpa;
  }

  public String getName() {
    return this.name;
  }


  public void setName(String name) {
    this.name = name;
  }

  public float getGpa() {
    return this.gpa;
  }

  public void setGpa(float gpa) {
    this.gpa = gpa;
  }

  @Override
  public int compareTo(Student other) {
    return (Float.compare(this.gpa, other.gpa) != 0) ? Float.compare(this.gpa, other.gpa) : this.name.compareTo(other.name);
  }
  
}

