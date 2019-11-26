package defpackage;

/* renamed from: pph */
final class pph implements Runnable {
    private final /* synthetic */ ppa a;
    private final /* synthetic */ poi b;

    pph(ppa ppa, poi poi) {
        this.a = ppa;
        this.b = poi;
    }

    public final void run() {
        boolean z;
        ppa ppa = this.a;
        String str = this.b.a;
        if (ppj.a(str, ppa.f)) {
            z = false;
        } else {
            ppa.f = str;
            z = true;
        }
        ppa.a.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(ppa.h));
        pjk pjk = ppa.d;
        if (pjk != null && (z || ppa.h)) {
            pjk.a();
        }
        ppa.h = false;
    }
}
