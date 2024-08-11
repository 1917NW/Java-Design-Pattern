package adapter;


import classes.MP3Player;

public class MP3PlayerAdapter implements MediaPlayer {

    MP3Player mp3Player = new MP3Player();


    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            mp3Player.showMusic();
        }
    }
}
