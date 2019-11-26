package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: vlg */
public final class vlg extends ajmp {
    private final vst a;
    private final /* synthetic */ vle b;

    public vlg(vle vle, vst vst) {
        this.b = vle;
        long j = vle.a;
        if (vst.b == vsm.MID_ROLL) {
            j = Math.max(0, vst.c.a - j);
        } else {
            j = Math.max(0, TimeUnit.SECONDS.toMillis((long) vst.f.h()) - j);
        }
        super(j, vst.c.a, ajms.DEFAULT, ajmr.AD_NOT_DRAWABLE, null);
        this.a = vst;
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        if (((vll) this.b.c.get(this.a.a)) == null) {
            vle.a("Null slotState when trying to fill slot");
            ((vlx) this.b.b.get()).a(this.a);
            return;
        }
        this.b.b(this.a);
    }

    public final void a() {
        this.a.e.e().b((ajmp) this);
    }
}
