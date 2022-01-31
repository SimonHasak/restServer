package factory;

import executor.BashExecutor;
import executor.Executor;
import executor.JniExecutor;

/**
 * @author Šimon Hašák
 */
public class ExecutorFactory {

    public static Executor of(String executorType) {
        if (executorType == null) {
            return null;
        }

        if (executorType.equalsIgnoreCase("windows")) {
            return new JniExecutor();
        } else if (executorType.equalsIgnoreCase("linux")) {
            return new BashExecutor();
        }

        return null;
    }

}
