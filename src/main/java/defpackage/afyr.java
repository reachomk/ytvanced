package defpackage;

/* renamed from: afyr */
final class afyr implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ afyp b;

    afyr(afyp afyp, String str) {
        this.b = afyp;
        this.a = str;
    }

    public final void run() {
        agwc agwc = (agwc) this.b.a.get();
        if (this.a.equals(agwc.c())) {
            ((aguh) this.b.b.get()).b(this.a, agwc.b());
        }
    }
}
