import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        Scanner cin2 = new Scanner(System.in);

        System.out.print("Enter # of words to enter: ");
        int count = cin.nextInt();
        System.out.println(" ");

        String[] words = new String[count];
        String[] rev = new String[words.length];

        for(int i = 0; i < words.length; i++)
        {
            System.out.print("Enter words: ");
            words[i] = cin2.nextLine();


            }
        System.out.println(" ");





        for(int t = 0; t <= words.length - 1; t++)
        {

            rev[t] = "";
            for (int j = words[t].length() - 1; j >= 0; j--)
            {
                rev[t]+= words[t].substring(j, j + 1);



            }

            System.out.printf("\nWord: %-15s", words[t]);
            System.out.printf("Backwards: %-15s", rev[t]);
        }







    }
}
