package lad_a4;

/**
 * Created by jpp on 10/03/16.
 */
public class Task2_Test {
    public static void main(String[] args)
    {

        //test JPP implementation
        SortedList jpt2 = new Task2_JonatanPetursson<String>();
        System.out.println("Jonatan resulting hashcode " + hashCodeTester(jpt2));

        //test RP implementation
        SortedList rpt2 = new Task2_RaphaelPuccinelli<String>();
        System.out.println("Raphael resulting hashcode " + hashCodeTester(rpt2));

        //test AV implementation
        SortedList gct2 = new Task2_GeoffreyChen<>();
        System.out.println("Geoffrey resulting hashcode " + hashCodeTester(gct2));

        //test AV implementation
        SortedList avt2 = new Task2_AxelVerner<>();
        System.out.println("Axel resulting hashcode " + hashCodeTester(avt2));

        //Test SS implementation
        SortedList sst2 = new Task2_SamiSindi<String>();
        System.out.println("Sami resulting hashcode " + hashCodeTester(sst2));


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
