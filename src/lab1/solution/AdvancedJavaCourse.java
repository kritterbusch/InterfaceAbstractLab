package lab1.solution;

import javax.swing.JOptionPane;

/**
 * This class holds data for an Advanced Java course.
 *
 * @author Kerry Ritterbusch
 * @version 1.00
 */
public class AdvancedJavaCourse extends Course {

    private String prerequisites;

    public AdvancedJavaCourse(String cName, String cNum, double creds) {
        super(cName, cNum, creds);

    }

    @Override
    public String getPrerequisites() {
        return prerequisites = "\n\t-Introduction to Programming\n\t-Introduction to Java";
    }

    @Override
    public String toString() {
        String str = super.toString();
                

        return str;
    }

}
