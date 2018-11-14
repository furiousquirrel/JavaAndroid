package lesson5;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        URL imagePath = new URL("http://ladylike.su/wp-content/uploads/2018/02/159261380.jpg");
        String fileName = imagePath.getFile();
        fileName= fileName.substring(fileName.lastIndexOf('/')+1, fileName.length());

        try (InputStream in = imagePath.openStream(); OutputStream out = Files.newOutputStream(Paths.get(fileName))) {
            int i=-1;
            while ((i=in.read())!=-1) {
                out.write(i);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
