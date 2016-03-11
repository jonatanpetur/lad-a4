package lad_a4;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
    // Usage: Either provide path and capacity as args or hardcode into the source
    public static void main(String[] args) {
        int defaultCapacity = 20000;
        String defaultPath = "file.txt";
        if (args.length<2)
            countWords(defaultPath,defaultCapacity);
        else
            countWords(args[0],Integer.parseInt(args[1]));
    }


    
    static void countWords(String path, int capacity){
        HashMap<Integer, String> hm = new HashMap<>();
        CountingFilter cf = new CountingFilterImpl(capacity);
        try{
            Scanner sc = new Scanner(new FileInputStream(path)).useDelimiter("[ ,!?.:;\n]+");
            int n = 0;
            while (sc.hasNext()){
                String word = sc.next().toLowerCase();
                cf.add(word);
                hm.put(word.hashCode(), word);
                n++;
            }
            sc.close();
            
            System.out.println("Added "+n+" words. Input words, '.' to quit");
            Scanner in = new Scanner(System.in);
            while(true){
                String w = in.next().toLowerCase();
                if (w.equals("."))
                    break;
                System.out.println(w + " occurs at most " + cf.count(w) + " times.");
            }
        } catch(Exception e) {
            throw (new RuntimeException(e));
        }
    }
}