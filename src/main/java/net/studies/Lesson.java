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
            return true;
       }
       return false;
    }

    public void startLesson(Teacher teacher) {
        if(teacher.teachALesson(subject) && acceptLessons()) {
            //successful
            //give notes & token (teacher learner)
        }
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