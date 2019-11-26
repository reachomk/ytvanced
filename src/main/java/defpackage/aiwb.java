package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: aiwb */
public final class aiwb implements ovi {
    public final ozb a;
    private final owq b;

    public final void a(owt owt) {
        this.b.a(owt);
    }

    public final long a(ovm ovm) {
        this.a.a(0);
        return this.b.a(ovm);
    }

    public final int a(byte[] bArr, int i, int i2) {
        return this.b.a(bArr, i, i2);
    }

    public final void a() {
        try {
            this.b.a();
        } finally {
            d();
        }
    }

    public final Uri b() {
        return this.b.b();
    }

    private final void d() {
        new aiwa(this, "playerProxyUnregister").start();
    }

    /* synthetic */ aiwb(ovi ovi, ozb ozb) {
        this.b = new owq(ovi, ozb, 0);
        this.a = ozb;
    }

    public final Map c() {
        return Collections.emptyMap();
    }
}
