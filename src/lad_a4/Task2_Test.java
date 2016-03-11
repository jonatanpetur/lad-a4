package lad_a4;

/**
 * Created by jpp on 10/03/16.
 */
public class Task2_Test {
    public static void main(String[] args)
    {

        //test JPP implementation
        SortedList jpt2 = new Task2_JonatanPetursson<String>();
        System.out.println("Resulting hashcode " + hashCodeTester(jpt2));

        //test RP implementation
        SortedList rpt2 = new Task2_RaphaelPuccinelli<String>();
        System.out.println("Resulting hashcode " + hashCodeTester(rpt2));

        //test AV implementation
        SortedList avt2 = new Task2_AxelVerner<>();
        System.out.println("Resulting hashcode " + hashCodeTester(avt2));

    }

    public static int hashCodeTester(SortedList sortedList)
    {

        System.out.println("Testing with " + 100 + " words");
        for(int i = 0; i < 100; i++)
        {
            int length = (int)(Math.random() * 50);
            String word = "";
            for(int j=0; j<length; j++)
            {
                String letters = "abcdefghijklmnopqrstxyzABCDEFGHJKLIMNOPQRSTXYZ";
                word += letters.charAt((int)(Math.random() *  letters.length()));
            }
            //System.out.println(word);
            sortedList.add(word);
        }

        return sortedList.hashCode();
    }
}
