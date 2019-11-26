package defpackage;

import java.util.HashSet;

/* renamed from: tck */
abstract class tck implements tci {
    public final plb a;
    public final HashSet b;
    public final ple c = new tcj(this);
    private tcx d;

    tck(plb plb) {
        this.a = plb;
        this.b = new HashSet();
    }

    public void a(tch tch) {
        throw null;
    }

    public void b(tch tch) {
        throw null;
    }

    public final tcd a(pkq pkq) {
        tcx tcx = this.d;
        if (tcx == null || !tcx.a.equals(pkq)) {
            this.d = new tcx(pkq);
        }
        return this.d;
    }
}
