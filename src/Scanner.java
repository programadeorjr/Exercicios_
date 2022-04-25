import java.io.*;

public class Scanner {
    public static void main(String [] args) throws IOException {
        while(!new Scanner().hasNextLine()){
            boolean notLine = !new Scanner().hasNextLine();
            System.out.println(!notLine);
        }
    }

    private boolean hasNextLine() {
        return false;
    }
}
    
