package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {
    ArrayList<Instructor> instructorList = ZipCodeWilmington.getInstructorList();
    ArrayList<Student> studentList = TechConnect.getStudents();
    private HashMap<String, Person> roster;

    public ClassRoom(){
        roster = new HashMap<String, Person>();
    }

    public HashMap<String, Person> getRoster() {
        for (Student registered: TechConnect.getStudents()) {
            roster.put(registered.getName(), registered);
        }
        for (Instructor teacher: ZipCodeWilmington.getInstructorList()) {
            roster.put(teacher.getName(), teacher);

        }
        return roster;
    }
}
