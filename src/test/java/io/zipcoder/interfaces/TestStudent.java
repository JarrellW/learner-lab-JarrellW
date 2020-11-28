package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void studentTest(){
        Student student = new Student(00l,"Jax");
        student.learn(5.0);
        double actual = student.getTotalStudyTime();
        double expected = 5.0;

        Assert.assertTrue(student instanceof Learner);
        Assert.assertTrue(student instanceof Person);
        Assert.assertEquals(expected, actual, 0);

    }
}
