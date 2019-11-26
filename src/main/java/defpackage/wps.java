package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: wps */
final class wps implements uum, wqt {
    private final aaas a;
    private final apxu b;
    private final wpk c;

    wps(aaas aaas, apxu apxu, wpk wpk) {
        this.a = aaas;
        this.b = apxu;
        this.c = wpk;
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void b() {
        if (this.b != null) {
            Map hashMap = new HashMap();
            hashMap.put("YpcCompleteTransactionCallback", this);
            this.a.a(this.b, hashMap);
        }
    }

    public final void e() {
        wpk wpk = this.c;
        if (wpk != null) {
            wpk.b();
        }
    }

    public final void a(akcf akcf) {
        wpk wpk = this.c;
        if (wpk != null) {
            wpk.a(akcf);
        }
    }

    public final void ac_() {
        wpk wpk = this.c;
        if (wpk != null) {
            wpk.a(null);
        }
    }
}
