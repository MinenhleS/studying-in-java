package net.studies;

import java.util.ArrayList;

public class Learner extends Person {

    int tokenHold = 0;

    //constructor
    public Learner(String firstName, String lastName, String email) {
        super(firstName, lastName,email);
    }

    //List for getting subjects
    ArrayList<Subjects> subjectsList = new ArrayList<Subjects>();

    //Adding the subject in the arrayList which is named subjectList
    public void registerSubject(Subjects subjects){


        if(!subjectsList.contains(subjects)){
            subjectsList.add(subjects);

        }


    }
    //Checks whether learner has subject and are equal to three or more
    public boolean takeALesson(Subjects subjects){

    return subjectsList.contains(subjects) && getNumberOfSubjects() >= 3;
    }

    //net.studies.Learner token packet
    public int getTokenHold() {
        return tokenHold += 3;
    }

    //Number of subjects that are registered
    public int getNumberOfSubjects(){
        return subjectsList.size();
    }

}

