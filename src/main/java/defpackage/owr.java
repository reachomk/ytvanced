package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: owr */
public final class owr implements ovi {
    public long a;
    public Uri b = Uri.EMPTY;
    public Map c = Collections.emptyMap();
    private final ovi d;

    public owr(ovi ovi) {
        this.d = (ovi) oxz.a((Object) ovi);
    }

    public final void a(owt owt) {
        this.d.a(owt);
    }

    public final long a(ovm ovm) {
        this.b = ovm.a;
        this.c = Collections.emptyMap();
        long a = this.d.a(ovm);
        this.b = (Uri) oxz.a(b());
        this.c = c();
        return a;
    }

    public final int a(byte[] bArr, int i, int i2) {
        int a = this.d.a(bArr, i, i2);
        if (a != -1) {
            this.a += (long) a;
        }
        return a;
    }

    public final Uri b() {
        return this.d.b();
    }

    public final Map c() {
        return this.d.c();
    }

    public final void a() {
        this.d.a();
    }
}
