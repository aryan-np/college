package wk3;

public class Task2 {
    public static void main(String[] args) {
        float[] arr = {1.2f,33.3f,12.67f,16.66f,17.34f};
        float sum=0;
        for (float e: arr) {
            sum+=e;
        }
        float avg = sum/ arr.length;
        System.out.println("sum:"+sum);
        System.out.println("avg:"+avg);
    }
}
