import java.io.Console;

/**
 * object
 */

public class object 
{
    String requiredValue;
    String optionalValue;


    public String getRequiredValue() {
        return requiredValue;
    }

    public void  setRequiredValue(final String value) {
        requiredValue = value;
    }

    public String getOptionalValue() {
        return optionalValue;
    }

    public void setOptionaldValue(final String value) {
        optionalValue = value;
    }

    public static void main(final String[] args) {
        final object obj1 = new object();
        obj1.setRequiredValue("Required");
        obj1.setOptionaldValue( "Optional");

        final object obj2 = new object();
        obj2.setRequiredValue("New Required");
        
        System.out.println(obj1.getRequiredValue() + " "+obj1.getOptionalValue());
        System.out.println(obj2.getRequiredValue() + " "+obj2.getOptionalValue());
        //hello 2
    }
}