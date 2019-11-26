package defpackage;

/* renamed from: aabz */
final /* synthetic */ class aabz implements Runnable {
    private final aabs a;
    private final Class b;

    aabz(aabs aabs, Class cls) {
        this.a = aabs;
        this.b = cls;
    }

    public final void run() {
        aabs aabs = this.a;
        aabs.c.remove(this.b);
    }
}
