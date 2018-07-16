/**
 * Created by avck25 on 7/15/2018.
 */
public class LongestWord {


    public static void main(String[] args) {


        if( args.length > 0) {
           EvaluateLongestWord elw = new EvaluateLongestWord(args[0]);
            System.out.println("longest Word(s): " + elw.getLongestWord());
            System.out.println("length: " + elw.getLength());
        }



    }
}
