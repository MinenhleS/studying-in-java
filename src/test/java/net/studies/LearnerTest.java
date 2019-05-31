package net.studies;

import org.junit.Assert;
import org.junit.Test;

public class LearnerTest {

    @Test
    public void shouldDisplayLearnerFirstLastNameAndEmail(){

        Learner learner  = new Learner("Minenhle", "Ngwenya", "dinho@gmail.com");

        Assert.assertEquals("Minenhle Ngwenya dinho@gmail.com", learner.toString());
    }

    @Test
    public void shouldQualifyALeanerForTheLesson(){

        Learner learner  = new Learner("Siya", "Malinga", "malinga@gmail.com");
        learner.registerSubject(Subjects.valueOf("Mathematics"));
        learner.registerSubject(Subjects.valueOf("Physics"));
        learner.registerSubject(Subjects.valueOf("CompSci"));
        learner.registerSubject(Subjects.valueOf("Statistics"));

        Assert.assertEquals(true, learner.takeALesson(Subjects.CompSci));
    }

    @Test
    public void shouldDisqualifyALeanerForTheLesson(){

        Learner learner  = new Learner("Dinho", "Khumalo", "siya@gmail.com");
        learner.registerSubject(Subjects.valueOf("Mathematics"));
        learner.registerSubject(Subjects.valueOf("Physics"));



        Assert.assertEquals(false, learner.takeALesson(Subjects.CompSci));
    }



}
