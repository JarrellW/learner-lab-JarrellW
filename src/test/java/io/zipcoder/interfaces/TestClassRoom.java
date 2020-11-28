package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestClassRoom {

    ClassRoom ClassRoom;

    @Before
    public void setUp(){
        ClassRoom = new ClassRoom();
    }

    @Test
    public void getRosterTest(){
        ArrayList<Person> totalRegistered = new ArrayList<Person>();
        totalRegistered.addAll(ZipCodeWilmington.getInstructorList());
        totalRegistered.addAll(TechConnect.getStudents());
        for (Person registeredRoster: ClassRoom.getRoster().values()) {
            Assert.assertTrue(totalRegistered.contains(registeredRoster));
        }
    }
}
