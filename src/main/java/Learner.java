public class Learner extends Person {


    int numberOfSubjects;

    //constructor
    public Learner(String firstName, String lastName, String email, int numberOfSubjects) {
        super(firstName, lastName,email);
        this.numberOfSubjects = numberOfSubjects;
    }

    //Accessor method for getting number of subject learner enrolled in & tokens
    public int getNumberOfSubjects(){
        return numberOfSubjects;
    }


}

