package Adapter.TwoWayAdapter.DTO;
public class VLCPlayer implements AdvancedMediaPlayer {
    public void playVLC(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}
