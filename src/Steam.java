import java.io.*;
import java.nio.file.*;
import java.util.stream.*;


public class Steam {
    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(Paths.get("text.txt"))) {
            stream.forEach(System.out::println);
        } 
        catch (IOException e) {
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }
}
