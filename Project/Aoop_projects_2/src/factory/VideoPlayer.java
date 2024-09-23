package factory;

public class VideoPlayer {
    private boolean isPlaying;
    private String videoTitle;
    private int currentTime;

    public void play(String videoTitle) {
        this.videoTitle = videoTitle;
        isPlaying = true;
        currentTime = 0;
        System.out.println("Playing video: " + videoTitle);
    }

    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Pausing video: " + videoTitle);
        }
    }

    public void stop() {
        isPlaying = false;
        currentTime = 0;
        System.out.println("Stopping video: " + videoTitle);
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public String getVideoTitle() {
        return videoTitle;
    }
}
