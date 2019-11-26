package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: ahal */
public final class ahal implements ovi {
    private final ovi a;
    private final ahao b;

    public ahal(ovi ovi, ahao ahao) {
        this.a = (ovi) amqw.a((Object) ovi);
        this.b = (ahao) amqw.a((Object) ahao);
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    public final long a(ovm ovm) {
        return this.a.a(ovm);
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int a;
        synchronized (this.b) {
            a = this.a.a(bArr, i, this.b.a(i2));
            this.b.b(a);
        }
        return a;
    }

    public final void a() {
        this.a.a();
    }

    public final Uri b() {
        return this.a.b();
    }

    public final Map c() {
        return Collections.emptyMap();
    }
}
