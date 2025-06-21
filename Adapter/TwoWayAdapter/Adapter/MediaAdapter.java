package Adapter.TwoWayAdapter.Adapter;

import Adapter.TwoWayAdapter.DTO.AdvancedMediaPlayer;
import Adapter.TwoWayAdapter.DTO.MediaPlayer;

public class MediaAdapter implements MediaPlayer, AdvancedMediaPlayer {
    private MediaPlayer mp3Player;
    private AdvancedMediaPlayer vlcPlayer;

    public MediaAdapter(MediaPlayer mp3Player) {
        this.mp3Player = mp3Player;
    }

    public MediaAdapter(AdvancedMediaPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    // MediaPlayer interface
    @Override
    public void playMP3(String fileName) {
        if (mp3Player != null) {
            mp3Player.playMP3(fileName);
        } else {
            System.out.println("Converting MP3 to VLC...");
            playVLC(fileName);
        }
    }

    // AdvancedMediaPlayer interface
    @Override
    public void playVLC(String fileName) {
        if (vlcPlayer != null) {
            vlcPlayer.playVLC(fileName);
        } else {
            System.out.println("Converting VLC to MP3...");
            playMP3(fileName);
        }
    }
}
