package wk3;

class Box{
    int width,depth,height;
    public Box(int length){
        this.width = length;
        this.depth = length;
        this.height = length;
    }
    public Box(int length,int breadth,int height){
        this.width = length;
        this.depth = breadth;
        this.height = height;
    }
    public Box(){
        this.width = 10;
        this.depth = 8;
        this.height = 12;
    }
    void getVolume(){
        int vol=width*depth*height;
        System.out.println("Volume="+vol);
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box cube = new Box(5);
        Box cuboid = new Box(5,6,8);
        Box box = new Box();
        cube.getVolume();
        cuboid.getVolume();
        box.getVolume();
    }
}

