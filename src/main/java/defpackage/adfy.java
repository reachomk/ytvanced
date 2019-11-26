package defpackage;

/* renamed from: adfy */
public final class adfy {
    public nt a;
    private final afpu b;
    private final boolean c;
    private final zyw d;

    public adfy(afpu afpu, adby adby, zyw zyw) {
        this.b = afpu;
        this.c = adby.b().equals("cl");
        this.d = zyw;
    }

    public final boolean a(adga adga) {
        if (this.c && this.a != null) {
            auqv auqv = this.d.a().m;
            if (auqv == null) {
                auqv = auqv.e;
            }
            if (auqv.d) {
                if (this.b.g()) {
                    String str = "INCOGNITO_BOTTOM_SHEET_FRAGMENT";
                    nd ndVar = (uqq) this.a.a(str);
                    if (ndVar == null) {
                        ndVar = uqq.a(new adgb(adga), null);
                    }
                    ndVar.a(this.a, str);
                } else if (!(this.b.a() || this.b.g())) {
                    adfd adfd = new adfd();
                    adfd.Z = adga;
                    adfd.a(this.a, "youtube.mdx.mediaroute.MdxLoggedOutWatchHistoryDialogFragment");
                }
                return true;
            }
        }
        return false;
    }
}
