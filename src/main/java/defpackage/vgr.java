package defpackage;

import java.util.Arrays;

/* renamed from: vgr */
public final class vgr extends ajmp {
    public final vgt a;
    public final String b;
    public final vsm c;
    @Deprecated
    public volatile vso d = null;
    public final /* synthetic */ vge e;

    public vgr(vge vge, vgt vgt, String str, vsm vsm, ajmr ajmr, long j, long j2) {
        this.e = vge;
        super(j, j2, ajms.AD_MODULE, ajmr, null);
        this.a = vgt;
        this.b = str;
        this.c = vsm;
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        if (this.d != null) {
            this.e.a(this.b, null, Arrays.asList(new vso[]{this.d}), true);
            return;
        }
        if (!(z || z3 || this.k == ajmr.LIVE_AD_MARKER)) {
            this.e.h.d(new vpf());
            ((vjr) this.e.a.get()).a(this.e.m.a, this.b);
            ((vjr) this.e.a.get()).a(this.e.m.a, this.b, new vgq(this));
        }
    }
}
