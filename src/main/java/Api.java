import java.util.List;
import java.util.Map;

/**
 * @author Šimon Hašák
 */
public class Api {

    private static final Service service = new Service();

    public boolean userExecutor(Map<String, String> parameters) {

        return service.executeUser(parameters);
    }

    public List<String> networkExecutor(Map<String, String> parameters) {

        return service.executeNetwork(parameters);
    }

    // pouzivatelia, sietove interfacy, servisy => ciel (mvp)

}
