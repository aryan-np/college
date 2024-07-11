package wk5;
interface LivingBeing{
    void specialFeature();
}
class Fish implements LivingBeing{
    @Override
    public void specialFeature() {
        System.out.println("Can Swim");
    }
}
class Bird implements LivingBeing{
    @Override
    public void specialFeature() {
        System.out.println("Can Fly");
    }
}
public class Task4 {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.specialFeature();
        Bird bird = new Bird();
        bird.specialFeature();
    }
}
