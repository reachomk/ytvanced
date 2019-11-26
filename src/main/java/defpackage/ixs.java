package defpackage;

/* renamed from: ixs */
final /* synthetic */ class ixs implements Runnable {
    private final ixp a;

    ixs(ixp ixp) {
        this.a = ixp;
    }

    public final void run() {
        ixp ixp = this.a;
        while (ixp.b.getRecordingState() == 3) {
            int i = ixp.s;
            byte[] bArr = new byte[i];
            int i2 = 0;
            i = ixp.b.read(bArr, 0, i);
            if (i > 0) {
                iyj iyj = ixp.n;
                int i3 = i >> 1;
                long j = 0;
                long j2 = 0;
                while (i >= 2) {
                    int i4 = i - 2;
                    i = (bArr[i - 1] << 8) + (bArr[i4] & 255);
                    j2 += (long) i;
                    j += (long) (i * i);
                    i = i4;
                }
                float sqrt = (float) Math.sqrt((double) (((j * ((long) i3)) - (j2 * j2)) / ((long) (i3 * i3))));
                if (!iyj.b && sqrt == 0.0f) {
                    xtl.b("SpeechLevelGenerator", "Really low audio levels detected. The audio input may have issues.");
                    iyj.b = true;
                }
                float f = iyj.a;
                if (f < sqrt) {
                    f = (f * 0.999f) + (0.001f * sqrt);
                    iyj.a = f;
                } else {
                    f = (f * 0.95f) + (0.05f * sqrt);
                    iyj.a = f;
                }
                float f2 = -120.0f;
                if (((double) f) > 0.0d) {
                    double d = (double) (sqrt / f);
                    if (d > 1.0E-6d) {
                        f2 = ((float) Math.log10(d)) * 10.0f;
                    }
                }
                i = (int) (((Math.min(Math.max(f2, -2.0f), 10.0f) + 2.0f) * 100.0f) / 12.0f);
                if (i >= 30) {
                    i2 = (i / 10) * 10;
                }
                ixp.c.post(new ixv(ixp, i2));
                amok amok;
                if (ixp.w == null) {
                    ixp.b();
                    ixp.c.post(new ixu(ixp, new NullPointerException()));
                    return;
                } else if (ixp.c()) {
                    iym iym = ixp.A;
                    int length = bArr.length;
                    if (!iym.c) {
                        throw new IllegalStateException("You forgot to call init()!");
                    } else if (iym.b) {
                        throw new IllegalStateException("Cannot process more bytes after flushing.");
                    } else {
                        anvu a = iym.d.a(bArr, length);
                        if (a.b() > 0) {
                            bbio bbio = ixp.w;
                            amok = (amok) amoh.c.createBuilder();
                            amok.a(a);
                            bbio.a((amoh) ((anxl) amok.build()));
                        }
                    }
                } else {
                    bbio bbio2 = ixp.w;
                    amok = (amok) amoh.c.createBuilder();
                    amok.a(anvu.a(bArr));
                    bbio2.a((amoh) ((anxl) amok.build()));
                }
            } else {
                return;
            }
        }
    }
}
