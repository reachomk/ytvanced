package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: owq */
public final class owq implements ovi {
    private final ovi a;
    private final ozb b;
    private final int c;

    public owq(ovi ovi, ozb ozb, int i) {
        this.a = (ovi) oxz.a((Object) ovi);
        this.b = (ozb) oxz.a((Object) ozb);
        this.c = i;
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    public final long a(ovm ovm) {
        this.b.c(this.c);
        return this.a.a(ovm);
    }

    public final int a(byte[] bArr, int i, int i2) {
        this.b.c(this.c);
        return this.a.a(bArr, i, i2);
    }

    public final Uri b() {
        return this.a.b();
    }

    public final Map c() {
        return this.a.c();
    }

    public final void a() {
        this.a.a();
    }
}
