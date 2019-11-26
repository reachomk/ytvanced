package defpackage;

/* renamed from: ahtw */
final /* synthetic */ class ahtw implements Runnable {
    private final ahtv a;

    ahtw(ahtv ahtv) {
        this.a = ahtv;
    }

    public final void run() {
        ahtv ahtv = this.a;
        aiff aiff = ahtv.i;
        if (aiff != null && ahtv.g != null) {
            aiff.a();
            ahtv.g.aJ_();
        }
    }
}
