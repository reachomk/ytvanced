package defpackage;

/* renamed from: aabw */
final /* synthetic */ class aabw implements Runnable {
    private final aabs a;
    private final String b;

    aabw(aabs aabs, String str) {
        this.a = aabs;
        this.b = str;
    }

    public final void run() {
        aabs aabs = this.a;
        aabs.b.remove(this.b);
    }
}
