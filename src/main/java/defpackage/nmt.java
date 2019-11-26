package defpackage;

/* renamed from: nmt */
final class nmt implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ float d;
    private final /* synthetic */ nmu e;

    nmt(nmu nmu, int i, int i2, int i3, float f) {
        this.e = nmu;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
    }

    public final void run() {
        this.e.a.a(this.a, this.b);
    }
}
