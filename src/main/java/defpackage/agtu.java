package defpackage;

/* renamed from: agtu */
final /* synthetic */ class agtu implements Runnable {
    private final agtr a;
    private final aiqq b;
    private final wxf c;
    private final boolean d;

    agtu(agtr agtr, aiqq aiqq, wxf wxf, boolean z) {
        this.a = agtr;
        this.b = aiqq;
        this.c = wxf;
        this.d = z;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d);
    }
}
