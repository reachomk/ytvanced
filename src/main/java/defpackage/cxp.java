package defpackage;

/* renamed from: cxp */
final class cxp implements ddf {
    private final /* synthetic */ cwo a;

    cxp(cwo cwo) {
        this.a = cwo;
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        cwh cwh;
        cwo cwo = this.a;
        synchronized (cwo) {
            cwh = cwo.f;
        }
        if (cwh != null) {
            cwo.a(cwh, i, i2, i3, i4, i5);
        }
    }
}
