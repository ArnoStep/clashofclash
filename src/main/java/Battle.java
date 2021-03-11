public class Battle {
    public static void start() {
        Archer archer1 = new Archer("Генри", "Стреляющий");
        Archer archer2 = new Archer("Том", "Прикрывающий");
        Archer archer3 = new Archer("Гарри", "Командующий");

        Barbarian barbarian1 = new Barbarian("Рон", "Главный");
        Barbarian barbarian2 = new Barbarian("Джефф", "Таранный");
        Barbarian barbarian3 = new Barbarian("Рико", "Подрывной");

        System.out.println("Битва между Варварами и Лучниками началась");
        barbarian2.run();
        archer1.dodge();
        archer1.barrageOfArrowsShoot();
        barbarian1.hideBehindShield();
        barbarian3.swordStrike();
        archer3.die();
        archer2.run();
        archer2.barrageOfArrowsShoot();
        barbarian3.die();
        barbarian2.run();
        archer1.die();
        archer2.barrageOfArrowsShoot();
        barbarian2.die();
        barbarian1.hideBehindShield();
        barbarian1.swordStrike();
        archer2.die();
        System.out.println("Варвары победили!");
    }
}
