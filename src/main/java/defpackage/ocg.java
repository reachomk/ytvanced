package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: ocg */
final class ocg {
    public final AudioTrack a;
    public final AudioTimestamp b = new AudioTimestamp();
    public long c;
    public long d;
    public long e;

    public ocg(AudioTrack audioTrack) {
        this.a = audioTrack;
    }

    public final long a() {
        return this.b.nanoTime / 1000;
    }
}
