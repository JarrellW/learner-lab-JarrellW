package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    private Student person;

    @Test
    public void personConstructorTest(){
        person = new Student(044L, "Jax");
    }
    @Test
    public void personSetNameTest(){
        person = new Student(044L, "Jax");
        String expected = "Jax";

        this.person.setName(expected);
        String actual = this.person.getName();

        Assert.assertEquals(expected, actual);
    }

}
