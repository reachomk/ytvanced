package defpackage;

/* renamed from: ntw */
final class ntw extends ntv {
    private final nwz a = new nwz(new byte[15]);
    private int c;
    private int d;
    private int e;
    private long f;
    private nmx g;
    private int h;
    private long i;

    public ntw(nrs nrs) {
        super(nrs);
        byte[] bArr = this.a.a;
        bArr[0] = Byte.MAX_VALUE;
        bArr[1] = (byte) -2;
        bArr[2] = Byte.MIN_VALUE;
        bArr[3] = (byte) 1;
        this.c = 0;
    }

    public final void b() {
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final void a(long j, boolean z) {
        this.i = j;
    }

    public final void a(nwz nwz) {
        nwz nwz2 = nwz;
        while (nwz.b() > 0) {
            int i = this.c;
            int i2 = 1;
            int c;
            if (i == 0) {
                while (nwz.b() > 0) {
                    i = this.e << 8;
                    this.e = i;
                    i |= nwz.d();
                    this.e = i;
                    if (i == 2147385345) {
                        this.e = 0;
                        this.d = 4;
                        this.c = 1;
                        break;
                    }
                }
            } else if (i == 1) {
                byte[] bArr = this.a.a;
                int min = Math.min(nwz.b(), 15 - this.d);
                nwz2.a(bArr, this.d, min);
                i = this.d + min;
                this.d = i;
                if (i == 15) {
                    bArr = this.a.a;
                    if (this.g == null) {
                        nxa nxa = nwk.d;
                        nxa.a(bArr, bArr.length);
                        nxa.b(60);
                        int i3 = nwk.a[nxa.c(6)];
                        int i4 = nwk.b[nxa.c(4)];
                        c = nxa.c(5);
                        int i5 = c < nwk.c.length ? (nwk.c[c] * 1000) / 2 : -1;
                        nxa.b(10);
                        if (nxa.c(2) <= 0) {
                            i2 = 0;
                        }
                        this.g = nmx.a(null, "audio/vnd.dts", i5, -1, -1, i3 + i2, i4, null, null);
                        this.b.a(this.g);
                    }
                    this.h = nwk.b(bArr);
                    this.f = (long) ((int) ((((long) nwk.a(bArr)) * 1000000) / ((long) this.g.r)));
                    this.a.c(0);
                    this.b.a(this.a, 15);
                    this.c = 2;
                }
            } else if (i == 2) {
                i = Math.min(nwz.b(), this.h - this.d);
                this.b.a(nwz2, i);
                c = this.d + i;
                this.d = c;
                int i6 = this.h;
                if (c == i6) {
                    this.b.a(this.i, 1, i6, 0, null);
                    this.i += this.f;
                    this.c = 0;
                }
            }
        }
    }
}
