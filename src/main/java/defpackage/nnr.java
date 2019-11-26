package defpackage;

import android.media.AudioTrack;
import android.media.PlaybackParams;

/* renamed from: nnr */
final class nnr extends nns {
    private PlaybackParams f;
    private float g = 1.0f;

    public final void a(AudioTrack audioTrack, boolean z) {
        super.a(audioTrack, z);
        g();
    }

    public final void a(PlaybackParams playbackParams) {
        if (playbackParams == null) {
            playbackParams = new PlaybackParams();
        }
        playbackParams = playbackParams.allowDefaults();
        this.f = playbackParams;
        this.g = playbackParams.getSpeed();
        g();
    }

    public final float f() {
        return this.g;
    }

    private final void g() {
        AudioTrack audioTrack = this.a;
        if (audioTrack != null) {
            PlaybackParams playbackParams = this.f;
            if (playbackParams != null) {
                audioTrack.setPlaybackParams(playbackParams);
            }
        }
    }
}
