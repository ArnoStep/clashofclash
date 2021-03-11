public abstract class Human {
    protected String name;
    protected String specialization;

    public abstract void run();
    public void die() {
        System.out.println(name + " погиб на поле боя! ");
    };
}
