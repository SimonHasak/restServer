import java.util.HashMap;
import java.util.Map;

/**
 * @author Šimon Hašák
 */
public class Main {

    // for testing purpose
    private final static Api api = new Api();

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello world");

//        String[] env = {"PATH=/bin:/usr/bin/"};
//        String cmd = "you complete shell command";  //e.g test.sh -dparam1 -oout.txt

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("USER_NAME", "John Doe");

        api.baseMethod("test.sh", parameters);

    }
}
