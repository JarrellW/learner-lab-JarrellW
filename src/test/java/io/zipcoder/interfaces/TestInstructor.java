package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void instructorImplementationTest(){
        Instructor instructor = new Instructor(5l, "Mrs.Max");
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void instructorInheritanceTest(){
        Instructor instructor = new Instructor(5l, "Mrs.Max");
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void instructorTeachTest(){
        Instructor instructor = new Instructor(5l, "Mrs.Max");
        Student student = new Student(00l,"Jax");
        double expected = 4.0;
        instructor.teach(student, expected);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);

    }
    @Test
    public void instructorLectureTest(){
        Instructor instructor = new Instructor(5l, "Mrs.Max");
        Student[] students = new Student[4];
        students[0] = new Student (0l,"Jax");
        students[1] = new Student (1l,"Ray");
        students[2] = new Student (2l,"May");
        students[3] = new Student (3l,"April");

        double expected = 4.0/4.0;
        instructor.lecture(students, expected);
        double actual = students[1].getTotalStudyTime();

        Assert.assertEquals(actual, expected,0);
    }
}
