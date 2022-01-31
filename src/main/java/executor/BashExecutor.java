package executor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Šimon Hašák
 *
 * Strategy1 class
 */
public class BashExecutor implements Executor {

    public boolean executeUser() {
        System.out.println("Executing user bash script...");

        try {
            ProcessBuilder pb = new ProcessBuilder("scripts/addUser.sh");

            Map<String, String> env = pb.environment();
            env.put("USER_NAME", "John Doe");
//            env.putAll(parameters);

            Process proc = pb.start();

            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                return false;
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }

            proc.waitFor();
            System.out.println("Script " + "addUser" + " executed successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public List<String> executeNetwork() {
        System.out.println("Executing network bash script...");

        List<String> result = new ArrayList<String>();

        try {
            ProcessBuilder pb = new ProcessBuilder("scripts/networkList.sh");

            Process proc = pb.start();

            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                String line = read.readLine();
                result.add(line);
                result.add(System.lineSeparator());

                System.out.println(read.readLine());
            }

            proc.waitFor();
            System.out.println("Script " + "addUser" + " executed successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
