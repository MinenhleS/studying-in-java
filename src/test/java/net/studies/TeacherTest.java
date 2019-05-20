package net.studies;

import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {

    @Test
    public void shouldTeacherDisplayFirstLastNameAndEmail(){

        Teacher teacher  = new Teacher("Minenhle", "Ngwenya", "dinho@gmail.com", 0);

        Assert.assertEquals("Minenhle Ngwenya dinho@gmail.com", teacher.toString());
    }

    @Test
    public void shouldAllowTeacherToDoALesson(){

        Teacher teacher  = new Teacher("Siya", "Malinga", "malinga@gmail.com", 0);
        teacher.registerSubject(Subjects.valueOf("Mathematics"));
        teacher.registerSubject(Subjects.valueOf("Statistics"));

        Assert.assertEquals("CAN TEACH A LESSON", teacher.teachALesson(Subjects.Mathematics));
    }

    @Test
    public void shouldDisqualifyATeacherFromDoingTheLesson(){

        Teacher teacher  = new Teacher("Dinho", "Khumalo", "siya@gmail.com", 0);
        teacher.registerSubject(Subjects.valueOf("Mathematics"));

        Assert.assertEquals("YOU DON'T QUALIFY TO TEACH THE LESSON", teacher.teachALesson(Subjects.Physics));
    }



}
