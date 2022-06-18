public class numTimes {
    public static int numTimes(String paragraph, String word) {
      
        String n[] = paragraph.split(" ");
        
        int wordCount = 0;
        for (int i = 0; i < n.length; i++) {
        
        if (word.equals(n[i]))
          wordCount++;
        }
        return wordCount;
      }
    
    public static void main(String args[]) {
      String paragraph = "what is going on?";
      String word = "what";
      System.out.println(numTimes(paragraph, word));
    }
}
