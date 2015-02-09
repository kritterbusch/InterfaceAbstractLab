package lab1.solution;

import javax.swing.JOptionPane;


public abstract class Course {

    private String courseName;
    private String courseNumber;
    private String prerequisites;
    private double credits;

    public Course(String cName, String cNum, double creds) {
        courseName = cName;
        courseNumber = cNum;
        credits = creds;

    }

    protected final double getCredits() {
        return credits;
    }

    protected final void setCredits(double creds) {

        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
    }

    abstract String getPrerequisites();

    protected void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    protected final String getCourseName() {
        return courseName;
    }

    protected final void setCourseName(String cName) {
        if (cName == null || cName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = cName;
    }

    protected final String getCourseNumber() {
        return courseNumber;
    }

    protected final void setCourseNumber(String cNum) {
        this.courseNumber = cNum;
    }

    protected final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public String toString() {

        return "Course Name: " + getCapitalizedCourseName()
                + "\nCourse Number: " + courseNumber
                + "\nCredits: " + credits;
    }

}
