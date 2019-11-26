package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: zea */
public final class zea {
    public final Map a = new HashMap();
    private final bapu b;

    public zea(bapu bapu) {
        this.b = bapu;
    }

    public final zeg a(zeg zeg, zdw zdw) {
        xak.a();
        boolean z = true;
        if (!(zdw == null || zeg.b())) {
            z = false;
        }
        amqw.a(z);
        for (Object a : zeg.c()) {
            xsb.a(this.a, a, zeg.a());
        }
        if (zeg.b()) {
            ((zef) this.b.get()).a(zeg.c(), zdw);
        }
        return zeg;
    }

    public final void a(zeg zeg) {
        xak.a();
        for (Uri uri : zeg.c()) {
            xsb.b(this.a, uri, zeg.a());
            Set set = (Set) this.a.get(uri);
            if (set == null || set.isEmpty()) {
                this.a.remove(uri);
            }
        }
    }
}
