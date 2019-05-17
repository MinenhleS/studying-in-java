import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LearnerTest {

    @Test
    public void shouldQualifyALeaner(){

        Learner learner  = new Learner("", "", "", 0);
        learner.addingSubject("mathematics");
        learner.addingSubject("physics");
        learner.addingSubject("CompScie");
        learner.addingSubject("Statistics");

        assertEquals("CAN TAKE A LESSON", learner.takeALesson());
    }

    @Test
    public void shouldDisqualifyALeaner(){

        Learner learner  = new Learner("", "", "", 0);
        learner.addingSubject("mathematics");
        learner.addingSubject("physics");



        assertEquals("YOU DON'T QUALIFY", learner.takeALesson());
    }

}
