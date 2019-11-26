package defpackage;

/* renamed from: adrx */
public final class adrx extends adqx {
    private static final String j = xtl.b("MDX.CloudRecoverer");

    public adrx(bbb bbb, baz baz, adgw adgw, xhv xhv, xci xci) {
        super(bbb, baz, adgw, xhv, xci, 4, false);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bbs bbs) {
        if (adhn.b(bbs)) {
            b(bbs);
        } else {
            xtl.b(j, "Non CLOUD route was passed in for recovery");
        }
    }
}
