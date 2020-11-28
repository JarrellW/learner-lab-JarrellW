package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {


    public Instructor(Long id, String name) {
        super(id, name);
    }


    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);
    }

    public void lecture(Student[] student, double numberOfHours) {
        for (int i = 0; i < student.length; i++) {
            teach(student[i],numberOfHours);
        }
    }
}
