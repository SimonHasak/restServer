import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * @author Šimon Hašák
 */
public class Service {

    public void callScript(String scriptName, Map<String, String> parameters) {
        try {
            ProcessBuilder pb = new ProcessBuilder("scripts/" + scriptName);

            Map<String, String> env = pb.environment();
            env.putAll(parameters);

            Process proc = pb.start();

            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }

            proc.waitFor();
            System.out.println("Script " + scriptName + " executed successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
