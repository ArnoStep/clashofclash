public class Barbarian extends Human implements closeFighter {

    public Barbarian(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public void run() {
        System.out.println(specialization + " Варвар " + name + " бежит напролом с мечом! ");
    }

    @Override
    public void die() {
        System.out.println(specialization + " Варвар " + name + " погиб на поле боя! ");
    }

    @Override
    public void swordStrike() {
        System.out.println(specialization + " Варвар " + name + " атакует элитным мечом! ");
    }

    @Override
    public void hideBehindShield() {
        System.out.println(specialization + " Варвар " + name + " Укрылся мегащитом! ");
    }
}
