package defpackage;

/* renamed from: ahty */
final /* synthetic */ class ahty implements Runnable {
    private final ahtv a;
    private final int b;

    ahty(ahtv ahtv, int i) {
        this.a = ahtv;
        this.b = i;
    }

    public final void run() {
        ahtv ahtv = this.a;
        int i = this.b;
        aihy aihy = ahtv.h;
        if (aihy != null) {
            aihy.a(i);
        }
    }
}
