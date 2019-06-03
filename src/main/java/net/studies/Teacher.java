package net.studies;

import java.util.ArrayList;

public class Teacher extends Person {

    int tokenHold = 0;

    //constructor
    public Teacher(String firstName, String lastName, String email) {
        super(firstName, lastName,email);

    }

    //List for getting subjects
    ArrayList<Subjects> lectureList = new ArrayList<Subjects>();

    //Adding the subject in the arrayList which is named lectureList
    //registering
    public void registerSubject(Subjects subjects){

        if(!lectureList.contains(subjects)){
            lectureList.add(subjects);

        }
    }
    //Checks whether net.studies.Teacher has subject and are equal to three or more
    public boolean teachALesson(Subjects subjects){

        return lectureList.contains(subjects);

    }

    //net.studies.Teacher token packet
    public int getTokenHold() {
        return tokenHold += 5;
    }

    //Number of subjects that are registered
    public int getNumberOfSubjects(){
        return lectureList.size();
    }



}
