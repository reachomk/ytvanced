package defpackage;

/* renamed from: gbx */
final /* synthetic */ class gbx implements Runnable {
    private final gbt a;
    private final zin b;
    private final boolean c;

    gbx(gbt gbt, zin zin, boolean z) {
        this.a = gbt;
        this.b = zin;
        this.c = z;
    }

    public final void run() {
        gbt gbt = this.a;
        gbt.b.a(this.b, this.c);
    }
}
