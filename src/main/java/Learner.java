public class Learner extends Person {


    int numberOfSubjects;
    int tokens;

    //Default constructor
    public Learner(String firstName, String lastName, String email, int numberOfSubjects, int tokens) {
        super(firstName, lastName,email);
        this.numberOfSubjects = numberOfSubjects;
        this.tokens = tokens;
    }

    //Accesser method for getting number of subject learner enrolled in & tokens
    public int getNumberOfSubjects(){
        return numberOfSubjects;
    }

    public int getTokens() {
        return tokens;
    }
}

