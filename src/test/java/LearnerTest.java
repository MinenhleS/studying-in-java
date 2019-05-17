import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.AssertEquals.assertEquals;

public class LearnerTest {

    @Test
    public void shouldBeAbleToAddStudents(){

        Learner learner  = new Learner("", "", "", 0);
        learner.subjects.put();

        assertEquals("", learner.getstudents);
    }
}
