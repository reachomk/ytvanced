package defpackage;

/* renamed from: alrb */
final /* synthetic */ class alrb implements Runnable {
    private final afsw a;
    private final Object b;

    alrb(afsw afsw, Object obj) {
        this.a = afsw;
        this.b = obj;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
