package exercise1;

public class Main {

    public static void main(String[] args) {
        Television tv = new Television();

        // Channel and volume should not change
        tv.changeVolume(20);
        tv.switchChannel(130);

        // Channel and volume should change
        tv.changeVolume(300);
        tv.switchChannel(10);
    }

}
