package unit04;

public class Student {
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
}

