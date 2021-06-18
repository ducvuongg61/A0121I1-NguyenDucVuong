package b16_IO.optional;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            //Doc file theo duong dan
            File file = new File(filePath);
            //kiem tra file va nem ra ngoai le
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            //Doc tung dong cua file va tien hanh cong lai
            //BufferedReader dung de doc du lieu trong file
            //BufferedWrite dung de ghi du lieu trong file
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("TONG = " + sum);
        } catch (Exception e) {
            System.out.println("File khong ton tai hoac noi dung co loi!");
        }
    }


}
