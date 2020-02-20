public class TwelveDays
{
    public static void main(String[] args)
    {

    }

    public static void getVerse(int day)
    {

        if (day>1)
        {
            getVerse(day-1);
        }

        switch(day)
        {
            case 1:
                System.out.println("On the first day of Christmas," +
                        "My true love sent to me" +
                        "A partridge in a pear tree.");
            case 2:
                System.out.println("On the second day of Christmas, " +
                        "My true love sent to me " +
                        "Two turtle doves");
            case 3:
                System.out.println("On the third day of Christmas, " +
                        "My true love sent to me " +
                        "Three French hens");
            case 4:
                System.out.println("On the fourth day of Christmas, " +
                        "My true love sent to me " +
                        "Four calling birds");
            case 5:
                System.out.println("");
        }
    }
}
