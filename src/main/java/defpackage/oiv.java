package defpackage;

import java.io.IOException;

/* renamed from: oiv */
public final class oiv implements ofm {
    private static final int a = ozp.f("RCC\u0001");
    private final nzw b;
    private final oza c = new oza(9);
    private ofy d;
    private int e = 0;
    private int f;
    private long g;
    private int h;
    private int i;

    public oiv(nzw nzw) {
        this.b = nzw;
    }

    public final void c() {
    }

    public final void a(ofo ofo) {
        ofo.a(new ofw(-9223372036854775807L));
        this.d = ofo.a(0, 3);
        ofo.a();
        this.d.a(this.b);
    }

    public final boolean a(ofp ofp) {
        this.c.a();
        ofp.c(this.c.a, 0, 8);
        if (this.c.k() == a) {
            return true;
        }
        return false;
    }

    public final int a(ofp ofp, ofv ofv) {
        while (true) {
            int i = this.e;
            if (i == 0) {
                this.c.a();
                if (!ofp.a(this.c.a, 0, 8, true)) {
                    return -1;
                }
                if (this.c.k() == a) {
                    this.f = this.c.d();
                    this.e = 1;
                } else {
                    throw new IOException("Input not RawCC");
                }
            } else if (i == 1) {
                this.c.a();
                i = this.f;
                if (i == 0) {
                    if (!ofp.a(this.c.a, 0, 5, true)) {
                        break;
                    }
                    this.g = (this.c.i() * 1000) / 45;
                    this.h = this.c.d();
                    this.i = 0;
                    this.e = 2;
                } else if (i != 1) {
                    StringBuilder stringBuilder = new StringBuilder(39);
                    stringBuilder.append("Unsupported version number: ");
                    stringBuilder.append(i);
                    throw new oae(stringBuilder.toString());
                } else if (!ofp.a(this.c.a, 0, 9, true)) {
                    break;
                } else {
                    this.g = this.c.m();
                    this.h = this.c.d();
                    this.i = 0;
                    this.e = 2;
                }
            } else if (i == 2) {
                while (this.h > 0) {
                    this.c.a();
                    ofp.b(this.c.a, 0, 3);
                    this.d.a(this.c, 3);
                    this.i += 3;
                    this.h--;
                }
                int i2 = this.i;
                if (i2 > 0) {
                    this.d.a(this.g, 1, i2, 0, null);
                }
                this.e = 1;
                return 0;
            } else {
                throw new IllegalStateException();
            }
        }
        this.e = 0;
        return -1;
    }

    public final void a(long j, long j2) {
        this.e = 0;
    }
}
