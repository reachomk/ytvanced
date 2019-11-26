package defpackage;

/* renamed from: alqy */
final /* synthetic */ class alqy implements Runnable {
    private final alqx a;
    private final afsw b;
    private final Object c;

    alqy(alqx alqx, afsw afsw, Object obj) {
        this.a = alqx;
        this.b = afsw;
        this.c = obj;
    }

    public final void run() {
        this.a.a.execute(new alrb(this.b, this.c));
    }
}
