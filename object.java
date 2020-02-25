import java.io.Console;

/**
 * object
 */
public class Object {
    String requiredValue;
    String optionalValue;


    public String getRequiredValue() {
        return requiredValue;
    }

    public void  setRequiredValue(String value) {
        requiredValue = value;
    }

    public String getOptionalValue() {
        return optionalValue;
    }

    public void setOptionaldValue(String value) {
        optionalValue = value;
    }

    public static void main(final String[] args) {
        Object obj1 = new Object();
        obj1.setRequiredValue("Required");
        obj1.setOptionaldValue( "Optional");

        Object obj2 = new Object();
        obj1.setRequiredValue("New Required");
        
        Console.writeLine(JSON.stringify(obj1));
        Console.writeLine(JSON.stringify(obj2));
    }
}