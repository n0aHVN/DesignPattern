package Adapter.TwoWayAdapter.Adapter;

import Adapter.TwoWayAdapter.DTO.AdvancedMediaPlayer;
import Adapter.TwoWayAdapter.DTO.MediaPlayer;

// This is 2-way Adapter
public class MediaAdapter implements MediaPlayer, AdvancedMediaPlayer {
    //Contains 2 classes
    private MediaPlayer mp3Player;
    private AdvancedMediaPlayer vlcPlayer;

    //Overloading
    public MediaAdapter(MediaPlayer mp3Player) {
        this.mp3Player = mp3Player;
    }

    public MediaAdapter(AdvancedMediaPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    // If mp3Player is exist, then playMp3
    // else convert MP3 to VLC, then using playVLC to play it.
    @Override
    public void playMP3(String fileName) {
        if (mp3Player != null) {
            mp3Player.playMP3(fileName);
        } else {
            System.out.println("Converting MP3 to VLC...");
            playVLC(fileName);
        }
    }

    // if vlcPlayer is exist, use it play
    // else, convert VLC to MP3 then play it
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
