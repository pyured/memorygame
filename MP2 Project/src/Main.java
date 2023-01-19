public class Main
{
    public static void main(String[] args)
    {
        MyFrame frame = new MyFrame();
        
        //i couldn't find a way to fit in the requirements so:
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(nums[3]);
        Pig johnny = new Pig();
        Pig daniel = new Pig();
        Pig robert = new Pig();
        Pig johnny2 = new Pig();
        johnny.setName("Johnny");
        daniel.setName("Daniel");
        robert.setName("Robert");
        johnny2.setName("Johnny");
        Pig[] pigs = {johnny, daniel, robert, johnny2};
        System.out.println(arrayToString(pigs));
        System.out.println(hasDuplicates(pigs));
        int i = 0;
        while (i < pigs.length)
        {
            System.out.println(pigs[i]);
            i++;
        }
    }
    public static String arrayToString(Pig[] b)
    {
        String str = "";
        for (Pig i : b)
        {
            str += i.getName() + " ";
        }
        return str;
    }
    public static boolean hasDuplicates(Pig[] pigs)
    {
        int count = 0;
        for (Pig p : pigs)
        {
            for (Pig i : pigs)
            {
                if (p.getName().equals(i.getName()))
                {
                    count++;
                }
            }
            return count >= 2;
        }
        return false;
    }
}