package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;

/* renamed from: agsc */
public final class agsc implements ovi {
    private final ovi a;

    public agsc(ovi ovi) {
        this.a = ovi;
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    public final long a(ovm ovm) {
        Uri uri = ovm.a;
        if (uri == null || !xvt.c(uri)) {
            return this.a.a(ovm);
        }
        afpc.a(1, afpf.offline, String.format(Locale.US, "Offline data source open failed on DataSpec %s", new Object[]{ovm.toString()}));
        throw new afig();
    }

    public final int a(byte[] bArr, int i, int i2) {
        return this.a.a(bArr, i, i2);
    }

    public final Uri b() {
        return this.a.b();
    }

    public final void a() {
        this.a.a();
    }

    public final Map c() {
        return Collections.emptyMap();
    }
}
