package defpackage;

/* renamed from: mve */
public final class mve implements msx {
    private final /* synthetic */ mvb a;

    public mve(mvb mvb) {
        this.a = mvb;
    }

    public final void aI_() {
    }

    public final void a(ngn ngn) {
        if (ngn != null && ngn.a().equals(ngq.ERROR_DATA) && (ngn instanceof ngr)) {
            int i = ((ngr) ngn).a;
            ndi ndi = this.a.c;
            if (ndi != null) {
                ndi.b.post(new ndn(ndi, i));
            }
        }
    }
}
