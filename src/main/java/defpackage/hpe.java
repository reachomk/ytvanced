package defpackage;

/* renamed from: hpe */
final /* synthetic */ class hpe implements Runnable {
    private final wxg a;
    private final String b;
    private final agqk c;

    hpe(wxg wxg, String str, agqk agqk) {
        this.a = wxg;
        this.b = str;
        this.c = agqk;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
