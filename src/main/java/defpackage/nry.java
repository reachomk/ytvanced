package defpackage;

import java.util.ArrayList;

/* renamed from: nry */
final class nry extends nrw {
    private final nwz c = new nwz(nwv.a);
    private final nwz d = new nwz(4);
    private int e;
    private boolean f;
    private int g;

    public nry(nrs nrs) {
        super(nrs);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(nwz nwz) {
        int d = nwz.d();
        int i = (d >> 4) & 15;
        d &= 15;
        if (d == 7) {
            this.g = i;
            return i != 5;
        } else {
            StringBuilder stringBuilder = new StringBuilder(39);
            stringBuilder.append("Video format not supported: ");
            stringBuilder.append(d);
            throw new nrv(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nwz nwz, long j) {
        int d = nwz.d();
        long g = j + (((long) nwz.g()) * 1000);
        int i;
        if (d == 0) {
            if (!this.f) {
                int i2;
                float f;
                int i3;
                nwz nwz2 = new nwz(new byte[nwz.b()]);
                nwz.a(nwz2.a, 0, nwz.b());
                nwz2.c(4);
                int d2 = (nwz2.d() & 3) + 1;
                nwf.b(d2 != 3);
                ArrayList arrayList = new ArrayList();
                int d3 = nwz2.d() & 31;
                for (i = 0; i < d3; i++) {
                    arrayList.add(nwv.a(nwz2));
                }
                i = nwz2.d();
                for (i2 = 0; i2 < i; i2++) {
                    arrayList.add(nwv.a(nwz2));
                }
                if (d3 > 0) {
                    nxa nxa = new nxa((byte[]) arrayList.get(0));
                    nxa.a((d2 + 1) << 3);
                    nwx a = nwv.a(nxa);
                    int i4 = a.b;
                    d = a.c;
                    f = a.d;
                    i2 = i4;
                    i3 = d;
                } else {
                    i2 = -1;
                    i3 = -1;
                    f = 1.0f;
                }
                nrx nrx = new nrx(arrayList, d2, i2, i3, f);
                this.e = nrx.b;
                this.a.a(nmx.a("video/avc", this.b, nrx.d, nrx.e, nrx.a, nrx.c));
                this.f = true;
            }
        } else if (d == 1) {
            byte[] bArr = this.d.a;
            bArr[0] = (byte) 0;
            bArr[1] = (byte) 0;
            bArr[2] = (byte) 0;
            d = 4 - this.e;
            int i5 = 0;
            while (nwz.b() > 0) {
                nwz.a(this.d.a, d, this.e);
                this.d.c(0);
                i = this.d.n();
                this.c.c(0);
                this.a.a(this.c, 4);
                this.a.a(nwz, i);
                i5 = (i5 + 4) + i;
            }
            this.a.a(g, this.g == 1 ? 1 : 0, i5, 0, null);
        }
    }
}
