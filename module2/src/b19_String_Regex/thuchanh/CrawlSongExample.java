package b19_String_Regex.thuchanh;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            //Mở luồng và đưa nó vào bufferedReader
            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
            sc.useDelimiter("\\Z");
            String content = sc.next();
            // Đóng sc
            sc.close();
            //Xóa tất cả các new line
            content = content.replaceAll("\\n+", "");
            //regex
            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
            sc.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
