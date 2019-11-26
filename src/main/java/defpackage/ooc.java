package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: ooc */
final class ooc implements ovi {
    private final ovi a;
    private final int b;
    private final oof c;
    private final byte[] d;
    private int e;

    public ooc(ovi ovi, int i, oof oof) {
        oxz.a(i > 0);
        this.a = ovi;
        this.b = i;
        this.c = oof;
        this.d = new byte[1];
        this.e = i;
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    public final long a(ovm ovm) {
        throw new UnsupportedOperationException();
    }

    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.a.a(this.d, 0, 1) != -1) {
                i3 = (this.d[0] & 255) << 4;
                if (i3 != 0) {
                    byte[] bArr2 = new byte[i3];
                    int i5 = i3;
                    while (i5 > 0) {
                        int a = this.a.a(bArr2, i4, i5);
                        if (a != -1) {
                            i4 += a;
                            i5 -= a;
                        }
                    }
                    while (i3 > 0) {
                        i5 = i3 - 1;
                        if (bArr2[i5] != (byte) 0) {
                            break;
                        }
                        i3 = i5;
                    }
                    if (i3 > 0) {
                        this.c.a(new oza(bArr2, i3));
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int a2 = this.a.a(bArr, i, Math.min(i3, i2));
        if (a2 != -1) {
            this.e -= a2;
        }
        return a2;
    }

    public final Uri b() {
        return this.a.b();
    }

    public final Map c() {
        return this.a.c();
    }

    public final void a() {
        throw new UnsupportedOperationException();
    }
}
