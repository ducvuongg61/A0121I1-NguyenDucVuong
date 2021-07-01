package THI.writeCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteCSV {
    private static BufferedReader bufferedReader; // read file
    private static BufferedWriter bufferedWriter; // Write file
    private static String path;

    public static void writeFile(String[] content){
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path ,true));
            bufferedWriter.write(Comma.concat(content,Comma.COMMA));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(){
        List<String> arrayContent = new ArrayList<String>();
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                arrayContent.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrayContent;
    }

    public static void setFullPathFile(String fileName){
        StringBuffer path = new StringBuffer("D:\\CodeGym\\A0121I1_NguyenDucVuong\\module2\\src\\THI\\data\\");
        path.append(fileName);
        path.append(Comma.CSV);

        WriteCSV.path = path.toString();
    }
}
