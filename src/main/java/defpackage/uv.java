package defpackage;

/* renamed from: uv */
final class uv implements Runnable {
    private final /* synthetic */ vd a;
    private final /* synthetic */ ut b;

    uv(ut utVar, vd vdVar) {
        this.b = utVar;
        this.a = vdVar;
    }

    public final void run() {
        ub ubVar = (ub) this.b.a.d.remove(this.a.a());
        if (ubVar != null) {
            ubVar.d.a().unlinkToDeath(ubVar, 0);
        }
    }
}
