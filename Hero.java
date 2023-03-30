import java.util.Random;
public class Hero {
    String name; int hitPoints;

    Hero(String n){
        name = n; hitPoints = 100;
    }
    public String getName(){return name;}
    public int getHitPoints(){return hitPoints;}
    public String toString(){return "Hero{name= '" + name + "', hitPoints=" + hitPoints;}
    public void attack(Hero opponent){
        Random random = new Random();
        double value = random.nextDouble(0.99);
        if(value >= 0.50){
            opponent.hitPoints = opponent.hitPoints - 10;
        }else{
            hitPoints = hitPoints - 10;
        }}

    public void senzuBean(){
        hitPoints = 100;
    }

    private void fightUntilTheDeathHelper(Hero oppo){
        while(hitPoints > 0 && oppo.hitPoints > 0){
            attack(oppo);}}

    public String fightUntilTheDeath(Hero oppo){
        senzuBean();
        oppo.senzuBean();
        fightUntilTheDeathHelper(oppo);
        return name + ": " + hitPoints + "      " + oppo.name+ ": " + oppo.hitPoints;
    }

    private int[] nFightsToTheDeathHelper(Hero opponent, int n) {
        int[] ye = new int[2];
        for (int i = 0; i < n; i++) {
            fightUntilTheDeathHelper(opponent);
            if(hitPoints>0){
                ye[0]++;
            }else{
                ye[1]++;}
        }return ye;
    }

    public String nFightsToTheDeath(Hero opponent, int n){
        int[]ye = nFightsToTheDeathHelper(opponent, n);

        if(ye[0]>ye[1]){
            return name + ": "+ ye[0] + " wins\n" + opponent.name + ": "+ ye[1] + " wins\n" + name + " wins!";
        } else if (ye[0]<ye[1]) {
            return name + ": "+ ye[0] + " wins\n" + opponent.name + ": "+ ye[1] + " wins\n" + opponent.name + " wins!";
        }else{
            return name + ": "+ ye[0] + " wins\n" + opponent.name + ": "+ ye[1] + " wins\n OMG! It was actually a draw!";
        }
    }

    public void dramaticFightToTheDeath(Hero oppo){
        senzuBean();
        oppo.senzuBean();
        while(hitPoints > 0 && oppo.hitPoints > 0){
            attack(oppo);
            System.out.println(name + ": " + hitPoints + "    " + oppo.name + ": " + oppo.hitPoints);
        }
    }
    }

