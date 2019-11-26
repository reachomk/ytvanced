package defpackage;

/* renamed from: ppg */
final class ppg implements Runnable {
    private final /* synthetic */ ppa a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    ppg(ppa ppa, String str, String str2) {
        this.a = ppa;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        pjj pjj;
        synchronized (this.a.e) {
            pjj = (pjj) this.a.e.get(this.b);
        }
        if (pjj != null) {
            pjj.a(this.a.c, this.b, this.c);
            return;
        }
        ppa.a.a("Discarded message for unknown namespace '%s'", this.b);
    }
}
