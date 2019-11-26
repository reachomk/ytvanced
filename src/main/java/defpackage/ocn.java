package defpackage;

import android.media.AudioTrack;

/* renamed from: ocn */
final class ocn {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final obq[] k;

    public ocn(boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3, obq[] obqArr) {
        int minBufferSize;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        if (z) {
            minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
            oxz.b(minBufferSize != -2);
            minBufferSize = ozp.a(minBufferSize << 2, ((int) b(250000)) * this.d, (int) Math.max((long) minBufferSize, b(750000) * ((long) this.d)));
        } else {
            if (i6 == 5) {
                i3 = 80000;
            } else if (i6 == 6) {
                i3 = 768000;
            } else if (i6 == 7) {
                i3 = 192000;
            } else if (i6 == 8) {
                i3 = 2250000;
            } else if (i6 == 14) {
                i3 = 3062500;
            } else if (i6 == 17) {
                i3 = 336000;
            } else {
                throw new IllegalArgumentException();
            }
            if (i6 == 5) {
                i3 += i3;
            }
            minBufferSize = (int) ((((long) i3) * 250000) / 1000000);
        }
        this.h = minBufferSize;
        this.i = z2;
        this.j = z3;
        this.k = obqArr;
    }

    public final boolean a(ocn ocn) {
        return ocn.g == this.g && ocn.e == this.e && ocn.f == this.f;
    }

    public final long a(long j) {
        return (j * 1000000) / ((long) this.e);
    }

    private final long b(long j) {
        return (j * ((long) this.e)) / 1000000;
    }
}
