package manager;

import executor.Executor;
import lombok.Data;

/**
 * @author Šimon Hašák
 */
@Data
public class NetworkManager {

    private Executor networkExecutor;

    public NetworkManager(Executor networkExecutor) {
        this.networkExecutor = networkExecutor;
    }


}
