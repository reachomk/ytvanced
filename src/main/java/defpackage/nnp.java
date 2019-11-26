package defpackage;

import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;

/* renamed from: nnp */
class nnp {
    public AudioTrack a;
    public long b;
    public long c;
    public long d;
    public long e;
    private boolean f;
    private int g;
    private long h;
    private long i;
    private long j;

    private nnp() {
    }

    public boolean c() {
        return false;
    }

    public float f() {
        return 1.0f;
    }

    public void a(AudioTrack audioTrack, boolean z) {
        this.a = audioTrack;
        this.f = z;
        this.b = -1;
        this.c = -1;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        if (audioTrack != null) {
            this.g = audioTrack.getSampleRate();
        }
    }

    public final long a() {
        if (this.b != -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            return Math.min(this.e, this.d + ((((elapsedRealtime * 1000) - this.b) * ((long) this.g)) / 1000000));
        }
        int playState = this.a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) this.a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.j = this.h;
            }
            playbackHeadPosition += this.j;
        }
        if (nxf.a <= 26) {
            if (playbackHeadPosition == 0 && this.h > 0 && playState == 3) {
                if (this.c == -1) {
                    this.c = SystemClock.elapsedRealtime();
                }
                return this.h;
            }
            this.c = -1;
        }
        if (this.h > playbackHeadPosition) {
            this.i++;
        }
        this.h = playbackHeadPosition;
        return playbackHeadPosition + (this.i << 32);
    }

    public final long b() {
        return (a() * 1000000) / ((long) this.g);
    }

    public long d() {
        throw new UnsupportedOperationException();
    }

    public long e() {
        throw new UnsupportedOperationException();
    }

    public void a(PlaybackParams playbackParams) {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ nnp(byte b) {
    }
}
