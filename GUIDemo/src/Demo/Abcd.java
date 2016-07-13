package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by cerebro on 08/07/16.
 */
public class Abcd {

    public static void randomFunction() {

        try {
            FileWriter writer = new FileWriter("/Users/cerebro/AndroidStudioProjects/codekamp_13thjune/GUIDemo/src/hello.txt");

            String abcd = "Welcome to Codekamp";
            writer.write(abcd.toCharArray());
            writer.close();

        } catch (Exception e) {

        }


    }
}
