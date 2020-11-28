package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Before
    public void setup(){
        ZipCodeWilmington.fireStaff();
    }

    @Test
    public void fireStaff(){
        Assert.assertTrue(ZipCodeWilmington.getInstructorList().isEmpty());
    }

    @Test
    public void hire() {
            String[] instructorNames = { "Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu" };
            for (String instructorName : instructorNames) {
                Instructor instructor = new Instructor(02l, instructorName);
                ZipCodeWilmington.hire(instructor);
            }

        Assert.assertEquals(ZipCodeWilmington.getInstructorList().size(), 6);

    }
}
