public class RollLoadedDie {
    public static void main(String[] args) {
        double rand = Math.random();
        int roll;
        if (rand < (double) 1/8) roll = 1;
        else if (rand < (double) 2/8) roll = 2;
        else if (rand < (double) 3/8) roll = 3;
        else if (rand < (double) 4/8) roll = 4;
        else if (rand < (double) 5/8) roll = 5;
        else roll = 6;

        System.out.println(roll);
    }
}
