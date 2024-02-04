package exercise1;

import java.util.Objects;

public class Television {

    Integer channel = 130;
    Integer volume = 20;

    void switchChannel(Integer newChannel) {

        Objects.requireNonNull(newChannel, "New channel must be informed.");

        if (channel.equals(newChannel)) {
            System.out.println("New channel is also the current channel.");
        } else {
            channel = newChannel;
            System.out.println("Channel switched to " + channel);
        }
    }

    void changeVolume(Integer newVolume) {

        Objects.requireNonNull(newVolume, "New volume must be informed.");

        if (newVolume.equals(volume)) {
            System.out.println("New volume is also the current volume.");
        } else {
            volume = newVolume;
            System.out.println("Volume changed to " + volume);
        }
    }
}