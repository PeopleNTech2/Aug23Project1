package exceptiohandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        String path = "C:\\Users\\PNT\\eclipse-workspace\\Aug2023Project1\\src\\notes";

        FileReader fr = null;
        try {
            fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(fr);

        String str = "";

        try {
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (br != null){
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
