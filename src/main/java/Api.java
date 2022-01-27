import java.util.HashMap;
import java.util.Map;

/**
 * @author Šimon Hašák
 */
public class Api {

    private static final Service service = new Service();

    public void baseMethod(String scriptName, Map<String, String> parameters) {

        // get rootPassword from config.properties

        service.callScript(scriptName, parameters);
    }

}
