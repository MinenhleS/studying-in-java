package net.studies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessonTest {

    @Test
    public void shouldAddLearnersForTheSpecificSubject(){

        Learner learner1  = new Learner("Siya", "Malinga", "malinga@gmail.com");
        learner1.registerSubject(Subjects.Mathematics);
        learner1.registerSubject(Subjects.Physics);
        learner1.registerSubject(Subjects.CompSci);

        Learner learner2  = new Learner("Dinho", "Ngwenya", "dinho@gmail.com");
        learner2.registerSubject(Subjects.Mathematics);
        learner2.registerSubject(Subjects.Physics);
        learner2.registerSubject(Subjects.CompSci);

        Lesson lesson = new Lesson(Subjects.CompSci);
        lesson.addLearners(learner1);
        lesson.addLearners(learner2);


        assertEquals(lesson.attendingList.size(), 3);

    }

    @Test
    public void shouldAcceptToALessonByCheckingThereIsAtleastFiveLearners(){

        Learner learner1  = new Learner("Siya", "Malinga", "malinga@gmail.com");
        learner1.registerSubject(Subjects.Mathematics);
        learner1.registerSubject(Subjects.Physics);
        learner1.registerSubject(Subjects.CompSci);

        Learner learner2  = new Learner("Dinho", "Ngwenya", "dinho@gmail.com");
        learner2.registerSubject(Subjects.Mathematics);
        learner2.registerSubject(Subjects.Physics);
        learner2.registerSubject(Subjects.CompSci);

        Learner learner3  = new Learner("Mine", "Ngwenya", "mega@gmail.com");
        learner3.registerSubject(Subjects.Mathematics);
        learner3.registerSubject(Subjects.Physics);
        learner3.registerSubject(Subjects.CompSci);

        Learner learner4  = new Learner("Dinho", "Khanya", "dpho@gmail.com");
        learner4.registerSubject(Subjects.Mathematics);
        learner4.registerSubject(Subjects.Physics);
        learner4.registerSubject(Subjects.CompSci);

        Learner learner5  = new Learner("Amanda", "Ngwenya", "polo@gmail.com");
        learner5.registerSubject(Subjects.Mathematics);
        learner5.registerSubject(Subjects.Physics);
        learner5.registerSubject(Subjects.CompSci);

        Lesson lesson = new Lesson(Subjects.CompSci);
        lesson.addLearners(learner1);
        lesson.addLearners(learner2);
        lesson.addLearners(learner3);
        lesson.addLearners(learner4);
        lesson.addLearners(learner5);

        assertEquals(lesson.acceptLessons(), true);

    }

    @Test
    public void shouldCheckIfTeacherIsAcceptableToStartALesson(){

        Learner learner1  = new Learner("Siya", "Malinga", "malinga@gmail.com");
        learner1.registerSubject(Subjects.Mathematics);
        learner1.registerSubject(Subjects.Physics);
        learner1.registerSubject(Subjects.CompSci);

        Learner learner2  = new Learner("Dinho", "Ngwenya", "dinho@gmail.com");
        learner2.registerSubject(Subjects.Mathematics);
        learner2.registerSubject(Subjects.Physics);
        learner2.registerSubject(Subjects.CompSci);

        Learner learner3  = new Learner("Mine", "Ngwenya", "mega@gmail.com");
        learner3.registerSubject(Subjects.Mathematics);
        learner3.registerSubject(Subjects.Physics);
        learner3.registerSubject(Subjects.CompSci);

        Learner learner4  = new Learner("Dinho", "Khanya", "dpho@gmail.com");
        learner4.registerSubject(Subjects.Mathematics);
        learner4.registerSubject(Subjects.Physics);
        learner4.registerSubject(Subjects.CompSci);

        Learner learner5  = new Learner("Amanda", "Ngwenya", "polo@gmail.com");
        learner5.registerSubject(Subjects.Mathematics);
        learner5.registerSubject(Subjects.Physics);
        learner5.registerSubject(Subjects.CompSci);

        Teacher teacher = new Teacher("Burger", "Naidoo", "b213@yahoo.com");
        teacher.registerSubject(Subjects.CompSci);

        Lesson lesson = new Lesson(Subjects.CompSci);
        lesson.addLearners(learner1);
        lesson.addLearners(learner2);
        lesson.addLearners(learner3);
        lesson.addLearners(learner4);
        lesson.addLearners(learner5);


        assertEquals(lesson.startLesson(teacher), "Can start a lesson");

    }


    @Test
    public void shouldAllocateTokensToTeacherAndLearners(){

        Learner learner1  = new Learner("Siya", "Malinga", "malinga@gmail.com");
        learner1.registerSubject(Subjects.Mathematics);
        learner1.registerSubject(Subjects.Physics);
        learner1.registerSubject(Subjects.CompSci);

        Learner learner2  = new Learner("Dinho", "Ngwenya", "dinho@gmail.com");
        learner2.registerSubject(Subjects.Mathematics);
        learner2.registerSubject(Subjects.Physics);
        learner2.registerSubject(Subjects.CompSci);

        Learner learner3  = new Learner("Mine", "Ngwenya", "mega@gmail.com");
        learner3.registerSubject(Subjects.Mathematics);
        learner3.registerSubject(Subjects.Physics);
        learner3.registerSubject(Subjects.CompSci);

        Learner learner4  = new Learner("Dinho", "Khanya", "dpho@gmail.com");
        learner4.registerSubject(Subjects.Mathematics);
        learner4.registerSubject(Subjects.Physics);
        learner4.registerSubject(Subjects.CompSci);

        Learner learner5  = new Learner("Amanda", "Ngwenya", "polo@gmail.com");
        learner5.registerSubject(Subjects.Mathematics);
        learner5.registerSubject(Subjects.Physics);
        learner5.registerSubject(Subjects.CompSci);

        Teacher teacher = new Teacher("Burger", "Naidoo", "b213@yahoo.com");
        teacher.registerSubject(Subjects.CompSci);

        Lesson lesson = new Lesson(Subjects.CompSci);
        lesson.addLearners(learner1);
        lesson.addLearners(learner2);
        lesson.addLearners(learner3);
        lesson.addLearners(learner4);
        lesson.addLearners(learner5);

        System.out.println(learner1.getTokenHold() + " | " + learner1.firstName);
        System.out.println(teacher.getTokenHold() + " | " + teacher.firstName);




        assertEquals(lesson.startLesson(teacher), "Can start a lesson");

    }
}
