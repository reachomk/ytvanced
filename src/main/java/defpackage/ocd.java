package defpackage;

import android.media.AudioTrack;

/* renamed from: ocd */
final class ocd {
    public final ocg a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public ocd(AudioTrack audioTrack) {
        if (ozp.a >= 19) {
            this.a = new ocg(audioTrack);
            b();
            return;
        }
        this.a = null;
        a(3);
    }

    public final void a() {
        a(4);
    }

    public final void b() {
        if (this.a != null) {
            a(0);
        }
    }

    public final long c() {
        ocg ocg = this.a;
        return ocg != null ? ocg.a() : -9223372036854775807L;
    }

    public final long d() {
        ocg ocg = this.a;
        if (ocg == null) {
            return -1;
        }
        return ocg.e;
    }

    public final void a(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0;
            this.f = -1;
            this.c = System.nanoTime() / 1000;
            this.d = 5000;
        } else if (i == 1) {
            this.d = 5000;
        } else if (i == 2 || i == 3) {
            this.d = 10000000;
        } else {
            this.d = 500000;
        }
    }
}
