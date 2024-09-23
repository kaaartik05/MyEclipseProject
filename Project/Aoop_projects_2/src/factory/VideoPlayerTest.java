package factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VideoPlayerTest {

    @Test
    public void testPlayVideo() {
        VideoPlayer player = new VideoPlayer();
        player.play("sample-video.mp4");
        assertTrue(player.isPlaying(), "Video should be playing.");
        assertEquals("sample-video.mp4", player.getVideoTitle(), "Video title should be 'sample-video.mp4'.");
    }

    @Test
    public void testPauseVideo() {
        VideoPlayer player = new VideoPlayer();
        player.play("sample-video.mp4");
        player.pause();
        assertFalse(player.isPlaying(), "Video should be paused.");
    }

    @Test
    public void testStopVideo() {
        VideoPlayer player = new VideoPlayer();
        player.play("sample-video.mp4");
        player.stop();
        assertFalse(player.isPlaying(), "Video should be stopped.");
        assertEquals(0, player.getCurrentTime(), "Current time should be reset to 0.");
    }
}
