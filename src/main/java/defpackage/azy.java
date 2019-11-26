package defpackage;

/* renamed from: azy */
final class azy extends wc {
    private final /* synthetic */ azl c;

    azy(azl azl) {
        this.c = azl;
    }

    public final void a() {
        azl azl = this.c;
        wd wdVar = azl.A;
        if (wdVar != null) {
            wdVar.b(azl.B);
            this.c.A = null;
        }
    }

    public final void a(xs xsVar) {
        azl azl = this.c;
        azl.C = xsVar;
        azl.a(false);
    }

    public final void a(vj vjVar) {
        this.c.D = vjVar != null ? vjVar.a() : null;
        this.c.k();
        this.c.a(false);
    }
}
