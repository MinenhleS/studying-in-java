import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LearnerTest {

    @Test
    public void shouldDisplayFirstLastNameAndEmail(){

        Learner learner  = new Learner("Minenhle", "Ngwenya", "dinho@gmail.com", 0);

        assertEquals("Minenhle Ngwenya dinho@gmail.com 0", learner.displayLearnerDetails());
    }

    @Test
    public void shouldQualifyALeaner(){

        Learner learner  = new Learner("Siya", "Malinga", "malinga@gmail.com", 0);
        learner.registerSubject(Subjects.valueOf("Mathematics"));
        learner.registerSubject(Subjects.valueOf("Physics"));
        learner.registerSubject(Subjects.valueOf("CompSci"));
        learner.registerSubject(Subjects.valueOf("Statistics"));

        assertEquals("CAN TAKE A LESSON", learner.takeALesson(Subjects.CompSci));
    }

    @Test
    public void shouldDisqualifyALeaner(){

        Learner learner  = new Learner("Dinho", "Khumalo", "siya@gmail.com", 0);
        learner.registerSubject(Subjects.valueOf("Mathematics"));
        learner.registerSubject(Subjects.valueOf("Physics"));



        assertEquals("YOU DON'T QUALIFY", learner.takeALesson(Subjects.CompSci));
    }



}
