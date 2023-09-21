package exceptiohandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {

        //compiling time exception (checked exception)
        String path = "C:\\Users\\PNT\\eclipse-workspace\\Aug2023Project1\\src\\notes";

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        String str = "";

        while ((str = br.readLine()) != null){
            System.out.println(str);
        }

        fr.close();
        br.close();

    }
}
