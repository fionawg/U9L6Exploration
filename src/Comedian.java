import java.util.ArrayList;

public class Comedian extends Performer
{
    private ArrayList<String> jokes;

    public Comedian(String name, int age, Agent agent)
    {
        super(name, age, agent);
        jokes = new ArrayList<String>();
    }

    public void writeJoke(String joke)
    {
        jokes.add(joke);
    }

    // Exercise 1: Write your overridden method below for callAgent():






    // Exercise 2:  reverse the two lines of code in the method
    // below and see if it compiles and prints as expected
    @Override
    public void printInfo()
    {
        System.out.println("I will make you laugh!");
        super.printInfo(); // this calls the SUPERCLASS version of printInfo!
    }

    // Exercise 3: Write your overridden method for perform()
    // so that the output for Exercise 2 test code in Main.java prints
    //      "Performing for an audience! Performance #1"
    // followed by each joke in jokes on a new line





    // Exercise 4: PREDICT what this will do when
    // the Exercise 3 test code in Main.java is executed
    public void randomMethod()
    {
        super.callAgent();
        this.callAgent();
        callAgent();

        super.rehearse();
        this.rehearse();
        rehearse();
    }

//EXERCISE 5:  Write an OVERLOADED version of the inherited
//    rehearse() method with a boolean parameter performAfter;
//    the method should do the standard rehearsal,
//    followed by perform if performAfter is true.


}