package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: aeli */
public final class aeli implements ovi {
    private final ovi a;
    private final afjj b;
    private boolean c;

    public aeli(ovi ovi, afjj afjj) {
        this.a = (ovi) amqw.a((Object) ovi);
        this.b = (afjj) amqw.a((Object) afjj);
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    public final long a(ovm ovm) {
        if (!this.c) {
            try {
                int parseInt = Integer.parseInt(ovm.a.getQueryParameter("itag"));
                Set n = aahv.n();
                Integer valueOf = Integer.valueOf(parseInt);
                if (n.contains(valueOf)) {
                    this.c = true;
                    this.b.a.a(new aehc());
                } else if (aahv.h().contains(valueOf) || aahv.o().contains(valueOf)) {
                    this.c = true;
                    this.b.a.a(new aehb());
                }
            } catch (NumberFormatException unused) {
            }
        }
        return this.a.a(ovm);
    }

    public final int a(byte[] bArr, int i, int i2) {
        return this.a.a(bArr, i, i2);
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
