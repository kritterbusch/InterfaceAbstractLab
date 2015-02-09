package lab1.solution;

public class StartProgram {

    public static void main(String[] args) {

        Course course = new AdvancedJavaCourse("Advanced Java", "CS-340", 4.0);
        System.out.println(course);
        System.out.println("Prerequisites: " + course.getPrerequisites());
        course = new IntroJavaCourse("Introduction to Java", "CS-240", 3.0);
        System.out.println("\n" + course);
        System.out.println("Prerequisite: " + course.getPrerequisites());
        course = new IntroToProgrammingCourse("Intoduction to Programming", "CS-140", 4.0);
        System.out.println("\n" + course);
        System.out.println("Prerequisite: " + course.getPrerequisites());

        /*
         This principle offers convenience, in that you are only using one instance of the superclass "Course", rather than three:
         EXAMPLE:
        
         Course courseOne = new IntroJavaCourse("Advanced Java", "CS-340", 4.0);
         System.out.println("\n" + courseOne);
         System.out.println("Prerequisite: " + courseOne.getPrerequisites());
        
         Course courseTwo = new IntroJavaCourse("Introduction to Java", "CS-240", 3.0);
         System.out.println("\n" + courseTwo);
         System.out.println("Prerequisite: " + courseTwo.getPrerequisites());

         Course courseThree = new IntroToProgrammingCourse("Intoduction to Programming", "CS-140", 4.0);
         System.out.println("\n" + courseThree);
         System.out.println("Prerequisite: " + courseThree.getPrerequisites());
        
         By using one instance, you are using less memory. 
         However, if you want to retain this information for a later time, this wouldn't work because it is overwritten.
         */
    }
}
