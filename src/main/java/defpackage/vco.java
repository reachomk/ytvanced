package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: vco */
final class vco implements tqe {
    private final /* synthetic */ vcp a;

    public final void a(tps tps) {
        vcq vcq = this.a.b;
        if (vcq != null) {
            vcq.a(tps);
        }
    }

    public final void b(tps tps) {
        vcq vcq = this.a.b;
        if (vcq != null) {
            vcq.b(tps);
        }
    }

    public final void c(tps tps) {
        vcq vcq = this.a.b;
        if (vcq != null) {
            vcq.c(tps);
        }
    }

    public final tqg a() {
        vcq vcq = this.a.b;
        return vcq != null ? vcq.a() : null;
    }

    public final Set a(tqh tqh) {
        vcq vcq = this.a.b;
        if (vcq != null) {
            return vcq.a(tqh);
        }
        return Collections.emptySet();
    }

    /* synthetic */ vco(vcp vcp) {
        this.a = vcp;
    }
}
