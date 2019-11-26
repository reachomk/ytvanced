package defpackage;

/* renamed from: ntr */
final class ntr extends ntv {
    private final boolean a;
    private final nxa c = new nxa(new byte[8]);
    private final nwz d = new nwz(this.c.a);
    private int e = 0;
    private int f;
    private boolean g;
    private long h;
    private nmx i;
    private int j;
    private long k;

    public ntr(nrs nrs, boolean z) {
        super(nrs);
        this.a = z;
    }

    public final void b() {
    }

    public final void a() {
        this.e = 0;
        this.f = 0;
        this.g = false;
    }

    public final void a(long j, boolean z) {
        this.k = j;
    }

    public final void a(nwz nwz) {
        while (nwz.b() > 0) {
            int i = this.e;
            byte[] bArr;
            if (i == 0) {
                while (nwz.b() > 0) {
                    if (this.g) {
                        i = nwz.d();
                        if (i == 119) {
                            this.g = false;
                            this.e = 1;
                            bArr = this.d.a;
                            bArr[0] = (byte) 11;
                            bArr[1] = (byte) 119;
                            this.f = 2;
                            break;
                        }
                        this.g = i == 11;
                    } else {
                        this.g = nwz.d() == 11;
                    }
                }
            } else if (i == 1) {
                bArr = this.d.a;
                int min = Math.min(nwz.b(), 8 - this.f);
                nwz.a(bArr, this.f, min);
                i = this.f + min;
                this.f = i;
                if (i == 8) {
                    if (this.i == null) {
                        nmx b;
                        if (this.a) {
                            b = nwg.b(this.c);
                        } else {
                            b = nwg.a(this.c);
                        }
                        this.i = b;
                        this.b.a(this.i);
                    }
                    if (this.a) {
                        i = nwg.b(this.c.a);
                    } else {
                        i = nwg.a(this.c.a);
                    }
                    this.j = i;
                    if (this.a) {
                        i = nwg.c(this.c.a);
                    } else {
                        i = nwg.a();
                    }
                    this.h = (long) ((int) ((((long) i) * 1000000) / ((long) this.i.r)));
                    this.d.c(0);
                    this.b.a(this.d, 8);
                    this.e = 2;
                }
            } else if (i == 2) {
                i = Math.min(nwz.b(), this.j - this.f);
                this.b.a(nwz, i);
                int i2 = this.f + i;
                this.f = i2;
                int i3 = this.j;
                if (i2 == i3) {
                    this.b.a(this.k, 1, i3, 0, null);
                    this.k += this.h;
                    this.e = 0;
                }
            }
        }
    }
}
