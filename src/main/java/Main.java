import java.util.HashMap;
import java.util.List;
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

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("USER_NAME", "John Doe");

        boolean userExe = api.userExecutor(parameters);
        List<String> networkExe = api.networkExecutor(parameters);

        System.out.println(userExe);
        System.out.println(networkExe);

    }
}
