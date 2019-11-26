package defpackage;

/* renamed from: gwj */
final class gwj implements fao {
    private final /* synthetic */ gwd a;

    public final void a(float f) {
    }

    public final void a(int i, boolean z) {
        akbc e = this.a.ak.e();
        if (!(z || e == null)) {
            gwd gwd = this.a;
            if (gwd.bV) {
                gwd.cb = e.j;
            }
        }
        hgl hgl = (hgl) this.a.ca.get();
        if (e != null) {
            if ("FElibrary".equals(e.j)) {
                hgl.f();
            }
        }
    }

    public final boolean a(int i) {
        return true;
    }

    public final void b(int i) {
    }

    /* synthetic */ gwj(gwd gwd) {
        this.a = gwd;
    }
}
