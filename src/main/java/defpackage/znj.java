package defpackage;

/* renamed from: znj */
final /* synthetic */ class znj implements zmo {
    private final znf a;
    private final zmr b;

    znj(znf znf, zmr zmr) {
        this.a = znf;
        this.b = zmr;
    }

    public final void a() {
        znf znf = this.a;
        zmr zmr = this.b;
        synchronized (znf.b) {
            znf.b.remove(zmr);
        }
    }
}
