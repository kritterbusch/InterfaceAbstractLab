package lab1.solution;

import javax.swing.JOptionPane;

public class StartProgram {

    public static void main(String[] args) {



        Course courseOne = new AdvancedJavaCourse("Advanced Java", "CS-340", 4.0);
        System.out.println(courseOne);
        System.out.println("Prerequisites: " + courseOne.getPrerequisites());

        Course courseTwo = new IntroJavaCourse("Introduction to Java", "CS-240", 3.0);
        System.out.println("\n" + courseTwo);
        System.out.println("Prerequisite: " + courseTwo.getPrerequisites());

        Course courseThree = new IntroToProgrammingCourse("Intoduction to Programming", "CS-140", 4.0);
        System.out.println("\n" + courseThree);
        System.out.println("Prerequisite: " + courseThree.getPrerequisites());

    }
}
