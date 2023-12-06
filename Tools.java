import java.util.*;
public class Tools{
    //fields
    private static ArrayList<String> wordsToArray;
    private static String[] inputList = new String[]{" -", " -", " -", " -", " -"};
    private static String[] layout = new String[]{" - - - - -", " - - - - -", " - - - - -", " - - - - -", " - - - - -", " - - - - -"};
    private static int count = 0;

    //checks the word letter by letter and then return the letter and blank if the value is at its right position.
    public static String checker(String userWord, String selectedWord){
        String word = userWord.toUpperCase();
        wordToArray(selectedWord); //converts word into array

        //loop to check if the letter is found in the wordArray
        for(int i = 0; i < wordsToArray.size(); i++){
            //checks if the letter and the index in the users word and selected word is same
            if (word.contains(wordsToArray.get(i)) == true && wordsToArray.get(i).equals(word.substring(i, i+1))){
                inputList[i] = (" "+ wordsToArray.get(i)).toUpperCase();

            }

            //checks if the letter is in the selected word and if the index isn't the same
            else if (word.contains(wordsToArray.get(i)) == true && i != word.indexOf(wordsToArray.get(i))){
                int index = word.indexOf(wordsToArray.get(i));
                inputList[i] = " -";
                System.out.println("The character " + word.substring(index, index+1) + " is in the word at the wrong position.");
            }

            else{
                inputList[i] = " -";
            }

        }
        //sets up the board and add the word to the list
        layout[count] = arrayToWord(inputList);//array into a string
        count++;
        wordsToArray.clear();
        
        System.out.println("______________________________________________________");
        printBoard();
        return arrayToWord(inputList);
        
    }

    //changes words into a arrayList
    public static void wordToArray(String word){
        wordsToArray = new ArrayList<>();
        for(int i = 0; i < word.length(); i++){
            wordsToArray.add(word.substring(i, i+1).toUpperCase());
        }
    }

    //changes array into a word
    public static String arrayToWord(String[]characters){
        String fullWord = "";
        for (int i = 0; i < characters.length; i++){
            fullWord += characters[i].toUpperCase();
        }
        return fullWord;
    }

    //prints the board
    public static void printBoard(){
        System.out.println();
        for(int i = 0; i < layout.length; i++){
            System.out.println(layout[i]);
        }
        System.out.println();

    }

    //clean the board
    public static void cleanBoard(){
        System.out.println();
        for(int i = 0; i < layout.length; i++){
            layout[i] = " - - - - -";
            count = 0;
        }
    }
}
