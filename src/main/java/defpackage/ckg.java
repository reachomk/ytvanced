package defpackage;

/* renamed from: ckg */
public final class ckg extends bakm {
    private cju a;

    public ckg() {
        super("trak");
    }

    public final ckf a() {
        for (cis cis : b()) {
            if (cis instanceof ckf) {
                return (ckf) cis;
            }
        }
        return null;
    }

    public final cju g() {
        cju cju = this.a;
        if (cju == null) {
            cjh h = h();
            if (h != null) {
                cjj a = h.a();
                if (a != null) {
                    this.a = a.a();
                    return this.a;
                }
            }
            cju = null;
        }
        return cju;
    }

    public final cjh h() {
        for (cis cis : b()) {
            if (cis instanceof cjh) {
                return (cjh) cis;
            }
        }
        return null;
    }
}
