package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: nns */
class nns extends nnp {
    private final AudioTimestamp f = new AudioTimestamp();
    private long g;
    private long h;
    private long i;

    public nns() {
        super();
    }

    public void a(AudioTrack audioTrack, boolean z) {
        super.a(audioTrack, z);
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public final boolean c() {
        boolean timestamp = this.a.getTimestamp(this.f);
        if (timestamp) {
            long j = this.f.framePosition;
            if (this.h > j) {
                this.g++;
            }
            this.h = j;
            this.i = j + (this.g << 32);
        }
        return timestamp;
    }

    public final long d() {
        return this.f.nanoTime;
    }

    public final long e() {
        return this.i;
    }
}
