package net.studies;

import org.junit.Assert;
import org.junit.Test;

public class LearnerTest {

    @Test
    public void shouldDisplayLearnerFirstLastNameAndEmail(){

        Learner learner  = new Learner("Minenhle", "Ngwenya", "dinho@gmail.com", 0);

        Assert.assertEquals("Minenhle Ngwenya dinho@gmail.com", learner.toString());
    }

    @Test
    public void shouldQualifyALeanerForTheLesson(){

        Learner learner  = new Learner("Siya", "Malinga", "malinga@gmail.com", 0);
        learner.registerSubject(Subjects.valueOf("Mathematics"));
        learner.registerSubject(Subjects.valueOf("Physics"));
        learner.registerSubject(Subjects.valueOf("CompSci"));
        learner.registerSubject(Subjects.valueOf("Statistics"));

        Assert.assertEquals("CAN TAKE A LESSON", learner.takeALesson(Subjects.CompSci));
    }

    @Test
    public void shouldDisqualifyALeanerForTheLesson(){

        Learner learner  = new Learner("Dinho", "Khumalo", "siya@gmail.com", 0);
        learner.registerSubject(Subjects.valueOf("Mathematics"));
        learner.registerSubject(Subjects.valueOf("Physics"));



        Assert.assertEquals("YOU DON'T QUALIFY", learner.takeALesson(Subjects.CompSci));
    }



}
