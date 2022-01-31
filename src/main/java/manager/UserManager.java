package manager;

import executor.Executor;
import lombok.Data;

/**
 * @author Šimon Hašák
 */
@Data
public class UserManager {

    private String name;

    private Executor userExecutor;

    public UserManager(Executor userExecutor) {
        this.userExecutor = userExecutor;
    }

}
