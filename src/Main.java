import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String file = "text.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) !=null){
                System.out.println(line);
            }  
        }
        catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        try (Stream<String> stream = Files.lines(Paths.get("text.txt"))) {
            stream.forEach(System.out::println);
        } 
        catch (IOException e) {
            System.out.println("An error ocurred");
            e.printStackTrace();
        }

        try (Scanner entrada = new Scanner(new File(file))){
            while(entrada.hasNextLine()){
                System.out.println(entrada.nextLine());
                
            }
        } catch (Exception e) {
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }
    
}
