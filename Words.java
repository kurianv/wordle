import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Scanner; 

public class Words {

    //fields
    private static ArrayList<String> wordle;
    private static Random rand;
    
    //read a file
    public static ArrayList<String> fileRead() throws Exception
    {
        wordle = new ArrayList<>();
        Path path = Paths.get("wordle.txt"); //selects the file
        Scanner scanner = new Scanner(path);//reads it

        //read line by line
        while(scanner.hasNextLine()){//boolean value to check if there is data
            //process each line
            String line = scanner.nextLine();
            wordle.add(line);//adds to the arraylist
        }
        scanner.close();

        return wordle;
          
    } 
    
    //selects a random word from the wordle arraylist
    public static String randomWord() throws Exception{
        fileRead();
        rand = new Random();
        int randInt = rand.nextInt(wordle.size());
        return wordle.get(randInt);
    }
}
          
    

