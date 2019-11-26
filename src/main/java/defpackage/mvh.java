package defpackage;

/* renamed from: mvh */
final class mvh implements nee {
    private final /* synthetic */ mvb a;

    public final void a(boolean z) {
        if (z) {
            mvb mvb = this.a;
            if (mvb.d == null) {
                ndi ndi = mvb.c;
                if (ndi != null) {
                    mvb.e = ndi;
                    ndi.b.post(new ndj(ndi, ndi.d()));
                }
            }
            return;
        }
        ndi ndi2 = this.a.d;
        if (ndi2 != null) {
            ndi2.b.post(new ndm(ndi2));
        }
    }

    public final void b(boolean z) {
        ndi ndi = this.a.c;
        if (ndi != null) {
            ndi.b.post(new ndq(ndi, z));
        }
    }

    /* synthetic */ mvh(mvb mvb) {
        this.a = mvb;
    }
}
