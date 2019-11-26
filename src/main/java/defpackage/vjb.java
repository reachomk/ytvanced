package defpackage;

/* renamed from: vjb */
final /* synthetic */ class vjb implements Runnable {
    private final viz a;
    private final String b;
    private final vka c;
    private final vsd d;
    private final aakj e;
    private final String f;

    vjb(viz viz, String str, vka vka, vsd vsd, aakj aakj, String str2) {
        this.a = viz;
        this.b = str;
        this.c = vka;
        this.d = vsd;
        this.e = aakj;
        this.f = str2;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e, this.f);
    }
}
