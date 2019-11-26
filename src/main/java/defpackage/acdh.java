package defpackage;

/* renamed from: acdh */
final class acdh implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ acdf b;

    acdh(acdf acdf, int i) {
        this.b = acdf;
        this.a = i;
    }

    public final void run() {
        acdf acdf;
        if (this.a > 0) {
            acdf = this.b;
            acdf.a.a(acdf.g);
            acdf = this.b;
            acdf.b.a(acdf.f);
            return;
        }
        acdf = this.b;
        acdf.b.a(acdf.f);
        acdf = this.b;
        acdf.a.a(acdf.g);
    }
}
