package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: owu */
public final class owu implements ovi {
    private final ovi a;
    private final ovg b;
    private boolean c;
    private long d;

    public owu(ovi ovi, ovg ovg) {
        this.a = (ovi) oxz.a((Object) ovi);
        this.b = (ovg) oxz.a((Object) ovg);
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    public final long a(ovm ovm) {
        long a = this.a.a(ovm);
        this.d = a;
        if (a == 0) {
            return 0;
        }
        if (ovm.f == -1 && a != -1) {
            ovm = ovm.a(0, a);
        }
        this.c = true;
        this.b.a(ovm);
        return this.d;
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        i2 = this.a.a(bArr, i, i2);
        if (i2 > 0) {
            this.b.a(bArr, i, i2);
            long j = this.d;
            if (j != -1) {
                this.d = j - ((long) i2);
            }
        }
        return i2;
    }

    public final Uri b() {
        return this.a.b();
    }

    public final Map c() {
        return this.a.c();
    }

    public final void a() {
        try {
            this.a.a();
            if (this.c) {
                this.c = false;
                this.b.a();
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                this.b.a();
            }
        }
    }
}
