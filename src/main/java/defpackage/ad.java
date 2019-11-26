package defpackage;

/* renamed from: ad */
final class ad extends ns {
    ad() {
    }

    public final void a(nf nfVar) {
        ac.a(nfVar, aa.ON_CREATE);
        if (nfVar instanceof ak) {
            String str = "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag";
            if (nfVar.s().a(str) == null) {
                nfVar.s().a().a(new ab(), str).a();
            }
        }
    }

    public final void b(nf nfVar) {
        ac.a(nfVar, aa.ON_START);
    }

    public final void c(nf nfVar) {
        ac.a(nfVar, aa.ON_RESUME);
    }
}
