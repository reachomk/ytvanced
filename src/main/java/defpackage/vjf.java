package defpackage;

/* renamed from: vjf */
final /* synthetic */ class vjf implements Runnable {
    private final viz a;
    private final String b;
    private final String c;
    private final vsm d;
    private final vka e;

    vjf(viz viz, String str, String str2, vsm vsm, vka vka) {
        this.a = viz;
        this.b = str;
        this.c = str2;
        this.d = vsm;
        this.e = vka;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e, true);
    }
}
