public class Person {

   String firstName; //store the first name
   String lastName;  //store the last name
   String email;     //store the email

    //Default constructor
    //Initialize firstName and lastName to empty string

    public Person()
    {
        firstName = "";
        lastName = "";
        email = "";

    }

    //Constructor with parameters
    //Set firstName,lastName and email according to the parameters

    public Person (String firstName, String lastName, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //Method to output the first name,last name and email
    //in the form firstName lastName email

    public String toString()
    {
        return (firstName + " " + lastName + " " + email);
    }

    //Method to return the firstName
    //Postcondition: the value of firstName is returned

    public String getFirstName()
    {
        return firstName;
    }

    //Method to return the lastName
    //Postcondition: the value of lastName is returned

    public String getLastName()
    {
        return lastName;
    }

    //Method to return the email
    //Postcondition: the value of email is returned

    public String getEmail() {
        return email;
    }
}
