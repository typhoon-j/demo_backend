package bo.edu.ucb.demo.Backend.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    @Basic(optional = false)
    private Integer studentId;
    @Column(name = "first_name")
    @Basic(optional = false)
    private String firstName;
    @Column(name = "second_name")
    @Basic(optional = false)
    private String secondName;

    public Student() {
    }

    public Integer getStudentId() {return studentId;}

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
