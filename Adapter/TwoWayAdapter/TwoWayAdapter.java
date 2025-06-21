package Adapter.TwoWayAdapter;

import Adapter.TwoWayAdapter.Adapter.MediaAdapter;
import Adapter.TwoWayAdapter.DTO.AdvancedMediaPlayer;
import Adapter.TwoWayAdapter.DTO.MP3Player;
import Adapter.TwoWayAdapter.DTO.MediaPlayer;
import Adapter.TwoWayAdapter.DTO.VLCPlayer;

public class TwoWayAdapter {
    public static void main(String[] args) {
        // Play MP3 with native player
        MediaPlayer mp3Player = new MP3Player();
        mp3Player.playMP3("song.mp3");

        // Play MP3 using VLCPlayer via adapter
        MediaAdapter vlcViaAdapter = new MediaAdapter(new VLCPlayer());
        vlcViaAdapter.playVLC("movie.vlc");
        vlcViaAdapter.playMP3("converted_from_vlc.mp3");
        System.out.println("--------------------");
        // Play VLC using MP3Player via adapter
        MediaAdapter mp3ViaAdapter = new MediaAdapter(new MP3Player());
        mp3ViaAdapter.playMP3("converted_from_mp3.mp3");
        mp3ViaAdapter.playVLC("converted_to_vlc.vlc");
    }
}
