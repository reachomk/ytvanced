package defpackage;

/* renamed from: loc */
public final class loc implements vvd {
    public wae a;
    private final lob b;

    public loc(lob lob) {
        this.b = lob;
    }

    public final void a(wae wae) {
        this.a = wae;
    }

    public final void a(vxc vxc) {
        lob lob = this.b;
        int d = vxc.g().d();
        if (d != 0) {
            if (d == 1) {
                lob.a(1);
                lob.a(true);
                return;
            } else if (d != 2) {
                if (d == 3) {
                    lob.a(0);
                    lob.a(false);
                    return;
                }
                return;
            }
        }
        lob.a(2);
        lob.a(true);
    }
}
