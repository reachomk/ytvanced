package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: oxy */
public final class oxy implements ovi {
    private final ovi a;
    private final byte[] b;
    private oxx c;

    public oxy(byte[] bArr, ovi ovi) {
        this.a = ovi;
        this.b = bArr;
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    public final long a(ovm ovm) {
        long a = this.a.a(ovm);
        this.c = new oxx(2, this.b, oya.a(ovm.g), ovm.d);
        return a;
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        i2 = this.a.a(bArr, i, i2);
        if (i2 == -1) {
            return -1;
        }
        this.c.a(bArr, i, i2, bArr, i);
        return i2;
    }

    public final Uri b() {
        return this.a.b();
    }

    public final Map c() {
        return this.a.c();
    }

    public final void a() {
        this.c = null;
        this.a.a();
    }
}
