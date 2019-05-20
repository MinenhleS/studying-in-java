import java.util.ArrayList;

public class Learner extends Person {

    int tokenHold = 0;

    //constructor
    public Learner(String firstName, String lastName, String email, int tokenHold) {
        super(firstName, lastName,email);
        this.tokenHold = tokenHold;
    }

    //Method which returns learner info details
    public String displayLearnerDetails(){
        return getFirstName() + " " + getLastName() + " " + getEmail() + " " + getTokenHold();
    }

    //List for getting subjects
    ArrayList<Subjects> subjectsList = new ArrayList<Subjects>();

    //Adding the subject in the arrayList whicj is named subjectList
    public void addingSubject(Subjects subjects){


        if(!subjectsList.contains(subjects)){
            subjectsList.add(subjects);

        }


    }
    //Checks whether learner has subject and are equal to three or more
    public String takeALesson(Subjects subjects){

        if(subjectsList.contains(subjects) && getNumberOfSubjects() >= 3){
            return "CAN TAKE A LESSON";
        }
        else{
            return "YOU DON'T QUALIFY";
        }
    }

    //Learner token packet
    public int getTokenHold() {
        return tokenHold;
    }

    //Number of subjects that are added in arrayList
    public int getNumberOfSubjects(){
        return subjectsList.size();
    }

}

