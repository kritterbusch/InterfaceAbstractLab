package lab2.solution;

import lab2.*;
import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author Kerry Ritterbusch
 * @version 1.00
 */
public class AdvancedJavaCourse implements Classes {

    public String courseName;
    public String courseNumber;
    public double credits;
    public String prerequisites;

    public AdvancedJavaCourse(String cName, String cNum, String prereqs, double creds) {
        courseName = cName;
        courseNumber = cNum;
        prerequisites = prereqs;
        credits = creds;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites = prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
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
