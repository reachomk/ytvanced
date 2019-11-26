package defpackage;

import android.util.Log;

/* renamed from: nup */
public final class nup implements nrc, nrq {
    private nre a;
    private nrs b;
    private nus c;
    private int d;
    private int e;

    public final boolean a() {
        return true;
    }

    public final void c() {
    }

    public final boolean a(nrb nrb) {
        return nur.a(nrb) != null;
    }

    public final void a(nre nre) {
        this.a = nre;
        this.b = nre.d_(0);
        this.c = null;
        nre.a();
    }

    public final void b() {
        this.e = 0;
    }

    public final int a(nrb nrb, nrm nrm) {
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        nrb nrb2 = nrb;
        Object obj = this.c;
        if (obj == null) {
            this.c = nur.a(nrb);
            obj = this.c;
            if (obj != null) {
                this.d = obj.d;
            } else {
                throw new nnc("Error initializing WavHeader. Did you sniff first?");
            }
        }
        if (obj.g == 0 || obj.h == 0) {
            nwf.a((Object) nrb);
            nwf.a(obj);
            nrb.a();
            nwz nwz = new nwz(8);
            nuu a = nuu.a(nrb2, nwz);
            while (a.a != nxf.c("data")) {
                int i5 = a.a;
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("Ignoring unknown WAV chunk: ");
                stringBuilder.append(i5);
                Log.w("WavHeaderReader", stringBuilder.toString());
                long j2 = a.b + 8;
                if (a.a == nxf.c("RIFF")) {
                    j2 = 12;
                }
                if (j2 <= 2147483647L) {
                    nrb2.a((int) j2);
                    a = nuu.a(nrb2, nwz);
                } else {
                    i = a.a;
                    StringBuilder stringBuilder2 = new StringBuilder(51);
                    stringBuilder2.append("Chunk is too large (~2GB+) to skip; id: ");
                    stringBuilder2.append(i);
                    throw new nnc(stringBuilder2.toString());
                }
            }
            nrb2.a(8);
            long j3 = ((nqx) nrb2).c;
            j = a.b;
            obj.g = j3;
            obj.h = j;
            nrs nrs = this.b;
            nus nus = this.c;
            i2 = nus.b;
            i3 = nus.e;
            i4 = nus.a;
            String str = null;
            nrs.a(nmx.a(str, "audio/raw", (i3 * i2) * i4, 32768, ((nus.h / ((long) nus.d)) * 1000000) / ((long) i2), i4, i2, null, null, nus.f));
            this.a.a(this);
        }
        i = this.b.a(nrb2, 32768 - this.e, true);
        if (i != -1) {
            this.e += i;
        }
        i3 = this.e;
        int i6 = this.d;
        i4 = (i3 / i6) * i6;
        if (i4 > 0) {
            j = ((nqx) nrb2).c;
            i2 = i3 - i4;
            this.e = i2;
            this.b.a(((j - ((long) i3)) * 1000000) / ((long) this.c.c), 1, i4, i2, null);
        }
        if (i != -1) {
            return 0;
        }
        return -1;
    }

    public final long b(long j) {
        nus nus = this.c;
        long j2 = (long) nus.d;
        return ((((j * ((long) nus.c)) / 1000000) / j2) * j2) + nus.g;
    }
}
