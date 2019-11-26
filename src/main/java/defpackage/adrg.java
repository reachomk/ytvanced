package defpackage;

/* renamed from: adrg */
public final class adrg extends adqx {
    private static final String j = xtl.b("MDX.CastRecoverer");
    private final adhn k;

    adrg(bbb bbb, baz baz, adgw adgw, xhv xhv, xci xci, adhn adhn) {
        super(bbb, baz, adgw, xhv, xci, 2, true);
        this.k = adhn;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bbs bbs) {
        if (this.k.d(bbs)) {
            b(bbs);
        } else {
            xtl.b(j, "Non cast route was passed in for recovery.");
        }
    }
}
