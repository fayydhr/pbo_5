public class MusicPlayer {
    private boolean isPlaying;

    public MusicPlayer() {
        this.isPlaying = false;
    }

    public void play(Track track) {
        if (isPlaying) {
            System.out.println("A track is already playing. Stop it first.");
        } else {
            System.out.println("Playing: " + track.getTitle());
            isPlaying = true;
        }
    }

    public void stop() {
        if (isPlaying) {
            System.out.println("Music stopped.");
            isPlaying = false;
        } else {
            System.out.println("No track is currently playing.");
        }
    }
}
