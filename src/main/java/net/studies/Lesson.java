package net.studies;

import java.util.ArrayList;

public class Lesson {

    private final Subjects subject;

    int minNoOfLearners = 5;


    ArrayList<Learner> attendingList = new ArrayList<>();

    public Lesson(Subjects subjects) {

        this.subject = subjects;
    }

    public boolean addLearners(Learner learner){
       if(learner.takeALesson(subject)){
            attendingList.add(learner);
           learner.getTokenHold();
            return true;
       }
       return false;
    }

    public String startLesson(Teacher teacher) {
        if(teacher.teachALesson(subject) && acceptLessons()) {
            teacher.getTokenHold();
            //successful
            return "Can start a lesson";
            //give notes & token (teacher learner)

        }
        return "Sorry you can't start a lesson";
    }

    public boolean acceptLessons(){
        return attendingList.size() >= minNoOfLearners;

    }
}













//    public boolean addTeacher(Teacher teacher){
//        if(teacher.teachALesson(subjects)== true){
//            return true;
//        }
//        return false;
//    }