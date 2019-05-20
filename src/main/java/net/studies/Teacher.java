package net.studies;

import net.studies.Person;
import net.studies.Subjects;

import java.util.ArrayList;

public class Teacher extends Person {

    int tokenHold;

    //constructor
    public Teacher(String firstName, String lastName, String email, int tokenHold) {
        super(firstName, lastName,email);
        this.tokenHold = tokenHold;
    }

    //Method which returns info details
    public String displayLearnerDetails(){
        return getFirstName() + " " + getLastName() + " " + getEmail() + " " + getTokenHold();
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
    public String takeALesson(Subjects subjects){

        if(lectureList.contains(subjects) && getNumberOfSubjects() >= 1){
            return "CAN TEACH A LESSON";
        }
        else{
            return "YOU DON'T QUALIFY";
        }
    }

    //net.studies.Teacher token packet
    public int getTokenHold() {
        return tokenHold;
    }

    //Number of subjects that are registered
    public int getNumberOfSubjects(){
        return lectureList.size();
    }



}
