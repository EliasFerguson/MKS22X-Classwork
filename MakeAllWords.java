import java.util.*;
public class MakeAllWords {
  public static void main(String[] args) {
    System.out.println(makeAllWords(1, 26).toString());
  }
  public static ArrayList<String> makeAllWords(int k, int maxLetter) {
    ArrayList<String> output = new ArrayList<String>();
    makeAllWordsH(k, maxLetter, "", output);
    return output;
  }
  public static void makeAllWordsH(int k, int maxLetter, String word, ArrayList<String> list) {
    if (k == 0) list.add(word);
    else {
      for (int i = 0; i < maxLetter; i++) {
        int tempInt = 'a' + i;
        char tempChar = (char) tempInt;
        makeAllWordsH(k - 1, maxLetter, word + tempChar, list);
      }
    }
  }
}
