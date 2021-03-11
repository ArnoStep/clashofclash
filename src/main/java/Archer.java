public class Archer extends Human implements longFighter {

    public Archer(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public void run() {
        System.out.println(specialization + " Лучник " + name + " бежит на свою позицию для стрельбы! ");
    }

    @Override
    public void die() {
        System.out.println(specialization + " Лучник " + name + " погиб на поле боя! ");
    }

    @Override
    public void dodge() {
        System.out.println(specialization + " Лучник " + name + " уклонился! ");
    }

    @Override
    public void barrageOfArrowsShoot() {
        System.out.println(specialization + " Лучник " + name + " выпускает град стрел! ");
    }
}
