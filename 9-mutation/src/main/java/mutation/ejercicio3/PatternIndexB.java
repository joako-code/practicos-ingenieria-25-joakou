package mutation.ejercicio3;

// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 9; page 256
// Can be run from command line
// See PatternIndexTest.java, DataDrivenPatternIndexTest.java  for JUnit tests

public class PatternIndexB
{


  /**
    * Find index of pattern in subject string
    * 
    * @param subject String to search
    * @param pattern String to find
    * @return index (zero-based) of first occurrence of pattern in subject; -1 if not found
    * @throws NullPointerException if subject or pattern is null
    */
   public static int patternIndex (String subject, String pattern)
   {
      final int NOTFOUND = -1;
      int  iSub = 0, rtnIndex = NOTFOUND;
      boolean isPat  = false;
      int subjectLen = subject.length();
      int patternLen = pattern.length();
   
      while (isPat == false && iSub + patternLen - 1 < subjectLen)
      {
         if (subject.charAt(iSub) == pattern.charAt(0))
         {
            rtnIndex = iSub; // Starting at zero
            isPat = true;
            for (int iPat = 1; iPat < patternLen; iPat ++)
            {
               if (subject.charAt(iSub + iPat) != pattern.charAt(iPat))
               {
                  rtnIndex = NOTFOUND;
                  // System.out.println ("inside inner if statement (reached)");
                  // isPat = false;
                  isPat = true;   // Mutated statement
                  break;  // out of for loop
               }
            }
         }
         iSub ++;
      }
      return (rtnIndex);
   }
}
