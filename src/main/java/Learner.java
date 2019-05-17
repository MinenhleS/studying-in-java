import java.util.HashMap;

public class Learner extends Person {

    //String subName;
    int numberOfSubjects;
    int tokenHold = 0;

    //constructor
    public Learner(String firstName, String lastName, String email, int tokenHold) {
        super(firstName, lastName,email);
        this.tokenHold = tokenHold;
    }

    //Map for getting subjects
    HashMap<String, Integer> subjectsMap = new HashMap<>();

    public void addingSubject(String subName){


        if(!subjectsMap.containsKey(subName)){
            subjectsMap.put(subName,1);

        }
//        int subCounter = subjectsMap.get(subName);
//        subjectsMap.put(subName,subCounter);

    }

    public String takeALesson(){
        numberOfSubjects = subjectsMap.size();

        if(numberOfSubjects >= 3){
            return "CAN TAKE A LESSON";
        }
        else{
            return "YOU DON'T QUALIFY";
        }
    }

    public int getTokenHold() {
        return tokenHold;
    }



}

