package defpackage;

/* renamed from: aaei */
public final class aaei extends aaek {
    private final zzl b;

    public aaei(xsc xsc, zzl zzl) {
        super(xsc);
        this.b = zzl;
    }

    public final synchronized void a(String str, String str2) {
        arvt b = this.b.b();
        if (b != null) {
            aume aume = b.e;
            if (aume == null) {
                aume = aume.af;
            }
            if (aume.aa) {
                super.a(str, str2);
                return;
            }
        }
        this.a.clear();
    }
}
