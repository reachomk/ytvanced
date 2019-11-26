package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: ocf */
final class ocf {
    public final oci a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public ocd f;
    public int g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public Method l;
    public long m;
    public boolean n;
    public boolean o;
    public long p;
    public long q;
    public long r;
    public long s;
    public int t;
    public int u;
    public long v;
    public long w;
    public long x;
    public long y;

    public ocf(oci oci) {
        this.a = (oci) oxz.a((Object) oci);
        if (ozp.a >= 18) {
            try {
                this.l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    public final boolean a(long j) {
        return j > c() || (this.h && ((AudioTrack) oxz.a(this.c)).getPlayState() == 2 && c() == 0);
    }

    public final long b(long j) {
        return (j * 1000000) / ((long) this.g);
    }

    public final void a() {
        this.j = 0;
        this.u = 0;
        this.t = 0;
        this.k = 0;
    }

    public final long b() {
        return b(c());
    }

    public final long c() {
        AudioTrack audioTrack = (AudioTrack) oxz.a(this.c);
        if (this.v != -9223372036854775807L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            return Math.min(this.y, this.x + ((((elapsedRealtime * 1000) - this.v) * ((long) this.g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.s = this.q;
            }
            playbackHeadPosition += this.s;
        }
        if (ozp.a <= 29) {
            if (playbackHeadPosition == 0 && this.q > 0 && playState == 3) {
                if (this.w == -9223372036854775807L) {
                    this.w = SystemClock.elapsedRealtime();
                }
                return this.q;
            }
            this.w = -9223372036854775807L;
        }
        if (this.q > playbackHeadPosition) {
            this.r++;
        }
        this.q = playbackHeadPosition;
        return playbackHeadPosition + (this.r << 32);
    }
}
