package defpackage;

/* renamed from: agar */
final /* synthetic */ class agar implements Runnable {
    private final agak a;
    private final String b;
    private final wxg c;

    agar(agak agak, String str, wxg wxg) {
        this.a = agak;
        this.b = str;
        this.c = wxg;
    }

    public final void run() {
        agak agak = this.a;
        String str = this.b;
        wxg wxg = this.c;
        if (agak.v()) {
            wxg.a(null, agak.u.o(str));
        }
    }
}
