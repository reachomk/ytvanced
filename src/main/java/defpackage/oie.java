package defpackage;

import java.util.Arrays;

/* renamed from: oie */
final class oie {
    public final oih a = new oih();
    public final oza b = new oza(new byte[65025], 0);
    public int c = -1;
    public boolean d;
    private int e;

    oie() {
    }

    public final boolean a(ofp ofp) {
        oxz.b(true);
        if (this.d) {
            this.d = false;
            this.b.a();
        }
        while (!this.d) {
            int i;
            int i2 = this.c;
            if (i2 < 0) {
                if (!this.a.a(ofp, true)) {
                    return false;
                }
                oih oih = this.a;
                i = oih.d;
                if ((oih.a & 1) == 1 && this.b.c == 0) {
                    i += a(0);
                    i2 = this.e;
                } else {
                    i2 = 0;
                }
                ofp.a(i);
                this.c = i2;
            }
            i2 = a(i2);
            i = this.c + this.e;
            if (i2 > 0) {
                int c = this.b.c();
                oza oza = this.b;
                int i3 = oza.c + i2;
                if (c < i3) {
                    oza.a = Arrays.copyOf(oza.a, i3);
                }
                oza oza2 = this.b;
                ofp.b(oza2.a, oza2.c, i2);
                oza2 = this.b;
                oza2.b(oza2.c + i2);
                this.d = this.a.f[i + -1] != 255;
            }
            if (i == this.a.c) {
                i = -1;
            }
            this.c = i;
        }
        return true;
    }

    private final int a(int i) {
        int i2 = 0;
        this.e = 0;
        int i3;
        do {
            i3 = this.e;
            int i4 = i + i3;
            oih oih = this.a;
            if (i4 >= oih.c) {
                break;
            }
            int[] iArr = oih.f;
            this.e = i3 + 1;
            i3 = iArr[i4];
            i2 += i3;
        } while (i3 == 255);
        return i2;
    }
}
