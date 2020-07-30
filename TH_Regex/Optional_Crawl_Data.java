package TH_Regex;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Optional_Crawl_Data {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("<a  data-utm=\"Cate_TheGioi|Top3|3\"\n" +
                    "    href=\"/the-gioi/can-canh-iran-phong-thu-ten-lua-tu-long-dat-dau-tien-tren-the-gioi-20200730143058778.htm\"\n" +
                    "    title=\"Cận cảnh Iran phóng thử tên lửa từ lòng đất đầu tiên trên thế giới\">Cận cảnh Iran phóng thử tên lửa từ lòng đất đầu tiên trên thế giới+(.*?)+</a>\n");
            Matcher matcher = p.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
