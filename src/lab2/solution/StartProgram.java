package lab2.solution;

public class StartProgram {

    public static void main(String[] args) {

        Classes courseOne = new AdvancedJavaCourse("Advanced Java", "CS-340", "\n\t-Introduction to Programming"
                + "\n\t-Introduction to Java", 4.0);
        System.out.println(courseOne);

        Classes courseTwo = new IntroJavaCourse("Introduction to Java", "CS-240", "\n\t-Introduction To Programming", 3.0);
        System.out.println("\n" + courseTwo);

        Classes courseThree = new IntroToProgrammingCourse("Introduction to Programming", "CS-140", 4.0);
        System.out.println("\n" + courseThree);

    }
}
