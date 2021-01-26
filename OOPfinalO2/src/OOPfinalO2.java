
interface JudoAttackBehaviour{
    default Fighter judoAttackTo(Fighter as){
        as.health-=5;
        return as;
    }
}
interface MuayThaiAttackBehaviour{
    default Fighter MuayAttackTo(Fighter asd){

        asd.health-=5;
        return asd;
    }
}
interface BoxingAttackBehaviour{
    default Fighter BoxingAttackTo(Fighter qwe){
        qwe.health-=5;
        return qwe;
    }
}

abstract class Fighter{
    protected String name;
    protected int health;

    public Fighter(String name, int health) {
        this.name = name;
        this.health = health;
    }
    Fighter attackTo(Fighter a){
        a.health-=10;
        return a;
    }
    void defense(){
        this.health=health+10;
    }
}

class KibishiFighter extends Fighter implements JudoAttackBehaviour{
    public KibishiFighter(String name, int health) {
        super(name, health);
    }

    @Override
    public Fighter judoAttackTo(Fighter as) {
        return null;
    }
}
class HybridFighter extends Fighter implements MuayThaiAttackBehaviour,BoxingAttackBehaviour{
    public HybridFighter(String name, int health) {
        super(name, health);
    }

    @Override
    public Fighter MuayAttackTo(Fighter asd) {
        return null;
    }

    @Override
    public Fighter BoxingAttackTo(Fighter qwe) {
        return null;
    }
}


public class OOPfinalO2 {
    public static void main(String[] args) {
        boolean isDead;
        Fighter F1 = new KibishiFighter("Batuhan",100);
        Fighter F2 = new HybridFighter("hasan",100);

        if (F1.health != 0  ||  F2.health !=0)
            F1.attackTo( F2);
            F1.defense();
            F2.attackTo( F1);



    }
}
