package Adapter.TwoWayAdapter.DTO;

public class MP3Player implements MediaPlayer {
    public void playMP3(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}