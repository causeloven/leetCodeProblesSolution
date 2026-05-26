package foodTracker;

import java.io.*;

public class fileWriter {
    public static void main(String[] args){
        String penis = "penis";

        try(BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter("output.txt"))){
            for(int i = 1; i < 1001;i++){
                bufferedWriter.write(penis + " " + i + "\n");
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
