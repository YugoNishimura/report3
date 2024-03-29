package jp.ac.uryukyu.ie.e195719;

public class Enemy extends LivingThing {
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void wounded(int damage) {
        setHitPoint(damage);
        if (getHitPoint() < 0) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}