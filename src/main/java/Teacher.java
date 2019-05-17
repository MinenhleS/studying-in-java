import java.util.HashMap;

public class Teacher extends Person{

    int numberOfSubjects;
    int tokenHold;

    //constructor
    public Teacher(String firstName, String lastName, String email, int tokenHold) {
        super(firstName, lastName,email);
        this.tokenHold = tokenHold;

    }

    //Map for getting subjects
    HashMap<String, Integer> modules = new HashMap<>();

    public String takeALesson(){
        numberOfSubjects = modules.size();

        if(numberOfSubjects >= 1){
            return "CAN TEACH LESSON";
        }
        else{
            return "YOU DON'T QUALIFY";
        }
    }

    public int getTokenHold() {
        return tokenHold;
    }
}
