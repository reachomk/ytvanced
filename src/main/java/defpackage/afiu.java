package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: afiu */
public final class afiu implements ovi {
    private final ovi a;
    private final byte[] b;
    private int c;
    private int d;

    public afiu(ovi ovi, int i) {
        this.a = ovi;
        this.b = new byte[i];
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    public final long a(ovm ovm) {
        this.c = 0;
        this.d = 0;
        return this.a.a(ovm);
    }

    public final Uri b() {
        return this.a.b();
    }

    public final int a(byte[] bArr, int i, int i2) {
        oxz.b(this.d <= this.c);
        int i3 = this.d;
        int i4 = this.c;
        if (i3 == i4) {
            byte[] bArr2 = this.b;
            i4 = bArr2.length;
            if (i2 >= i4) {
                return this.a.a(bArr, i, i2);
            }
            i4 = this.a.a(bArr2, 0, i4);
            this.c = i4;
            if (i4 < 0) {
                return -1;
            }
            this.d = 0;
            i3 = 0;
        }
        i2 = Math.min(i2, i4 - i3);
        System.arraycopy(this.b, this.d, bArr, i, i2);
        this.d += i2;
        return i2;
    }

    public final void a() {
        this.a.a();
    }

    public final Map c() {
        return Collections.emptyMap();
    }
}
