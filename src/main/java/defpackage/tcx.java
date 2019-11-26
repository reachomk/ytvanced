package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: tcx */
final class tcx implements tcd {
    public final pkq a;

    tcx(pkq pkq) {
        Collections.synchronizedMap(new HashMap());
        this.a = (pkq) uhy.a((Object) pkq);
    }

    public final tbn a() {
        return new tdn(this.a.b());
    }

    public final tde b() {
        return new tdb(this.a.a());
    }

    public final tev a(String str, String str2) {
        pkq pkq = this.a;
        pzr.b("Must be called from the main thread.");
        ptd ptd = pkq.f;
        return new tfv(ptd != null ? pkq.d.a(ptd, str, str2) : null, tcw.a);
    }

    public final void a(String str, tbt tbt) {
        pkq pkq = this.a;
        pjj tcz = new tcz(tbt);
        pzr.b("Must be called from the main thread.");
        ptd ptd = pkq.f;
        if (ptd != null) {
            pkq.d.a(ptd, str, tcz);
        }
    }
}
