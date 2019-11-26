package defpackage;

/* renamed from: ojw */
public final class ojw implements okh {
    private final ojx a;
    private final oza b = new oza(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public ojw(ojx ojx) {
        this.a = ojx;
    }

    public final void a(ozo ozo, ofo ofo, okl okl) {
        this.a.a(ozo, ofo, okl);
        this.f = true;
    }

    public final void a() {
        this.f = true;
    }

    public final void a(oza oza, int i) {
        i &= 1;
        int d = i != 0 ? oza.d() + oza.b : -1;
        if (this.f) {
            if (i != 0) {
                this.f = false;
                oza.c(d);
                this.d = 0;
            }
        }
        while (oza.b() > 0) {
            i = this.d;
            if (i >= 3) {
                i = Math.min(oza.b(), this.c - this.d);
                oza.a(this.b.a, this.d, i);
                d = this.d + i;
                this.d = d;
                i = this.c;
                if (d != i) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.a(i);
                    } else if (ozp.a(this.b.a, i) != 0) {
                        this.f = true;
                        return;
                    } else {
                        this.b.a(this.c - 4);
                    }
                    this.a.a(this.b);
                    this.d = 0;
                }
            } else {
                if (i == 0) {
                    i = oza.d();
                    oza.c(oza.b - 1);
                    if (i == 255) {
                        this.f = true;
                        return;
                    }
                }
                i = Math.min(oza.b(), 3 - this.d);
                oza.a(this.b.a, this.d, i);
                int i2 = this.d + i;
                this.d = i2;
                if (i2 == 3) {
                    this.b.a(3);
                    this.b.d(1);
                    i = this.b.d();
                    i2 = this.b.d();
                    this.e = (i & 128) != 0;
                    this.c = (((i & 15) << 8) | i2) + 3;
                    i = this.b.c();
                    i2 = this.c;
                    if (i < i2) {
                        oza oza2 = this.b;
                        byte[] bArr = oza2.a;
                        int length = bArr.length;
                        oza2.a(Math.min(4098, Math.max(i2, length + length)));
                        System.arraycopy(bArr, 0, this.b.a, 0, 3);
                    }
                }
            }
        }
    }
}
