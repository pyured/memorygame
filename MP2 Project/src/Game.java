public class Game {
    private static int difficulty;
    private static Blanket[] questionBlankets;
    private static Blanket[] userBlankets;
    public static void setDifficulty(int x)
    {
        difficulty = x;
    }
    private static int randomBlanket()
    {
        return (int)(Math.random()*4) + 1;
    }
    public static Blanket[] questionBlankets()
    {
        return questionBlankets;
    }
    public static Blanket[] userBlankets()
    {
        return userBlankets;
    }
    public static void setUserBlanketsIndex(int i, Blanket b)
    {
        userBlankets[i] = b;
    }
    public Game()
    {
        questionBlankets = new Blanket[5*difficulty];
        userBlankets = new Blanket[5*difficulty];
        for (int i = 0; i < questionBlankets.length; i++)
        {
            questionBlankets[i] = new Blanket(randomBlanket());
        }
    }
}
