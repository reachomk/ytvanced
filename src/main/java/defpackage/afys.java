package defpackage;

/* renamed from: afys */
final class afys implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ afyp b;

    afys(afyp afyp, String str) {
        this.b = afyp;
        this.a = str;
    }

    public final void run() {
        agwc agwc = (agwc) this.b.a.get();
        if (this.a.equals(agwc.c())) {
            ((aguh) this.b.b.get()).a(this.a, agwc.b());
        }
    }
}
