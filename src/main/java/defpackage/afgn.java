package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Map;

/* renamed from: afgn */
public final class afgn implements ovi {
    public final aeuy a;
    public long b;
    public long c;
    public long d;
    private final ovi e;
    private final Handler f = new Handler(Looper.getMainLooper());
    private final xsc g;

    public afgn(ovi ovi, aeuy aeuy, xsc xsc) {
        this.e = ovi;
        this.a = aeuy;
        this.g = xsc;
    }

    public final long a(ovm ovm) {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        return this.e.a(ovm);
    }

    public final int a(byte[] bArr, int i, int i2) {
        int a = this.e.a(bArr, i, i2);
        long d = this.g.d();
        long d2 = this.g.d();
        this.b += (long) i2;
        this.c += (d2 - d) / 1000;
        this.d++;
        return a;
    }

    public final void a() {
        this.f.post(new afgm(this));
        this.e.a();
    }

    public final Uri b() {
        return this.e.b();
    }

    public final void a(owt owt) {
        this.e.a(owt);
    }

    public final Map c() {
        return Collections.emptyMap();
    }
}
