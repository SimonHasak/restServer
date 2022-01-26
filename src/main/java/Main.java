import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * @author Šimon Hašák
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

//        String[] env = {"PATH=/bin:/usr/bin/"};
//        String cmd = "you complete shell command";  //e.g test.sh -dparam1 -oout.txt


        try {
            ProcessBuilder pb = new ProcessBuilder("/home/simon/School/diplomka/restserver/src/main/resources/scripts/test.sh");
            Map<String, String> env = pb.environment();
            env.put("VAR1", "Simon Hasak");
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
            System.out.println("Script executed successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
