package defpackage;

/* renamed from: noi */
final class noi implements Runnable {
    private final /* synthetic */ nom a;
    private final /* synthetic */ int b;
    private final /* synthetic */ long c;
    private final /* synthetic */ noc d;

    noi(noc noc, nom nom, int i, long j) {
        this.d = noc;
        this.a = nom;
        this.b = i;
        this.c = j;
    }

    public final void run() {
        noc noc = this.d;
        noc.c.a(noc.b, this.a, this.b, this.c / 1000);
    }
}
