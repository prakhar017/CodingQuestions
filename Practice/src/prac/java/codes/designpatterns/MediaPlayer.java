package prac.basics.java.codes.designpatterns;

public interface MediaPlayer {

    void play(String filename);
}

class MP3Player implements MediaPlayer {

    @Override
    public void play(String filename) {
        System.out.println("Playing mp3 with file" + filename);
    }
}

class MP4Player {

    public void playMP4(String filename) {
        System.out.println("Playing mp4 with file" + filename);

    }
}

class MP4Adapter implements MediaPlayer {

    private MP4Player mp4Player;

    public MP4Adapter(MP4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void play(String filename) {
        mp4Player.playMP4(filename);
    }
}


class MediaPlayer_Main {

    public static void main(String[] args) {


        MediaPlayer mediaPlayer = new MP3Player();
        MediaPlayer mediaPlayer1 = new MP4Adapter(new MP4Player());

        mediaPlayer.play("mp3file");
        mediaPlayer1.play("mp4file");
    }
}
