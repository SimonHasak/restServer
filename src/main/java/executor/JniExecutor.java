package executor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Šimon Hašák
 *
 * Strategy2 class
 */
public class JniExecutor implements Executor {

    public boolean executeUser() {
        System.out.println("Executing user JNI script...");

        return true;
    }

    public List<String> executeNetwork() {
        System.out.println("Executing network JNI script...");
        return new ArrayList<String>();
    }
}
