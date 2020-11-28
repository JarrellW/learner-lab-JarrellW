package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTechConnect {

    @Before
    public void setup(){
        TechConnect.removeStudents();
    }

    @Test
    public void removeStudentsTest(){
        Assert.assertTrue(TechConnect.getStudents().isEmpty());
    }

    @Test
    public void testRecruitStudent() {
        String[] studentNames = {"Karen", "Liel", "Quinn", "Destiny", "Blesson", "Danielle B.", "Andre", "Jeff",
                "Carlo", "Julia D.", "Natalie", "Julia E.", "Shylee", "Genevieve", "Margo", "Whitney", "Rachel",
                "Bridget", "Seung", "Jessica", "Harry", "Kesler", "Darin", "Jade", "Dominika", "Nashae", "Brianna",
                "Laurent", "Rina", "Emily", "Elisha", "Caitlin", "Kierra", "Dana", "Alyssa", "Humaira", "Prajwal",
                "Cristine", "Brendan"};
        for (String studentName : studentNames) {
            Student student = new Student(05L, studentName);
            TechConnect.recruitStudent(student);
        }
        Assert.assertEquals(TechConnect.getStudents().size(), 39);
    }
}
