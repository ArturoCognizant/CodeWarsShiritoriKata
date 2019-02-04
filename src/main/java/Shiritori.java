import java.util.*;
public class Shiritori
{
    public static List<String> theGame(List<String> words)
    {
        //Your Code Goes Here!
        List<String> results = new ArrayList<String>();
        char prevLastLetter = ' ';
        for (String word : words)
        {
            if (word == null || word.trim() == "")
            {
                return results;
            }

            if (prevLastLetter == ' ' || word.charAt(0) == prevLastLetter)
            {
                results.add(word);
                prevLastLetter = word.charAt(word.length() - 1);
            }
            else
            {
                return results;
            }
        }
        return results;
    }
}
