package lab1.solution;



/**
 * This class holds data for an Introduction to Java course.
 *
 * @author      Kerry Ritterbusch
 * @version     1.00
 */
public class IntroJavaCourse extends Course {

    private String prerequisites;

    public IntroJavaCourse(String cName, String cNum, double creds) {
        super(cName, cNum, creds);

    }



    public String getPrerequisites() {
        return prerequisites = "\n\t-Introduction to Programming";
    }
@Override
    public void setPrerequisites(String prereqs) {
        this.prerequisites = prereqs;
    }

    @Override
    public String toString() {
        String str = super.toString();
                

        return str;
    }

}
