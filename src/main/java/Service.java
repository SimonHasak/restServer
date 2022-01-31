import executor.Executor;
import factory.ExecutorFactory;
import manager.NetworkManager;
import manager.UserManager;

import java.util.List;
import java.util.Map;

/**
 * @author Šimon Hašák
 */
public class Service {

    private final Executor executor;

    private final UserManager userManager;
    private final NetworkManager networkManager;

    public Service() {
        this.executor = ExecutorFactory.of("linux");

        this.userManager = new UserManager(this.executor);
        this.networkManager = new NetworkManager(this.executor);
    }


    public boolean executeUser(Map<String, String> parameters) {

        return this.userManager.getUserExecutor().executeUser();
    }

    public List<String> executeNetwork(Map<String, String> parameters) {

        return this.networkManager.getNetworkExecutor().executeNetwork();
    }

}
