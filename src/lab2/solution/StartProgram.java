package lab2.solution;

public class StartProgram {

    public static void main(String[] args) {

        Classes course = new AdvancedJavaCourse("Advanced Java", "CS-340", "\n\t-Introduction to Programming"
                + "\n\t-Introduction to Java", 4.0);
        System.out.println(course);

        course = new IntroJavaCourse("Introduction to Java", "CS-240", "\n\t-Introduction To Programming", 3.0);
        System.out.println("\n" + course);

        course = new IntroToProgrammingCourse("Introduction to Programming", "CS-140", 4.0);
        System.out.println("\n" + course);

        
        /*
         While not the greatest source, a line on the Wikipedia page for the Circle-eelipse problem states, 
         " . . . difficulties . . . can occur when a base class contains methods which mutate an object in a 
         manner which might invalidate a (stronger) invariant found in a derived class, 
         causing the Liskov substitution principle to be violated."
        
         The author of the DIP article had written the following in his LSP article:
         "In order for LSP to hold, and with it the Open-Closed principle, 
         all derivitives must conform to the behavior that clients expect of the base classes that they use" (p. 6).
        
         Based on these arguments, I would assume that if I were to put methods or mutators in my subclass that the Course superclass cannot support, 
         I would not be able to use this principle.
         A possible example could be that you define Course to say that the course id number (ie CS-340) can have any value
         but for beginner courses, the first digit of the number shouldn't be able to go above 2 or something (since it's for beginner courses). 
         You could conceivably have an object of type IntroJavaCourse with a course id of CS-560, which shouldn't be allowed.
         */
    }
}
