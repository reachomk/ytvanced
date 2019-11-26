package defpackage;

/* renamed from: ahtz */
final /* synthetic */ class ahtz implements Runnable {
    private final ahtv a;
    private final long b;

    ahtz(ahtv ahtv, long j) {
        this.a = ahtv;
        this.b = j;
    }

    public final void run() {
        ahtv ahtv = this.a;
        long j = this.b;
        aibe aibe = ahtv.g;
        if (aibe != null) {
            aibe.b(j);
        }
    }
}
