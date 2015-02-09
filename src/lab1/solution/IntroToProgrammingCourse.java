package lab1.solution;

/**
 * This class holds data for an Introduction to Programming course. NOTE: this
 * class has NO PREREQUISITES! Do not change this fact.
 *
 * @author Kerry Ritterbusch
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Course {

    public IntroToProgrammingCourse(String cName, String cNum, double creds) {
        super(cName, cNum, creds);
    }

    @Override
    protected String getPrerequisites() {
        return "No prerequisites";
    }

    @Override
    public String toString() {
        return super.toString();

    }

}
