package net.studies;

import net.studies.Subjects;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LearnerTest {

    @Test
    public void shouldDisplayFirstLastNameAndEmail(){

        Learner learner  = new Learner("Minenhle", "Ngwenya", "dinho@gmail.com", 0);

        Assert.assertEquals("Minenhle Ngwenya dinho@gmail.com 0", learner.displayLearnerDetails());
    }

    @Test
    public void shouldQualifyALeaner(){

        Learner learner  = new Learner("Siya", "Malinga", "malinga@gmail.com", 0);
        learner.registerSubject(Subjects.valueOf("Mathematics"));
        learner.registerSubject(Subjects.valueOf("Physics"));
        learner.registerSubject(Subjects.valueOf("CompSci"));
        learner.registerSubject(Subjects.valueOf("Statistics"));

        Assert.assertEquals("CAN TAKE A LESSON", learner.takeALesson(Subjects.CompSci));
    }

    @Test
    public void shouldDisqualifyALeaner(){

        Learner learner  = new Learner("Dinho", "Khumalo", "siya@gmail.com", 0);
        learner.registerSubject(Subjects.valueOf("Mathematics"));
        learner.registerSubject(Subjects.valueOf("Physics"));



        Assert.assertEquals("YOU DON'T QUALIFY", learner.takeALesson(Subjects.CompSci));
    }



}