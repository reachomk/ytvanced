package defpackage;

/* renamed from: ahtx */
final /* synthetic */ class ahtx implements Runnable {
    private final ahtv a;

    ahtx(ahtv ahtv) {
        this.a = ahtv;
    }

    public final void run() {
        ahtv ahtv = this.a;
        aiff aiff = ahtv.i;
        if (aiff != null && ahtv.g != null) {
            aiff.b();
            ahtv.g.aJ_();
        }
    }
}
