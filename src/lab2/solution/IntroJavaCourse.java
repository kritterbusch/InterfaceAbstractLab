package lab2.solution;

/**
 * This class holds data for an Introduction to Java course.
 *
 * @author Kerry Ritterbusch
 * @version 1.00
 */
public class IntroJavaCourse implements Classes {

    private String courseName;
    private String courseNumber;
    private String prerequisites;
    private double credits;

    public IntroJavaCourse(String cName, String cNum, String prereqs, double creds) {
        courseName = cName;
        courseNumber = cNum;
        prerequisites = prereqs;
        credits = creds;

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites = prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    @Override
    public String toString() {

        return "Course Name: " + getCapitalizedCourseName()
                + "\nCourse Number: " + courseNumber
                + "\nCredits: " + credits
                + "\nPrerequisites: " + prerequisites;
                

    }
}
