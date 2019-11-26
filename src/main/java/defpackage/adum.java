package defpackage;

/* renamed from: adum */
final class adum implements Runnable {
    private final /* synthetic */ adjb a;
    private final /* synthetic */ wxg b;
    private final /* synthetic */ adui c;

    adum(adui adui, adjb adjb, wxg wxg) {
        this.c = adui;
        this.a = adjb;
        this.b = wxg;
    }

    public final void run() {
        Object a = this.c.e.a(this.a);
        if (a != null) {
            this.b.a(this.a, a);
        } else {
            this.b.a(this.a, null);
        }
    }
}
