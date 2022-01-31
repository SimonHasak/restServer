package executor;

import java.util.List;

/**
 * @author Šimon Hašák
 *
 * Base interface for Strategy and Factory pattern
 *
 */
public interface Executor {

    boolean executeUser();

    List<String> executeNetwork();

}
