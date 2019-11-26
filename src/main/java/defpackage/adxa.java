package defpackage;

/* renamed from: adxa */
public final class adxa implements t {
    public boolean a;
    private final addo b;
    private final zyw c;
    private final addr d;

    public adxa(addo addo, adqf adqf, xci xci, zyw zyw) {
        this.b = addo;
        this.c = zyw;
        this.d = new adwz(this, adqf, xci);
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void B_() {
        if ((this.c.a().a & 1048576) != 0) {
            auqv auqv = this.c.a().m;
            if (auqv == null) {
                auqv = auqv.e;
            }
            if (auqv.b) {
                xak.a();
                this.b.a(this.d, false);
            }
        }
    }

    public final void C_() {
        xak.a();
        this.b.a(this.d);
    }

    static {
        xtl.b("MDX.MdxSmartRemoteDialListener");
    }
}
